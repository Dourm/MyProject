package org.yosneaker.store.common;  
/**
 *  
 * 类描述：   
 * 创建人：吴杰明 
 * 创建时间：2014-5-11 下午06:01:40   
 * @version
 */
public class Page {  
	//当前页
	private Integer page = 1;
	//页数大小
	private Integer rows = 100;
	// 分页查询开始记录位置  
    private Integer start;  
    // 分页查看下结束位置  
//    private int end;  
    // 查询结果总记录数  
    private int count;  
    // 总共页数  
    private Integer total; 

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
	public Integer getStart() {
		if(this.start!=null){
			return this.start;
		}else{
			return (this.page - 1) * this.rows;
		}
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;  
        this.total = (int) Math.floor((this.count * 1.0d) / this.rows);  
        if (this.count % this.rows != 0) {  
            this.total++;  
        }  
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public int getTotal() {
		return this.total!=null?this.total:(int)Math.ceil((double)this.count/this.rows);
	}
  
}  
