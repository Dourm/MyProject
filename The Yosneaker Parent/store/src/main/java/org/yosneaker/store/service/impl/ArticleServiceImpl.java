package org.yosneaker.store.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yosneaker.store.dao.ArticleDao;
import org.yosneaker.store.dao.ArticleItemDao;
import org.yosneaker.store.dto.Article;
import org.yosneaker.store.dto.ArticleItem;
import org.yosneaker.store.service.ArticleService;
import org.yosneaker.store.vo.ArticleVo;

@Service("articleServiceImpl")
@Transactional
public class ArticleServiceImpl  implements ArticleService {
	@Resource
	ArticleItemDao articleItemDao;
	
	@Resource
	ArticleDao articleDao;
	@Override
	public int addLikeCount(int id) {
		articleDao.updateLikeCount(id);
		Article article =  articleDao.selectByPrimaryKey(id);
		return article.getArticleCommentLikeCount();
	}

	@Override
	public boolean insertArticleAndItems(ArticleVo article) {
		boolean flag = true;
		int i = articleDao.insert(article);
		for(ArticleItem item :article.getItems()){
			item.setItemArticleId(article.getArticleId());
			i += articleItemDao.insert(item);
		}
		if(i==0){
			flag = false;
		}
		return flag;
	}
}
