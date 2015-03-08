package org.yosneaker.common.tools.exception;

public class HttpException extends Exception {
	public static final long serialVersionUID = 1L;
	private String id;
	private int code;
    private String contentType;
    private String message;
    private String url;
    /**
     *
     * @param id 请求资源id
     * @param code 响应代码
     * @param contentType 响应类型
     * @param message //响应消息
     * @param url //请求地址
     */
	public HttpException(String id, int code, String contentType,
			String message, String url) {
		super();
		this.id = id;
		this.code = code;
		this.contentType = contentType;
		this.message = message;
		this.url = url;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
