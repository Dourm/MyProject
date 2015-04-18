package org.yosneaker.store.dao;

import org.springframework.stereotype.Repository;

import org.yosneaker.store.dto.Account;
import org.yosneaker.store.dto.AccountExample;
import org.yosneaker.store.common.SimpleMybatisSupport;
/**
 * 类描述:帐号
 * 创建人:Rainy
 * 创建时间:2015-04-18 10:25:34
 * @version
 */
 
@Repository("account")
public class AccountDao extends SimpleMybatisSupport<Account, Integer, AccountExample>{
	
	@Override
    public String getMybatisMapperNamesapce() {
        return "org.yosneaker.store.dao.AccountMapper";
    }


}