package org.yosneaker.store.dao;

import org.springframework.stereotype.Repository;

import org.yosneaker.store.dto.ArticleItem;
import org.yosneaker.store.dto.ArticleItemExample;
import org.yosneaker.store.common.SimpleMybatisSupport;
/**
 * 类描述:测评项
 * 创建人:Rainy
 * 创建时间:2015-03-08 20:18:40
 * @version
 */
 
@Repository("articleItem")
public class ArticleItemDao extends SimpleMybatisSupport<ArticleItem, Integer, ArticleItemExample>{
	
	@Override
    public String getMybatisMapperNamesapce() {
        return "org.yosneaker.store.dao.ArticleItemMapper";
    }


}