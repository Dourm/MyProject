package org.yosneaker.store.service;

import java.util.List;

import org.yosneaker.store.dto.Comment;
import org.yosneaker.store.dto.CommentExample;

/**
 * 类名称:ICommentService<br/>
 * 类描述:评论<br/>
 * 创建人:Rainy<br/>
 * 创建时间:2015-03-08 20:21:29<br/>
 * @version
 */
public interface ICommentService {
	
	/**
	 * 保存记录
	 * @param record
	 * @return
	 */
	public boolean insert(Comment record);
	/**
	 * 删除记录
	 * @param id
	 * @return
	 */
	public boolean delete(Integer id);
	/**
	 * 获取评论类型
	 * @param example
	 * @return
	 */
	public List<Comment> getList(CommentExample example);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean update(Comment record);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean updateByPrimaryKeySelective(Comment record);
	/**
	 * 获取记录
	 * @param id
	 * @return
	 */
	public Comment getById(Integer id);
	/**
	 * 统计数量
	 * @param Comment record
	 * @return
	 */
	int countByExample(CommentExample example);
	
}
