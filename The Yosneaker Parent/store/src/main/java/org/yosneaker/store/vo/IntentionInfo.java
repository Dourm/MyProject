package org.yosneaker.store.vo;

import java.util.List;

import org.yosneaker.store.dto.Account;

public class IntentionInfo {
	 private int wantCount;
	 
	 private int buyCount;
	 
	 private List<Account> wantAccounts;
	 
	 private List<Account> buyAccounts;

	public int getWantCount() {
		return wantCount;
	}

	public void setWantCount(int wantCount) {
		this.wantCount = wantCount;
	}

	public int getBuyCount() {
		return buyCount;
	}

	public void setBuyCount(int buyCount) {
		this.buyCount = buyCount;
	}

	public List<Account> getWantAccounts() {
		return wantAccounts;
	}

	public void setWantAccounts(List<Account> wantAccounts) {
		this.wantAccounts = wantAccounts;
	}

	public List<Account> getBuyAccounts() {
		return buyAccounts;
	}

	public void setBuyAccounts(List<Account> buyAccounts) {
		this.buyAccounts = buyAccounts;
	}
}
