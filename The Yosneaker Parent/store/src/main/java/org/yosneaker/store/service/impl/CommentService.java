package org.yosneaker.store.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yosneaker.common.tools.ObjectUtils;
import org.yosneaker.store.dao.CommentDao;
import org.yosneaker.store.dto.Comment;
import org.yosneaker.store.dto.CommentExample;
import org.yosneaker.store.service.ICommentService;


/**
 * 类名称:CommentService
 * 类描述:评论
 * 创建人:Rainy
 * 创建时间:2015-03-08 20:21:29
 * @version
 */
@Service
@Transactional
public class CommentService implements ICommentService {
	
	@Resource
	CommentDao commentDao;
	
	@Override
	public boolean insert(Comment record) {
		boolean flag = false;		
		int i = commentDao.insert(record);
		if(i>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean delete(Integer id) {
		boolean flag = false;
		if(ObjectUtils.isNotEmpty(id)){
			if(commentDao.deleteByPrimaryKey(id)>0){
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public List<Comment> getList(CommentExample example) {
		return commentDao.selectByExample(example);
	}

	@Override
	public boolean update(Comment record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getArticleCommentId())){
			if(commentDao.updateByPrimaryKey(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public boolean updateByPrimaryKeySelective(Comment record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getArticleCommentId())){
			if(commentDao.updateByPrimaryKeySelective(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public Comment getById(Integer id) {
		return commentDao.selectByPrimaryKey(id);
	}

	@Override
	public int countByExample(CommentExample example) {
		return commentDao.countByExample(example);
	}
	
	}
