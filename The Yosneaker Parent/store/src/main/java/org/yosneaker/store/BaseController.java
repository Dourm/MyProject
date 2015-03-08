package org.yosneaker.store;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;




public class BaseController {
	
	protected static final String SYS_USER_SESSION_KEY = "sysUserInfo"; //系统用户 Session key
	
	protected static final String USER_SESSION_KEY = "userInfo"; //用户Session key
	
	protected final static String SESSID_KEY = "s85612602367782310589";  //passport登录成功后返回的Session key

	

	public static HttpSession getSession() { 
		HttpSession session = null; 
		try { 
		    session = getRequest().getSession(); 
		} catch (Exception e) {} 
		    return session; 
		} 

	public static HttpServletRequest getRequest() { 
		ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder
		.getRequestAttributes(); 
		return attrs.getRequest(); 
	}
	
/*	*//**
	 * 前端-获取session中用户
	 * @return
	 *//*
	public  Account getSessionUser(){
		//session中的 用户信息
		Account userInfo=(Account) getSession().getAttribute(USER_SESSION_KEY);
		return userInfo;
	}*/
	
	/**
	 * 前端-获取用户id
	 * @return
	 */
/*	public  Integer getSessionUserId(){
		//session中的 用户信息
		Account user=this.getSessionUser();
		if(user!=null){
			return user.getAccountId();
		}else{
			return null;
		}
			
	}*/
	
	public static <T> void setSession(String key, T sessionValue) {
		getSession().setAttribute(key, sessionValue);
	}
	
	public static Object getSessionValue(String key) {
		return getSession().getAttribute(key);
	}
	
	public String getIpAddr(HttpServletRequest request) {  
	    String ip = request.getHeader("x-forwarded-for");  
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	        ip = request.getHeader("Proxy-Client-IP");  
	    }  
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	        ip = request.getHeader("WL-Proxy-Client-IP");  
	    }  
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	        ip = request.getRemoteAddr();  
	    }  
	    return ip;  
	}   

}
