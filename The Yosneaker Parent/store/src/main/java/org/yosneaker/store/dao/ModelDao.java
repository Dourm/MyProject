package org.yosneaker.store.dao;

import org.springframework.stereotype.Repository;

import org.yosneaker.store.dto.Model;
import org.yosneaker.store.dto.ModelExample;
import org.yosneaker.store.common.SimpleMybatisSupport;
/**
 * 类描述:Model
 * 创建人:Rainy
 * 创建时间:2015-03-17 22:12:20
 * @version
 */
 
@Repository("model")
public class ModelDao extends SimpleMybatisSupport<Model, Integer, ModelExample>{
	
	@Override
    public String getMybatisMapperNamesapce() {
        return "org.yosneaker.store.dao.ModelMapper";
    }


}