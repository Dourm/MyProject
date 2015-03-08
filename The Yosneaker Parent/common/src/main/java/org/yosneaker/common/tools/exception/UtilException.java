package org.yosneaker.common.tools.exception;

import org.yosneaker.common.tools.StrUtil;


/**
 * 类描述：UtilException </br>
 * 修改人： Rainy(yang.lin)</br>
 * 创建时间：2015年2月2日 上午11:03:54</br>
 * 修改备注： </br>
 * @version</br>
 */
public class UtilException extends RuntimeException{
	private static final long serialVersionUID = 8247610319171014183L;

	public UtilException(Throwable e) {
		super(e.getMessage(), e);
	}
	
	public UtilException(String message) {
		super(message);
	}
	
	public UtilException(String messageTemplate, Object... params) {
		super(StrUtil.format(messageTemplate, params));
	}
	
	public UtilException(String message, Throwable throwable) {
		super(message, throwable);
	}
	
	public UtilException(Throwable throwable, String messageTemplate, Object... params) {
		super(StrUtil.format(messageTemplate, params), throwable);
	}
}
