package org.yosneaker.store.dao;

import org.springframework.stereotype.Repository;

import org.yosneaker.store.dto.Intention;
import org.yosneaker.store.dto.IntentionExample;
import org.yosneaker.store.common.SimpleMybatisSupport;
/**
 * 类描述:意向
 * 创建人:Rainy
 * 创建时间:2015-04-18 15:58:58
 * @version
 */
 
@Repository("intention")
public class IntentionDao extends SimpleMybatisSupport<Intention, Integer, IntentionExample>{
	
	@Override
    public String getMybatisMapperNamesapce() {
        return "org.yosneaker.store.dao.IntentionMapper";
    }


}