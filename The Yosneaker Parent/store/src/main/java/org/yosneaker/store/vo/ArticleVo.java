package org.yosneaker.store.vo;

import java.util.List;

import org.yosneaker.store.dto.Article;
import org.yosneaker.store.dto.ArticleItem;

public class ArticleVo  extends Article{
	private List<ArticleItem> items;

	public List<ArticleItem> getItems() {
		return items;
	}

	public void setItems(List<ArticleItem> items) {
		this.items = items;
	}
}
