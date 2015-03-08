package org.yosneaker.common.tools.i18n;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.yosneaker.common.tools.context.ApplicationContextUtils;
import org.yosneaker.common.tools.context.BeanFactoryContext;


public class MessageUtils {

	/**
	 * 返回指定消息类型的消息实例。
	 * 
	 * @param messageType 消息类型。
	 * @param code 对应的Properties中的KEY。
	 * @param args 消息参数。
	 * @return 消息实例。
	 */
	public static Message<String> valueOf(MessageType messageType, String code, Object... args) {
		/*String content = ApplicationContextUtils.getMessage(BeanFactoryContext.currentApplicationContext(), LocaleContextHolder.getLocale(), code, args);
		return new Message<String>(messageType, content);*/
		ApplicationContext ap = BeanFactoryContext.currentApplicationContext();
		Locale lo =  LocaleContextHolder.getLocale();
		String content = ApplicationContextUtils.getMessage(ap,lo, code, args);
		return new Message<String>(messageType, content);
	}
	
	/**
	 * 返回指定消息类型的消息实例。
	 * 
	 * @param messageType 消息类型。
	 * @param content 消息体。
	 * @return 消息实例。
	 */
	public static <T> Message<T> valueOf(MessageType messageType, T content) {
		return new Message<T>(messageType, content);
	}
	
	/**
	 * 返回成功类型的消息实例。
	 * 
	 * @param code 对应的Properties中的KEY。
	 * @param args 消息参数。
	 * @return 消息实例。
	 */
	public static Message<String> success(String code, Object... args) {
		return valueOf(MessageType.SUCCESS, code, args);
	}
	
	/**
	 * 返回错误类型的消息实例。
	 * 
	 * @param code 对应的Properties中的KEY。
	 * @param args 消息参数。
	 * @return 消息实例。
	 */
	public static Message<String> error(String code, Object... args) {
		return valueOf(MessageType.ERROR, code, args);
	}
	
	/**
	 * 返回警告类型的消息实例。
	 * 
	 * @param code 对应的Properties中的KEY。
	 * @param args 消息参数。
	 * @return 消息实例。
	 */
	public static Message<String> warn(String code, Object... args) {
		return valueOf(MessageType.WARN, code, args);
	}
}
