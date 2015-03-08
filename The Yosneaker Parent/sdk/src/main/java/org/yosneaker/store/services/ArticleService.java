package org.yosneaker.store.services;

import org.yosneaker.store.dto.Article;
import org.yosneaker.store.dto.ArticleItem;

public interface ArticleService {
	public Article create(String title);
	
	public Article addArticleItem(ArticleItem item);
	
	public Article addDescription(String description);
	
}
