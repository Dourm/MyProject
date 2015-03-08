package org.yosneaker.upload.biz.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.omg.CORBA.SystemException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;
import org.yosneaker.common.tools.DateUtil;
import org.yosneaker.upload.biz.StorageBiz;
import org.yosneaker.upload.exception.ImageInfoException;

@Service("fileSystemStorageBiz")
public class FileSystemStorageBiz implements StorageBiz {
	
	@Value("${resource.directory}")
	private String resourceDirectory;
	@Override
	public String uploadResource(String extension, byte[] resourceData,
			Map<String, String> metadata) throws FileSystemException {
		File sourceImageFile = new FileSystemResource(getRandomFilePath(extension)).getFile();
		try {
			FileUtils.writeByteArrayToFile(sourceImageFile, resourceData);
			return sourceImageFile.getAbsolutePath();
		} catch (IOException e) {
			throw new ImageInfoException(e.getMessage(), e);
		} finally {
		} 
	}

	@Override
	public Map<String, String> getMetadataByPath(String resourcePath)
			throws FileSystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteResourceByPath(String resourcePath)
			throws SystemException {
		// TODO Auto-generated method stub

	}

	private String getRandomFilePath(String imageFormat) {
		return resourceDirectory + File.separator + getDate() + File.separator+UUID.randomUUID().toString() + "." + imageFormat;
	}
	
	private String getDate(){
		return DateUtil.format(new Date(), DateUtil.YYYY_MM_DD);
	}

	@Override
	public byte[] getResourceByPath(String resourcePath)
			throws FileSystemException {
		// TODO Auto-generated method stub
		return null;
	}
}
