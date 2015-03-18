package org.yosneaker.store.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.yosneaker.common.tools.ObjectUtils;
import org.yosneaker.store.dao.AccountInfoDao;
import org.yosneaker.store.dto.AccountInfo;
import org.yosneaker.store.dto.AccountInfoExample;
import org.yosneaker.store.service.IAccountInfoService;


/**
 * 类名称:AccountInfoService
 * 类描述:个人数据
 * 创建人:Rainy
 * 创建时间:2015-03-12 23:04:33
 * @version
 */
@Service
public class AccountInfoService implements IAccountInfoService {
	
	@Resource
	AccountInfoDao accountInfoDao;
	
	@Override
	public boolean insert(AccountInfo record) {
		boolean flag = false;		
		int i = accountInfoDao.insert(record);
		if(i>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean delete(Integer id) {
		boolean flag = false;
		if(ObjectUtils.isNotEmpty(id)){
			if(accountInfoDao.deleteByPrimaryKey(id)>0){
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public List<AccountInfo> getList(AccountInfoExample example) {
		return accountInfoDao.selectByExample(example);
	}

	@Override
	public boolean update(AccountInfo record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getAccountInformationId())){
			if(accountInfoDao.updateByPrimaryKey(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public boolean updateByPrimaryKeySelective(AccountInfo record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getAccountInformationId())){
			if(accountInfoDao.updateByPrimaryKeySelective(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public AccountInfo getById(Integer id) {
		return accountInfoDao.selectByPrimaryKey(id);
	}

	@Override
	public int countByExample(AccountInfoExample example) {
		return accountInfoDao.countByExample(example);
	}
	
	}
