package org.yosneaker.store.dto;

import java.util.Date;
import java.util.List;

public class Article {

	/**
	 * id
	 */
	private Integer articleId;

	/**
	 * 标题
	 */
    private String articleTitle;

    /**
     * 简介
     */
    private String articleDescription;

    /**
     * 总评
     */
    private String articleComment;

    /**
     * 星级
     */
    private Integer articleLevel;

    /**
     * 封面图
     */
    private String articleImages;

    /**
     * 作者id
     */
    private Integer articleAuthorId;

    /**
     * 创建时间
     */
    private Date articleCreateTime;

    /**
     * 阅读数
     */
    private Integer articleReadCount;

    /**
     * 评论数
     */
    private Integer articleCommentCount;

    /**
     * 喜欢数
     */
    private Integer articleCommentLikeCount;

    /**
     * 最后修改时间
     */
    private Date articleLastModify;
    
    /**
     * 测评项
     */
    private List<ArticleItem> items;
    
    public List<ArticleItem> getItems() {
		return items;
	}

	public void setItems(List<ArticleItem> items) {
		this.items = items;
	}

	public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public String getArticleDescription() {
        return articleDescription;
    }

    public void setArticleDescription(String articleDescription) {
        this.articleDescription = articleDescription == null ? null : articleDescription.trim();
    }

    public String getArticleComment() {
        return articleComment;
    }

    public void setArticleComment(String articleComment) {
        this.articleComment = articleComment == null ? null : articleComment.trim();
    }

    public Integer getArticleLevel() {
        return articleLevel;
    }

    public void setArticleLevel(Integer articleLevel) {
        this.articleLevel = articleLevel;
    }

    public String getArticleImages() {
        return articleImages;
    }

    public void setArticleImages(String articleImages) {
        this.articleImages = articleImages == null ? null : articleImages.trim();
    }

    public Integer getArticleAuthorId() {
        return articleAuthorId;
    }

    public void setArticleAuthorId(Integer articleAuthorId) {
        this.articleAuthorId = articleAuthorId;
    }

    public Date getArticleCreateTime() {
        return articleCreateTime;
    }

    public void setArticleCreateTime(Date articleCreateTime) {
        this.articleCreateTime = articleCreateTime;
    }

    public Integer getArticleReadCount() {
        return articleReadCount;
    }

    public void setArticleReadCount(Integer articleReadCount) {
        this.articleReadCount = articleReadCount;
    }

    public Integer getArticleCommentCount() {
        return articleCommentCount;
    }

    public void setArticleCommentCount(Integer articleCommentCount) {
        this.articleCommentCount = articleCommentCount;
    }

    public Integer getArticleCommentLikeCount() {
        return articleCommentLikeCount;
    }

    public void setArticleCommentLikeCount(Integer articleCommentLikeCount) {
        this.articleCommentLikeCount = articleCommentLikeCount;
    }

    public Date getArticleLastModify() {
        return articleLastModify;
    }

    public void setArticleLastModify(Date articleLastModify) {
        this.articleLastModify = articleLastModify;
    }
}