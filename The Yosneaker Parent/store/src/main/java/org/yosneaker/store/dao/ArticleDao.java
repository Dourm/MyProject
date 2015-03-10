package org.yosneaker.store.dao;

import org.springframework.stereotype.Repository;
import org.yosneaker.store.common.SimpleMybatisSupport;
import org.yosneaker.store.dto.Article;
import org.yosneaker.store.dto.ArticleExample;
/**
 * 类描述:测评
 * 创建人:Rainy
 * 创建时间:2015-03-08 20:13:34
 * @version
 */
 
@Repository("article")
public class ArticleDao extends SimpleMybatisSupport<Article, Integer, ArticleExample>{
	
	@Override
    public String getMybatisMapperNamesapce() {
        return "org.yosneaker.store.dao.ArticleMapper";
    }

	public void updateReadCount(int id) {
		ArticleExample articleExample = new ArticleExample();
		articleExample.createCriteria().andArticleIdEqualTo(id);
		getSqlSession().update(toMybatisStatement("updateReadCount"),articleExample);
	}

	public void updateLikeCount(int id) {
		ArticleExample articleExample = new ArticleExample();
		articleExample.createCriteria().andArticleIdEqualTo(id);
		getSqlSession().update(toMybatisStatement("updateLikeCount"),articleExample);
	}


}