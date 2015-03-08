package org.yosneaker.upload.biz;

import java.nio.file.FileSystemException;
import java.util.Map;

public interface StorageBiz {

	String uploadResource(String extension, byte[] resourceData, Map<String, String> metadata) throws FileSystemException;
	
	Map<String, String> getMetadataByPath(String resourcePath) throws FileSystemException;
	
	void deleteResourceByPath(String resourcePath) throws FileSystemException;

	byte[] getResourceByPath(String resourcePath) throws FileSystemException;
}
