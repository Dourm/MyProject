package org.yosneaker.store.api;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yosneaker.store.BaseController;
import org.yosneaker.store.ResponseBean;
import org.yosneaker.store.ResponseState;
import org.yosneaker.store.common.Page;
import org.yosneaker.store.dto.Brand;
import org.yosneaker.store.dto.BrandExample;
import org.yosneaker.store.service.IBrandService;
import org.yosneaker.store.service.IModelService;

import com.google.common.collect.Maps;

/**
 * 类描述:品牌
 * 创建人:Rainy
 * 创建时间:2015-03-12 22:45:25
 * @version
 */
@Controller
@RequestMapping("/brands")
public class BrandApiController extends BaseController{
	private final static Logger logger = Logger.getLogger(BrandApiController.class);
	
	@Resource
    IBrandService brandService;//品牌
	
	@Resource
	IModelService modelService;
	/**
	 * 获取品牌列表
	 * @param record
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "",method=RequestMethod.GET)
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
	
	@RequestMapping(value = "/{id}/models",method=RequestMethod.GET)
	public @ResponseBody
	Object getModelListByConditionPage(String keyword,HttpServletRequest request) {
		ResponseState responseState = new ResponseState();
		Map<String,Object> results = Maps.newHashMap();
		List<Brand> list = new ArrayList<Brand>();
		try{
			/*	查询条件    */
			BrandExample example = new BrandExample();
			
			//统计数量
			list = brandService.getList(example);
			results.put("models",list);
			return results;
		}catch (Exception e) {
			logger.error("error", e);
		}
		return responseState;
	}
}
