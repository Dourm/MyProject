package org.yosneaker.store.service;

import java.util.List;

import org.yosneaker.store.dto.AccountInfo;
import org.yosneaker.store.dto.AccountInfoExample;

/**
 * 类名称:IAccountInfoService<br/>
 * 类描述:个人数据<br/>
 * 创建人:Rainy<br/>
 * 创建时间:2015-03-12 23:04:33<br/>
 * @version
 */
public interface IAccountInfoService {
	
	/**
	 * 保存记录
	 * @param record
	 * @return
	 */
	public boolean insert(AccountInfo record);
	/**
	 * 删除记录
	 * @param id
	 * @return
	 */
	public boolean delete(Integer id);
	/**
	 * 获取个人数据类型
	 * @param example
	 * @return
	 */
	public List<AccountInfo> getList(AccountInfoExample example);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean update(AccountInfo record);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean updateByPrimaryKeySelective(AccountInfo record);
	/**
	 * 获取记录
	 * @param id
	 * @return
	 */
	public AccountInfo getById(Integer id);
	/**
	 * 统计数量
	 * @param AccountInfo record
	 * @return
	 */
	int countByExample(AccountInfoExample example);
	
}
