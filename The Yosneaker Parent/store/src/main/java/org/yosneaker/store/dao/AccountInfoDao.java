package org.yosneaker.store.dao;

import org.springframework.stereotype.Repository;

import org.yosneaker.store.dto.AccountInfo;
import org.yosneaker.store.dto.AccountInfoExample;
import org.yosneaker.store.common.SimpleMybatisSupport;
/**
 * 类描述:个人数据
 * 创建人:Rainy
 * 创建时间:2015-03-12 23:04:33
 * @version
 */
 
@Repository("accountInfo")
public class AccountInfoDao extends SimpleMybatisSupport<AccountInfo, Integer, AccountInfoExample>{
	
	@Override
    public String getMybatisMapperNamesapce() {
        return "org.yosneaker.store.dao.AccountInfoMapper";
    }


}