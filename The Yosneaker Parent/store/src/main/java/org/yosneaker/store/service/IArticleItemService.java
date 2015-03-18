package org.yosneaker.store.service;

import java.util.List;

import org.yosneaker.store.dto.ArticleItem;
import org.yosneaker.store.dto.ArticleItemExample;

/**
 * 类名称:IArticleItemService<br/>
 * 类描述:测评项<br/>
 * 创建人:Rainy<br/>
 * 创建时间:2015-03-08 20:18:40<br/>
 * @version
 */
public interface IArticleItemService {
	
	/**
	 * 保存记录
	 * @param record
	 * @return
	 */
	public boolean insert(ArticleItem record);
	/**
	 * 删除记录
	 * @param id
	 * @return
	 */
	public boolean delete(Integer id);
	/**
	 * 获取测评项类型
	 * @param example
	 * @return
	 */
	public List<ArticleItem> getList(ArticleItemExample example);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean update(ArticleItem record);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean updateByPrimaryKeySelective(ArticleItem record);
	/**
	 * 获取记录
	 * @param id
	 * @return
	 */
	public ArticleItem getById(Integer id);
	/**
	 * 统计数量
	 * @param ArticleItem record
	 * @return
	 */
	int countByExample(ArticleItemExample example);
	
}
