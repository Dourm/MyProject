package org.yosneaker.store.service;

import java.util.List;

import org.yosneaker.store.common.Page;
import org.yosneaker.store.dto.Article;
import org.yosneaker.store.vo.ArticleDetails;
import org.yosneaker.store.vo.ArticleVo;

public interface ArticleService {
public  boolean insertArticleAndItems(ArticleVo article);
	
	/**
	 * 喜欢
	* @Title: addLikeCount
	* @Description: TODO
	* @param @param id
	* @param @return
	* @return int
	* @throws
	 */
	public int addLikeCount(int id);
	
	/**
	 * 统计数量
	 * @param Article record
	 * @return
	 */
	int count();
	
	/**
	 * 获热门帖子
	* @Title: getPublicList
	* @Description: TODO
	* @param @return
	* @return List<Article>
	* @throws
	 */
	public List<Article> getPublicList(Page page);
	
	/**
	 * 获取详情信息
	* @Title: getDetailsById
	* @Description: TODO
	* @param @param id
	* @param @return
	* @return Article
	* @throws
	 */
	public ArticleDetails getDetailsById(int id);
}
