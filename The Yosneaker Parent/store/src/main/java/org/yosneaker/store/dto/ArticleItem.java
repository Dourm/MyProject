package org.yosneaker.store.dto;

public class ArticleItem {
    private Integer itemId;

    private String itemTitle;

    private Integer itemLevel;

    private String itemContent;

    private String itemImages;

    private Integer itemArticleId;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle == null ? null : itemTitle.trim();
    }

    public Integer getItemLevel() {
        return itemLevel;
    }

    public void setItemLevel(Integer itemLevel) {
        this.itemLevel = itemLevel;
    }

    public String getItemContent() {
        return itemContent;
    }

    public void setItemContent(String itemContent) {
        this.itemContent = itemContent == null ? null : itemContent.trim();
    }

    public String getItemImages() {
        return itemImages;
    }

    public void setItemImages(String itemImages) {
        this.itemImages = itemImages == null ? null : itemImages.trim();
    }

    public Integer getItemArticleId() {
        return itemArticleId;
    }

    public void setItemArticleId(Integer itemArticleId) {
        this.itemArticleId = itemArticleId;
    }
}