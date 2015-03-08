package org.yosneaker.upload.exception;

import org.springframework.core.NestedRuntimeException;


/**
 * 图片信息异常。
 * 
 * @author Daniel Li
 * @since 18 Jun 2013
 */
public class ImageInfoException extends NestedRuntimeException {
	
	private static final long serialVersionUID = 3522360189078014666L;

	public ImageInfoException(String message) {
		super(message);
	}

	public ImageInfoException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
