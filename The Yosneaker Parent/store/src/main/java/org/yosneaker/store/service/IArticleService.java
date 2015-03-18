package org.yosneaker.store.service;

import java.util.List;

import org.yosneaker.store.dto.Article;
import org.yosneaker.store.dto.ArticleExample;

/**
 * 类名称:IArticleService<br/>
 * 类描述:测评<br/>
 * 创建人:Rainy<br/>
 * 创建时间:2015-03-17 23:23:46<br/>
 * @version
 */
public interface IArticleService {
	
	/**
	 * 保存记录
	 * @param record
	 * @return
	 */
	public boolean insert(Article record);
	/**
	 * 删除记录
	 * @param id
	 * @return
	 */
	public boolean delete(Integer id);
	/**
	 * 获取测评类型
	 * @param example
	 * @return
	 */
	public List<Article> getList(ArticleExample example);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean update(Article record);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean updateByPrimaryKeySelective(Article record);
	/**
	 * 获取记录
	 * @param id
	 * @return
	 */
	public Article getById(Integer id);
	/**
	 * 统计数量
	 * @param Article record
	 * @return
	 */
	int countByExample(ArticleExample example);
	
}
