package org.yosneaker.store.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.yosneaker.common.tools.ObjectUtils;
import org.yosneaker.store.dao.ModelDao;
import org.yosneaker.store.dto.Model;
import org.yosneaker.store.dto.ModelExample;
import org.yosneaker.store.service.IModelService;


/**
 * 类名称:ModelService
 * 类描述:Model
 * 创建人:Rainy
 * 创建时间:2015-03-17 22:12:20
 * @version
 */
@Service
public class ModelService implements IModelService {
	
	@Resource
	ModelDao modelDao;
	
	@Override
	public boolean insert(Model record) {
		boolean flag = false;		
		int i = modelDao.insert(record);
		if(i>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean delete(Integer id) {
		boolean flag = false;
		if(ObjectUtils.isNotEmpty(id)){
			if(modelDao.deleteByPrimaryKey(id)>0){
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public List<Model> getList(ModelExample example) {
		return modelDao.selectByExample(example);
	}

	@Override
	public boolean update(Model record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getModelId())){
			if(modelDao.updateByPrimaryKey(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public boolean updateByPrimaryKeySelective(Model record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getModelId())){
			if(modelDao.updateByPrimaryKeySelective(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public Model getById(Integer id) {
		return modelDao.selectByPrimaryKey(id);
	}

	@Override
	public int countByExample(ModelExample example) {
		return modelDao.countByExample(example);
	}
	
	}
