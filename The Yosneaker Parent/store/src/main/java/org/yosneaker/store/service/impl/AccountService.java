package org.yosneaker.store.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.yosneaker.common.tools.ObjectUtils;
import org.yosneaker.store.dao.AccountDao;
import org.yosneaker.store.dto.Account;
import org.yosneaker.store.dto.AccountExample;
import org.yosneaker.store.service.IAccountService;


/**
 * 类名称:AccountService
 * 类描述:帐号
 * 创建人:Rainy
 * 创建时间:2015-04-18 10:25:34
 * @version
 */
@Service
public class AccountService implements IAccountService {
	
	@Resource
	AccountDao accountDao;
	
	@Override
	public boolean insert(Account record) {
		boolean flag = false;		
		int i = accountDao.insert(record);
		if(i>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean delete(Integer id) {
		boolean flag = false;
		if(ObjectUtils.isNotEmpty(id)){
			if(accountDao.deleteByPrimaryKey(id)>0){
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public List<Account> getList(AccountExample example) {
		return accountDao.selectByExample(example);
	}

	@Override
	public boolean update(Account record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getAccountId())){
			if(accountDao.updateByPrimaryKey(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public boolean updateByPrimaryKeySelective(Account record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getAccountId())){
			if(accountDao.updateByPrimaryKeySelective(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public Account getById(Integer id) {
		return accountDao.selectByPrimaryKey(id);
	}

	@Override
	public int countByExample(AccountExample example) {
		return accountDao.countByExample(example);
	}

	@Override
	public boolean exist(Account record) {
		AccountExample accountExample = new AccountExample();
		accountExample.createCriteria().andAccountThridPartIdEqualTo(record.getAccountThridPartId());
		List<Account> account =  accountDao.selectByExample(accountExample);
		return account.size()>0;
	}

	@Override
	public Object getByThridAccountId(String accountThridPartId) {
		AccountExample accountExample = new AccountExample();
		accountExample.createCriteria().andAccountThridPartIdEqualTo(accountThridPartId);
		List<Account> account =  accountDao.selectByExample(accountExample);
		return account.size()>0?account.get(0):null;
	}
	
	}
