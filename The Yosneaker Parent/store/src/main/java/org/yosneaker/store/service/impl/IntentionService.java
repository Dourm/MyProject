package org.yosneaker.store.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.yosneaker.store.dao.IntentionDao;
import org.yosneaker.store.dto.Intention;
import org.yosneaker.store.dto.IntentionExample;
import org.yosneaker.store.dto.IntentionExample.Criteria;
import org.yosneaker.store.service.IIntentionService;
import org.yosneaker.common.tools.ObjectUtils;
import org.yosneaker.store.common.Page;
import org.yosneaker.common.tools.StringUtils;


/**
 * 类名称:IntentionService
 * 类描述:意向
 * 创建人:Rainy
 * 创建时间:2015-04-18 15:58:58
 * @version
 */
@Service
public class IntentionService implements IIntentionService {
	
	@Resource
	IntentionDao intentionDao;
	
	@Override
	public boolean insert(Intention record) {
		boolean flag = false;		
		int i = intentionDao.insert(record);
		if(i>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean delete(Integer id) {
		boolean flag = false;
		if(ObjectUtils.isNotEmpty(id)){
			if(intentionDao.deleteByPrimaryKey(id)>0){
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public List<Intention> getList(IntentionExample example) {
		return intentionDao.selectByExample(example);
	}

	@Override
	public boolean update(Intention record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getIntentionAccountId())&&ObjectUtils.isNotEmpty(record.getIntentionModelId())){
			if(intentionDao.updateByPrimaryKey(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public boolean updateByPrimaryKeySelective(Intention record) {
		boolean  flag = false;
		if(ObjectUtils.isNotEmpty(record.getIntentionAccountId())&&ObjectUtils.isNotEmpty(record.getIntentionModelId())){
			if(intentionDao.updateByPrimaryKeySelective(record)>0){
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public Intention getById(Integer id) {
		return intentionDao.selectByPrimaryKey(id);
	}

	@Override
	public int countByExample(IntentionExample example) {
		return intentionDao.countByExample(example);
	}
	
	}
