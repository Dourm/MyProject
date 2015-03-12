package org.yosneaker.store.service;

import java.util.List;
import org.yosneaker.store.dto.Model;
import org.yosneaker.store.dto.ModelExample;
import org.yosneaker.store.common.Page;

/**
 * 类名称:IModelService<br/>
 * 类描述:型号<br/>
 * 创建人:Rainy<br/>
 * 创建时间:2015-03-12 22:57:32<br/>
 * @version
 */
public interface IModelService {
	
	/**
	 * 保存记录
	 * @param record
	 * @return
	 */
	public boolean insert(Model record);
	/**
	 * 删除记录
	 * @param id
	 * @return
	 */
	public boolean delete(Integer id);
	/**
	 * 获取型号类型
	 * @param example
	 * @return
	 */
	public List<Model> getList(ModelExample example);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean update(Model record);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean updateByPrimaryKeySelective(Model record);
	/**
	 * 获取记录
	 * @param id
	 * @return
	 */
	public Model getById(Integer id);
	/**
	 * 统计数量
	 * @param Model record
	 * @return
	 */
	int countByExample(ModelExample example);
	
}
