package org.yosneaker.store.dao;

import org.springframework.stereotype.Repository;

import org.yosneaker.store.dto.Brand;
import org.yosneaker.store.dto.BrandExample;
import org.yosneaker.store.common.SimpleMybatisSupport;
/**
 * 类描述:品牌
 * 创建人:Rainy
 * 创建时间:2015-03-12 22:45:25
 * @version
 */
 
@Repository("brand")
public class BrandDao extends SimpleMybatisSupport<Brand, Integer, BrandExample>{
	
	@Override
    public String getMybatisMapperNamesapce() {
        return "org.yosneaker.store.dao.BrandMapper";
    }


}