package org.yosneaker.store.common;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;


/**
 * 类描述：SimpleDao </br>
 * 修改人： Rainy(yang.lin)</br>
 * 创建时间：2015年2月3日 上午11:43:16</br>
 * 修改备注： </br>
 * @version</br>
 */
public interface SimpleDao<T, PK extends Serializable, K> {

	/**
	 * 根据条件统计数量
	 * @param example
	 * @return
	 */
    int countByExample(K example);
    /**
     * 根据条件删除记录
     * @param example
     * @return
     */
    int deleteByExample(K example);
	/**
	 * 根据id删除记录
	 * @param id
	 * @return
	 */
    int deleteByPrimaryKey(PK id);
    /**
     * 保存记录
     * @param record
     * @return
     */
    int insert(T record);
    /**
     * 保存记录（空则过滤）
     * @param record
     * @return
     */
    int insertSelective(T record);
    /**
     * 根据条件查询记录
     * @param example
     * @return
     */
    List<T> selectByExample(K example);
    /**
     * 根据id查看记录
     * @param id
     * @return
     */
    T selectByPrimaryKey(PK id);
    /**
     * 根据条件更新记录（空则过滤）
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") T record, @Param("example") K example);
    /**
     * 根据条件更新记录
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") T record, @Param("example") K example);
    /**
     * 根据id更新记录（空则过滤）
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(T record);
    /**
     * 根据id更新记录
     * @param record
     * @return
     */
    int updateByPrimaryKey(T record);

}
