package org.yosneaker.store.vo;

import java.util.List;

import org.yosneaker.store.dto.Account;
import org.yosneaker.store.dto.Article;
import org.yosneaker.store.dto.ArticleItem;
import org.yosneaker.store.dto.Brand;
import org.yosneaker.store.dto.Comment;
import org.yosneaker.store.dto.Model;

public class ArticleDetails {
	private Article article;
	
	private Model model;
	
	private	Brand brand;
	
	private Account authorInfo;
	
	private List<ArticleItem> items;
	
	private List<Comment> hotCommonts;
	
	private IntentionInfo intendInfo;

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}


	public Account getAuthorInfo() {
		return authorInfo;
	}

	public void setAuthorInfo(Account authorInfo) {
		this.authorInfo = authorInfo;
	}

	public List<ArticleItem> getItems() {
		return items;
	}

	public void setItems(List<ArticleItem> items) {
		this.items = items;
	}

	public List<Comment> getHotCommonts() {
		return hotCommonts;
	}

	public void setHotCommonts(List<Comment> hotCommonts) {
		this.hotCommonts = hotCommonts;
	}

	public IntentionInfo getIntendInfo() {
		return intendInfo;
	}

	public void setIntendInfo(IntentionInfo intendInfo) {
		this.intendInfo = intendInfo;
	}
	
	
}
