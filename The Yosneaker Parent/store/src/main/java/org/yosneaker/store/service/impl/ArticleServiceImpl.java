package org.yosneaker.store.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yosneaker.store.IntentionType;
import org.yosneaker.store.common.Page;
import org.yosneaker.store.dao.AccountDao;
import org.yosneaker.store.dao.ArticleDao;
import org.yosneaker.store.dao.ArticleItemDao;
import org.yosneaker.store.dao.BrandDao;
import org.yosneaker.store.dao.CommentDao;
import org.yosneaker.store.dao.IntentionDao;
import org.yosneaker.store.dao.ModelDao;
import org.yosneaker.store.dto.Account;
import org.yosneaker.store.dto.Article;
import org.yosneaker.store.dto.ArticleExample;
import org.yosneaker.store.dto.ArticleItem;
import org.yosneaker.store.dto.ArticleItemExample;
import org.yosneaker.store.dto.Comment;
import org.yosneaker.store.dto.CommentExample;
import org.yosneaker.store.dto.Intention;
import org.yosneaker.store.dto.IntentionExample;
import org.yosneaker.store.service.ArticleService;
import org.yosneaker.store.vo.ArticleDetails;
import org.yosneaker.store.vo.ArticleVo;
import org.yosneaker.store.vo.IntentionInfo;

import com.google.common.collect.Lists;

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
	AccountDao accountDao;
	
	@Resource
	IntentionDao intentionDao;
	
	
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
		
		//根据id获取测评
		Article article = articleDao.selectByPrimaryKey(id);
		articleDetails.setArticle(article);
		
		ArticleItemExample articleItemExample = new ArticleItemExample();
		articleItemExample.createCriteria().andItemArticleIdEqualTo(id);
		List<ArticleItem> items =  articleItemDao.selectByExample(articleItemExample);
		articleDetails.setItems(items);
		
		//获取热门评论
		CommentExample commentExample = new CommentExample();
		commentExample.createCriteria().andArticleCommentArticleIdEqualTo(id);
		commentExample.setOrderByClause("article_comment_top_number desc");
		Page page = new Page();
		page.setStart(1);
		page.setRows(3);
		commentExample.setPage(page);
		List<Comment> hotCommonts = commentDao.selectByExample(commentExample);
		articleDetails.setHotCommonts(hotCommonts);
		
		//获取用户信息
		Account account = accountDao.selectByPrimaryKey(article.getArticleAuthorId());
		articleDetails.setAuthorInfo(account);
		
		//获取想入和已入人数
		/////xiang
		IntentionInfo info = new IntentionInfo();
		Page ipage = new Page();
		ipage.setStart(1);
		ipage.setRows(8);
		IntentionExample wantExample = new IntentionExample();
		wantExample.createCriteria().andIntentionModelIdEqualTo(article.getArticleModelId()).andIntentionArticleTypeEqualTo(IntentionType.WANT.getValue());
		info.setWantCount(intentionDao.countByExample(wantExample));
		
		wantExample.setPage(ipage);
		
		List<Intention> wants = intentionDao.selectByExample(wantExample);
		if(wants.size()>0){
			List<Account> accounts = Lists.newArrayList();
			for(Intention item : wants){
				accounts.add(item.getAccount());
			}
			
			info.setWantAccounts(accounts);
		}
		
		
		///have
		IntentionExample buyExample = new IntentionExample();
		buyExample.createCriteria().andIntentionModelIdEqualTo(article.getArticleModelId()).andIntentionArticleTypeEqualTo(IntentionType.BUY.getValue());
		info.setWantCount(intentionDao.countByExample(buyExample));
		
		buyExample.setPage(ipage);
		
		List<Intention> buys = intentionDao.selectByExample(buyExample);
		if(buys.size()>0){
			List<Account> accounts = Lists.newArrayList();
			for(Intention item : buys){
				accounts.add(item.getAccount());
			}
			info.setBuyAccounts(accounts);
		}
		
		articleDetails.setIntendInfo(info);
		
		
		//活得品牌信息
		
		articleDetails.setBrand(bandDao.selectByPrimaryKey(article.getArticleTrademarkId()));
		
		//活得货号
		articleDetails.setModel(modelDao.selectByPrimaryKey(article.getArticleModelId()));
		return articleDetails;
	}

	public ArticleItemDao getArticleItemDao() {
		return articleItemDao;
	}

	public void setArticleItemDao(ArticleItemDao articleItemDao) {
		this.articleItemDao = articleItemDao;
	}

	public ArticleDao getArticleDao() {
		return articleDao;
	}

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	public CommentDao getCommentDao() {
		return commentDao;
	}

	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}

	public BrandDao getBandDao() {
		return bandDao;
	}

	public void setBandDao(BrandDao bandDao) {
		this.bandDao = bandDao;
	}

	public ModelDao getModelDao() {
		return modelDao;
	}

	public void setModelDao(ModelDao modelDao) {
		this.modelDao = modelDao;
	}

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public IntentionDao getIntentionDao() {
		return intentionDao;
	}

	public void setIntentionDao(IntentionDao intentionDao) {
		this.intentionDao = intentionDao;
	}
}
