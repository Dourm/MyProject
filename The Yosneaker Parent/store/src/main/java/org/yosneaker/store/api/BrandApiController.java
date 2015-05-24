package org.yosneaker.store.api;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yosneaker.store.BaseController;
import org.yosneaker.store.ResponseBean;
import org.yosneaker.store.ResponseState;
import org.yosneaker.store.common.Page;
import org.yosneaker.store.dto.Brand;
import org.yosneaker.store.dto.BrandExample;
import org.yosneaker.store.dto.Intention;
import org.yosneaker.store.dto.IntentionExample;
import org.yosneaker.store.dto.Model;
import org.yosneaker.store.dto.ModelExample;
import org.yosneaker.store.dto.ModelExample.Criteria;
import org.yosneaker.store.service.IBrandService;
import org.yosneaker.store.service.IIntentionService;
import org.yosneaker.store.service.IModelService;

import com.google.common.collect.Maps;

/**
 * 类描述:品牌
 * 创建人:Rainy
 * 创建时间:2015-03-12 22:45:25
 * @version
 */
@Controller
@RequestMapping("/")
public class BrandApiController extends BaseController{
	private final static Logger logger = Logger.getLogger(BrandApiController.class);
	
	@Resource
    IBrandService brandService;//品牌
	
	@Resource
	IModelService modelService;
	
	@Resource
	IIntentionService iIntentionService;
	/**
	 * 获取品牌列表
	 * @param record
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/brands",method=RequestMethod.GET)
	public @ResponseBody
	Object getListPage(Brand record,Page page,HttpServletRequest request) {
		int total = 0;
		List<Brand> list = new ArrayList<Brand>();
		try{
			/*	查询条件    */
			BrandExample example = new BrandExample();
			
			//统计数量
			total = brandService.countByExample(example);
			if(total>0){
				list = brandService.getList(example);
			}
		}catch (Exception e) {
			logger.error("error", e);
		}
		return new ResponseBean<Brand>(total,list);
	}
	
	@RequestMapping(value = "/brands/{id}/models",method=RequestMethod.GET)
	public @ResponseBody
	Object getModelListByConditionPage(@PathVariable int id,String keyword,HttpServletRequest request) {
		ResponseState responseState = new ResponseState();
		Map<String,Object> results = Maps.newHashMap();
		List<Model> list = new ArrayList<Model>();
		try{
			/*	查询条件    */
			ModelExample example = new ModelExample();
			Criteria criteria = example.createCriteria();
			criteria = criteria.andBrandIdEqualTo(id);
			
			if(keyword !=null){
				criteria = criteria.andModelNameLikeInsensitive("%"+keyword+"%");
			}
			
			//统计数量
			list = modelService.getList(example);
			results.put("models",list);
			return results;
		}catch (Exception e) {
			logger.error("error", e);
		}
		return responseState;
	}
	
	
	/**
	 * @param record
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/models/{id}/action/want",method=RequestMethod.POST)
	public @ResponseBody
	Object hadBuy(Intention record,HttpServletRequest request) {
		ResponseState state = new ResponseState(false,"");
		try{
			IntentionExample intentionExample = new  IntentionExample();
			intentionExample.createCriteria().andIntentionAccountIdEqualTo(record.getIntentionAccountId()).andIntentionModelIdEqualTo(record.getIntentionModelId());
			List<Intention> is = iIntentionService.getList(intentionExample);
			boolean isSuccess = false;
			if(is!=null&&is.size()>0){
				isSuccess= iIntentionService.update(record);
			}else{
				isSuccess= iIntentionService.insert(record);
			}
			if(isSuccess){//成功
				state.setSuccess(true);
				state.setMsg("");
			}
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("error", e);
		}
		return state;
	}
}
