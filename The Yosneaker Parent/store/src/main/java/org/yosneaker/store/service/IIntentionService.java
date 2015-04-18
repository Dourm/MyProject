package org.yosneaker.store.service;

import java.util.List;
import org.yosneaker.store.dto.Intention;
import org.yosneaker.store.dto.IntentionExample;
import org.yosneaker.store.common.Page;

/**
 * 类名称:IIntentionService<br/>
 * 类描述:意向<br/>
 * 创建人:Rainy<br/>
 * 创建时间:2015-04-18 15:58:58<br/>
 * @version
 */
public interface IIntentionService {
	
	/**
	 * 保存记录
	 * @param record
	 * @return
	 */
	public boolean insert(Intention record);
	/**
	 * 删除记录
	 * @param id
	 * @return
	 */
	public boolean delete(Integer id);
	/**
	 * 获取意向类型
	 * @param example
	 * @return
	 */
	public List<Intention> getList(IntentionExample example);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean update(Intention record);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean updateByPrimaryKeySelective(Intention record);
	/**
	 * 获取记录
	 * @param id
	 * @return
	 */
	public Intention getById(Integer id);
	/**
	 * 统计数量
	 * @param Intention record
	 * @return
	 */
	int countByExample(IntentionExample example);
	
}
