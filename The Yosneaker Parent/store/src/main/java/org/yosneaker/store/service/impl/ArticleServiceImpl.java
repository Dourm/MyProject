package org.yosneaker.store.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yosneaker.store.common.Page;
import org.yosneaker.store.dao.AccountInfoDao;
import org.yosneaker.store.dao.ArticleDao;
import org.yosneaker.store.dao.ArticleItemDao;
import org.yosneaker.store.dao.BrandDao;
import org.yosneaker.store.dao.CommentDao;
import org.yosneaker.store.dao.ModelDao;
import org.yosneaker.store.dto.AccountInfo;
import org.yosneaker.store.dto.Article;
import org.yosneaker.store.dto.ArticleExample;
import org.yosneaker.store.dto.ArticleItem;
import org.yosneaker.store.dto.ArticleItemExample;
import org.yosneaker.store.service.ArticleService;
import org.yosneaker.store.vo.ArticleDetails;
import org.yosneaker.store.vo.ArticleVo;

@Service("articleServiceImpl")
@Transactional
public class ArticleServiceImpl  implements ArticleService {
	@Resource
	ArticleItemDao articleItemDao;
	
	@Resource
	ArticleDao articleDao;
	
	@Resource
	CommentDao commentDao;
	
	@Resource
	BrandDao bandDao;
	
	@Resource
	ModelDao modelDao;
	
	@Resource
	AccountInfoDao accountInfoDao;
	
	
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
	
	@Override
	public int count() {
		ArticleExample example = new ArticleExample();
		return articleDao.countByExample(example);
	}

	@Override
	public List<Article> getPublicList(Page page) {
		ArticleExample example = new ArticleExample();
		example.setPage(page);
		return articleDao.selectByExample(example);
	}

	@Override
	public ArticleDetails getDetailsById(int id) {
		ArticleDetails articleDetails = new ArticleDetails();
		
		Article article = articleDao.selectByPrimaryKey(id);
		articleDetails.setArticle(article);
		
		ArticleItemExample articleItemExample = new ArticleItemExample();
		articleItemExample.createCriteria().andItemArticleIdEqualTo(id);
		List<ArticleItem> items =  articleItemDao.selectByExample(articleItemExample);
		articleDetails.setItems(items);
		
		AccountInfo account = accountInfoDao.selectByPrimaryKey(article.getArticleAuthorId());
		articleDetails.setAuthorInfo(account);
		
		return articleDetails;
	}
}
