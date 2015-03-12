package org.yosneaker.store.dto;

public class AccountInfo {
    private Integer accountInformationId;

    private Integer accountInformationAccountId;

    private Float accountInformationStature;

    private Integer accountInformationAge;

    private Float accountInformationWeight;

    private Float accountInformationBounce;

    private String accountInformationPosition;

    private String accountInformationAbility;

    public Integer getAccountInformationId() {
        return accountInformationId;
    }

    public void setAccountInformationId(Integer accountInformationId) {
        this.accountInformationId = accountInformationId;
    }

    public Integer getAccountInformationAccountId() {
        return accountInformationAccountId;
    }

    public void setAccountInformationAccountId(Integer accountInformationAccountId) {
        this.accountInformationAccountId = accountInformationAccountId;
    }

    public Float getAccountInformationStature() {
        return accountInformationStature;
    }

    public void setAccountInformationStature(Float accountInformationStature) {
        this.accountInformationStature = accountInformationStature;
    }

    public Integer getAccountInformationAge() {
        return accountInformationAge;
    }

    public void setAccountInformationAge(Integer accountInformationAge) {
        this.accountInformationAge = accountInformationAge;
    }

    public Float getAccountInformationWeight() {
        return accountInformationWeight;
    }

    public void setAccountInformationWeight(Float accountInformationWeight) {
        this.accountInformationWeight = accountInformationWeight;
    }

    public Float getAccountInformationBounce() {
        return accountInformationBounce;
    }

    public void setAccountInformationBounce(Float accountInformationBounce) {
        this.accountInformationBounce = accountInformationBounce;
    }

    public String getAccountInformationPosition() {
        return accountInformationPosition;
    }

    public void setAccountInformationPosition(String accountInformationPosition) {
        this.accountInformationPosition = accountInformationPosition == null ? null : accountInformationPosition.trim();
    }

    public String getAccountInformationAbility() {
        return accountInformationAbility;
    }

    public void setAccountInformationAbility(String accountInformationAbility) {
        this.accountInformationAbility = accountInformationAbility == null ? null : accountInformationAbility.trim();
    }
}