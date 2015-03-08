package org.yosneaker.store;

import java.util.List;

/**
 * @ClassName: PageData
 * @Description: 分页封装类
 * @author 
 * @date Dec 27, 2014
 * 
 */
public class ResponseBean<T> extends ResponseState{

	private static final long serialVersionUID = -2941694966710297115L;
	private List<T> rows;
	private int total;
	private String pagebar;
	private T t;
	private String keyWord;
	

	public ResponseBean() {

	}
	public ResponseBean(String msg){
		this.msg = msg;
	}
	public ResponseBean(Boolean success,T t,String msg){
		this.success = success;
		this.t = t;
		this.msg = msg;
	}
	public ResponseBean(T t,String msg){
		this.t = t;
		this.msg = msg;
	}
	public ResponseBean(boolean susscess) {
		setSuccess(susscess);
	}
	public ResponseBean(List<T> rows) {
		if(rows!=null){
			this.rows = rows;
			this.total = rows.size();
			setSuccess(true);
		}
	}
	public ResponseBean(int total, List<T> rows) {
		this(total, rows, true);
	}
	
	public ResponseBean(int total, List<T> rows,boolean success) {
		this.rows = rows;
		this.total = total;
		setSuccess(success);
	}
	public ResponseBean(int total, List<T> rows,boolean success,String pagebar) {
		this.rows = rows;
		this.total = total;
		setSuccess(success);
		this.pagebar = pagebar;
	}
	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	public String getPagebar() {
		return pagebar;
	}
	public void setPagebar(String pagebar) {
		this.pagebar = pagebar;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	@Override
	public String toString() {
		return "ResponseBean [rows=" + rows + ", total=" + total + ", pagebar=" + pagebar + ", t=" + t + "]";
	}
}
