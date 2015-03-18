package org.yosneaker.store.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.yosneaker.common.tools.ObjectUtils;
import org.yosneaker.store.dao.ArticleDao;
import org.yosneaker.store.dto.Article;
import org.yosneaker.store.dto.ArticleExample;
import org.yosneaker.store.service.IArticleService;


/**
 * 类名称:ArticleService
 * 类描述:测评
 * 创建人:Rainy
 * 创建时间:2015-03-17 23:23:46
 * @version
 */
@Service
public class ArticleService implements IArticleService {
	
	@Resource
	ArticleDao articleDao;
	
	@Override
	public boolean insert(Article record) {
		boolean flag = false;		
		int i = articleDao.insert(record);
		if(i>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean delete(Integer id) {
		boolean flag = false;
		if(ObjectUtils.isNotEmpty(id)){
			if(articleDao.deleteByPrimaryKey(id)>0){
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public List<Article> getList(ArticleExample example) {
		return articleDao.selectByExample(example);
	}

	@Override
	public boolean update(Article record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getArticleId())){
			if(articleDao.updateByPrimaryKey(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public boolean updateByPrimaryKeySelective(Article record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getArticleId())){
			if(articleDao.updateByPrimaryKeySelective(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public Article getById(Integer id) {
		return articleDao.selectByPrimaryKey(id);
	}

	@Override
	public int countByExample(ArticleExample example) {
		return articleDao.countByExample(example);
	}
	
	}
