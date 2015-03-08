package org.yosneaker.store.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yosneaker.common.tools.ObjectUtils;
import org.yosneaker.store.dao.ArticleItemDao;
import org.yosneaker.store.dto.ArticleItem;
import org.yosneaker.store.dto.ArticleItemExample;
import org.yosneaker.store.service.IArticleItemService;


/**
 * 类名称:ArticleItemService
 * 类描述:测评项
 * 创建人:Rainy
 * 创建时间:2015-03-08 20:18:40
 * @version
 */
@Service
@Transactional
public class ArticleItemService implements IArticleItemService {
	
	@Resource
	ArticleItemDao articleItemDao;
	
	@Override
	public boolean insert(ArticleItem record) {
		boolean flag = false;		
		int i = articleItemDao.insert(record);
		if(i>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean delete(Integer id) {
		boolean flag = false;
		if(ObjectUtils.isNotEmpty(id)){
			if(articleItemDao.deleteByPrimaryKey(id)>0){
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public List<ArticleItem> getList(ArticleItemExample example) {
		return articleItemDao.selectByExample(example);
	}

	@Override
	public boolean update(ArticleItem record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getItemId())){
			if(articleItemDao.updateByPrimaryKey(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public boolean updateByPrimaryKeySelective(ArticleItem record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getItemId())){
			if(articleItemDao.updateByPrimaryKeySelective(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public ArticleItem getById(Integer id) {
		return articleItemDao.selectByPrimaryKey(id);
	}

	@Override
	public int countByExample(ArticleItemExample example) {
		return articleItemDao.countByExample(example);
	}
	
	}
