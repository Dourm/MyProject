package org.yosneaker.store.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.yosneaker.common.tools.ObjectUtils;
import org.yosneaker.store.dao.BrandDao;
import org.yosneaker.store.dto.Brand;
import org.yosneaker.store.dto.BrandExample;
import org.yosneaker.store.service.IBrandService;


/**
 * 类名称:BrandService
 * 类描述:品牌
 * 创建人:Rainy
 * 创建时间:2015-03-12 22:45:25
 * @version
 */
@Service
public class BrandService implements IBrandService {
	
	@Resource
	BrandDao brandDao;
	
	@Override
	public boolean insert(Brand record) {
		boolean flag = false;		
		int i = brandDao.insert(record);
		if(i>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean delete(Integer id) {
		boolean flag = false;
		if(ObjectUtils.isNotEmpty(id)){
			if(brandDao.deleteByPrimaryKey(id)>0){
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public List<Brand> getList(BrandExample example) {
		return brandDao.selectByExample(example);
	}

	@Override
	public boolean update(Brand record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getBrandId())){
			if(brandDao.updateByPrimaryKey(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public boolean updateByPrimaryKeySelective(Brand record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getBrandId())){
			if(brandDao.updateByPrimaryKeySelective(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public Brand getById(Integer id) {
		return brandDao.selectByPrimaryKey(id);
	}

	@Override
	public int countByExample(BrandExample example) {
		return brandDao.countByExample(example);
	}
	
	}
