package org.yosneaker.store.service;

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
}
