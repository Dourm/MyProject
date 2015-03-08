package org.yosneaker.common.tools.exception;

import org.yosneaker.common.tools.StrUtil;

/**
 * 类描述：SettingException 设置异常 </br>
 * 修改人： Rainy(yang.lin)</br>
 * 创建时间：2015年2月2日 上午11:12:37</br>
 * 修改备注： </br>
 * @version</br>
 */
public class SettingException extends Exception{
	private static final long serialVersionUID = -4134588858314744501L;

	public SettingException(Throwable e) {
		super(e);
	}
	
	public SettingException(String message) {
		super(message);
	}
	
	public SettingException(String messageTemplate, Object... params) {
		super(StrUtil.format(messageTemplate, params));
	}
	
	public SettingException(String message, Throwable throwable) {
		super(message, throwable);
	}
	
	public SettingException(Throwable throwable, String messageTemplate, Object... params) {
		super(StrUtil.format(messageTemplate, params), throwable);
	}
}
