package org.yosneaker.store.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public abstract class SimpleMybatisSupport<T, PK extends Serializable,K> extends SqlSessionDaoSupport implements SimpleDao<T, PK, K> {
	@Override
	public int countByExample(K example) {
		return (Integer)getSqlSession().selectOne(toMybatisStatement("countByExample"), example);
	}

	@Override
	public int deleteByExample(K example) {
		return getSqlSession().delete(toMybatisStatement("deleteByExample"), example);
	}

	@Override
	public int deleteByPrimaryKey(PK id) {
		return getSqlSession().delete(toMybatisStatement("deleteByPrimaryKey"), id);
	}

	@Override
	public int insert(T record) {
		return getSqlSession().insert(toMybatisStatement("insert"), record);
	}

	@Override
	public int insertSelective(T record) {
		return getSqlSession().insert(toMybatisStatement("insertSelective"), record);
	}
	@Override
	public List<T> selectByExample(K example) {
		return getSqlSession().selectList(toMybatisStatement("selectByExample"),example);
	}

	@Override
	public T selectByPrimaryKey(PK id) {
		return (T)getSqlSession().selectOne(toMybatisStatement("selectByPrimaryKey"),id);
	}

	@Override
	public int updateByExample(T record, K example) {
		Map map = new HashMap();
		map.put("record", record);
		map.put("example",example);
		return getSqlSession().update(toMybatisStatement("updateByExample"), example);
	}

	@Override
	public int updateByExampleSelective(T record,K example) {
		Map map = new HashMap();
		map.put("record", record);
		map.put("example",example);
		return getSqlSession().update(toMybatisStatement("updateByExampleSelective"), map);
	}

	@Override
	public int updateByPrimaryKey(T record) {
		return getSqlSession().update(toMybatisStatement("updateByPrimaryKey"), record);
	}

	@Override
	public int updateByPrimaryKeySelective(T record) {
		return getSqlSession().update(toMybatisStatement("updateByPrimaryKeySelective"), record);
	}
    public String toMybatisStatement(String statementName) {
        return getMybatisMapperNamesapce() + "." + statementName;
    }

    public String getMybatisMapperNamesapce() {
        throw new RuntimeException("请设置Mybatis 对应的持久对象命名空间！");
    }
    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        super.setSqlSessionFactory(sqlSessionFactory);
    }
    
}
