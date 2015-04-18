package org.yosneaker.store.dto;

public class Intention extends IntentionKey {
    private Integer intentionArticleType;
    
    private Account account;

    public Integer getIntentionArticleType() {
        return intentionArticleType;
    }

    public void setIntentionArticleType(Integer intentionArticleType) {
        this.intentionArticleType = intentionArticleType;
    }

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}