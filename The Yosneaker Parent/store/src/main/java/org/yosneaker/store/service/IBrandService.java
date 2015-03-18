package org.yosneaker.store.service;

import java.util.List;

import org.yosneaker.store.dto.Brand;
import org.yosneaker.store.dto.BrandExample;

/**
 * 类名称:IBrandService<br/>
 * 类描述:品牌<br/>
 * 创建人:Rainy<br/>
 * 创建时间:2015-03-12 22:45:25<br/>
 * @version
 */
public interface IBrandService {
	
	/**
	 * 保存记录
	 * @param record
	 * @return
	 */
	public boolean insert(Brand record);
	/**
	 * 删除记录
	 * @param id
	 * @return
	 */
	public boolean delete(Integer id);
	/**
	 * 获取品牌类型
	 * @param example
	 * @return
	 */
	public List<Brand> getList(BrandExample example);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean update(Brand record);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	public boolean updateByPrimaryKeySelective(Brand record);
	/**
	 * 获取记录
	 * @param id
	 * @return
	 */
	public Brand getById(Integer id);
	/**
	 * 统计数量
	 * @param Brand record
	 * @return
	 */
	int countByExample(BrandExample example);
	
}
