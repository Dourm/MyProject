package org.yosneaker.upload.services.impl;

import java.nio.file.FileSystemException;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.yosneaker.upload.biz.StorageBiz;
import org.yosneaker.upload.services.ResourceService;

@Service("resourceServiceImpl")
public class ResourceServiceImpl implements ResourceService {

	@Resource(name = "fastDFSStorageBiz")
	private StorageBiz storageBiz;
	
	@Override
	public String uploadResource(String extension, byte[] resourceData,
			Map<String, String> metadata) throws FileSystemException {
		return storageBiz.uploadResource(extension, resourceData, metadata);
	}

	@Override
	public Map<String, String> getMetadataByPath(String resourcePath)
			throws FileSystemException {
		return null;
	}

	@Override
	public void deleteResourceByPath(String resourcePath)
			throws FileSystemException {
	}
	
	@Override
	public byte[] getResourceByPath(String resourcePath) throws FileSystemException {
		return storageBiz.getResourceByPath(resourcePath);
	}
}
