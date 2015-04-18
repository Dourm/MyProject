package org.yosneaker.store.service;

import java.util.List;

import org.yosneaker.store.dto.Account;
import org.yosneaker.store.dto.AccountExample;

/**
 * 类名称:IAccountService<br/>
 * 类描述:帐号<br/>
 * 创建人:Rainy<br/>
 * 创建时间:2015-04-18 10:25:34<br/>
 * @version
 */
public interface IAccountService {
	
	/**
	 * 保存记录
	 * @param record
	 * @return
	 */
	public boolean insert(Account record);
	/**
	 * 删除记录
	 * @param id
	 * @return
	 */
	public boolean delete(Integer id);
	/**
	 * 获取帐号类型
	 * @param example
	 * @return
	 */
	public List<Account> getList(AccountExample example);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean update(Account record);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean updateByPrimaryKeySelective(Account record);
	/**
	 * 获取记录
	 * @param id
	 * @return
	 */
	public Account getById(Integer id);
	/**
	 * 统计数量
	 * @param Account record
	 * @return
	 */
	int countByExample(AccountExample example);
	
	/**
	 * 第三方登入判断是否存在用户
	 * @param record
	 * @return
	 */
	public boolean exist(Account record);
	
	
	public Object getByThridAccountId(String accountThridPartId);
	
}
