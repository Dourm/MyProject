package org.yosneaker.common.tools.exception;

import org.yosneaker.common.tools.StrUtil;

/**
 * 类描述：NotInitedException </br>
 * 修改人： Rainy(yang.lin)</br>
 * 创建时间：2015年2月2日 上午11:12:25</br>
 * 修改备注： </br>
 * @version</br>
 */
public class NotInitedException extends RuntimeException{
	private static final long serialVersionUID = 8247610319171014183L;

	public NotInitedException(Throwable e) {
		super(e);
	}
	
	public NotInitedException(String message) {
		super(message);
	}
	
	public NotInitedException(String messageTemplate, Object... params) {
		super(StrUtil.format(messageTemplate, params));
	}
	
	public NotInitedException(String message, Throwable throwable) {
		super(message, throwable);
	}
	
	public NotInitedException(Throwable throwable, String messageTemplate, Object... params) {
		super(StrUtil.format(messageTemplate, params), throwable);
	}
}
