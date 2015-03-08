package org.yosneaker.upload.biz.impl;

import java.nio.file.FileSystemException;
import java.util.Map;

import javax.annotation.Resource;

import org.csource.common.NameValuePair;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.stereotype.Service;
import org.yosneaker.upload.biz.StorageBiz;
import org.yosneaker.upload.support.AbstractStorageClientCallback;
import org.yosneaker.upload.support.AbstractStorageClientReturnedCallback;
import org.yosneaker.upload.support.FastDFSUtils;
import org.yosneaker.upload.support.StorageClientTemplate;

@Service("fastDFSStorageBiz")
public class FastDFSStorageBiz implements StorageBiz {

	@Resource(name = "storageClientTemplate")
	private StorageClientTemplate storageClientTemplate;
	
	@Override
	public String uploadResource(final String extension, final byte[] resourceData, final Map<String, String> metadata) throws FileSystemException {
		return storageClientTemplate.execute(new AbstractStorageClientReturnedCallback<String>() {
			
			@Override
			public String doInStorageClient(TrackerClient trackerClient, TrackerServer trackerServer, StorageServer storageServer) throws Exception {
				StorageClient1 storageClient = FastDFSUtils.newStorageClient1(trackerServer, storageServer);
				String result = storageClient.upload_file1(resourceData, extension, FastDFSUtils.newNameValuePairs(metadata));
				if (result == null) {
					throw new FileSystemException("upload file fail, error code: " + trackerClient.getErrorCode());
				}
				return result;
			}
		});
	}
	
	@Override
	public Map<String, String> getMetadataByPath(final String resourcePath) throws FileSystemException {
		return storageClientTemplate.execute(new AbstractStorageClientReturnedCallback<Map<String, String>>() {
			
			@Override
			public Map<String, String> doInStorageClient(TrackerClient trackerClient, TrackerServer trackerServer, StorageServer storageServer)
					throws Exception {
				StorageClient1 storageClient = FastDFSUtils.newStorageClient1(trackerServer, storageServer);
				NameValuePair[] nameValuePairs = storageClient.get_metadata1(resourcePath);
				return FastDFSUtils.newMapFromNameValuePairs(nameValuePairs);
			}
			
			@Override
			public StorageServer getStorageServer(TrackerClient trackerClient, TrackerServer trackerServer) throws Exception {
				return trackerClient.getFetchStorage1(trackerServer, resourcePath);
			}
		});
	}
	
	@Override
	public void deleteResourceByPath(final String resourcePath) throws FileSystemException {
		storageClientTemplate.execute(new AbstractStorageClientCallback() {
			
			@Override
			public void doInStorageClient(TrackerClient trackerClient, TrackerServer trackerServer, StorageServer storageServer) throws Exception {
				StorageClient1 storageClient = FastDFSUtils.newStorageClient1(trackerServer, storageServer);
				int result = storageClient.delete_file1(resourcePath);
				if (result != 0) {
					throw new FileSystemException("Delete file fail, error code: " + trackerClient.getErrorCode());
				}
			}
			
			@Override
			public StorageServer getStorageServer(TrackerClient trackerClient, TrackerServer trackerServer) throws Exception {
				return trackerClient.getFetchStorage1(trackerServer, resourcePath);
			}
		});
	}
	
	
	@Override
	public byte[] getResourceByPath(final String resourcePath) throws FileSystemException {
		return storageClientTemplate.execute(new AbstractStorageClientReturnedCallback<byte[]>() {
			
			@Override
			public byte[] doInStorageClient(TrackerClient trackerClient, TrackerServer trackerServer, StorageServer storageServer)
					throws Exception {
				StorageClient1 storageClient = FastDFSUtils.newStorageClient1(trackerServer, storageServer);
				return storageClient.download_file1(resourcePath);
			}
			
			@Override
			public StorageServer getStorageServer(TrackerClient trackerClient, TrackerServer trackerServer) throws Exception {
				return trackerClient.getFetchStorage1(trackerServer, resourcePath);
			}
		});
	}
}
