package org.yosneaker.store.ctrl;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yosneaker.common.tools.ObjectUtils;
import org.yosneaker.store.BaseController;
import org.yosneaker.store.ResponseBean;
import org.yosneaker.store.ResponseState;
import org.yosneaker.store.common.Page;
import org.yosneaker.store.dto.ArticleItem;
import org.yosneaker.store.dto.ArticleItemExample;
import org.yosneaker.store.service.IArticleItemService;

/**
 * 类描述:测评项
 * 创建人:Rainy
 * 创建时间:2015-03-08 20:18:40
 * @version
 */
@Controller
@RequestMapping("/admin/articleItem")
public class ArticleItemController extends BaseController{
	private final static Logger logger = Logger.getLogger(ArticleItemController.class);
	
	@Resource
    IArticleItemService articleItemService;//测评项
	/**
	 * 获取测评项列表
	 * @param record
	 
	 
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "",method=RequestMethod.GET)
	public @ResponseBody
	Object getListPage(ArticleItem record,Page page,HttpServletRequest request) {
		int total = 0;
		List<ArticleItem> list = new ArrayList<ArticleItem>();
		try{
			/*	查询条件    */
			ArticleItemExample example = new ArticleItemExample();
			
			//统计数量
			total = articleItemService.countByExample(example);
			if(total>0){
				list = articleItemService.getList(example);
			}
		}catch (Exception e) {
			logger.error("error", e);
		}
		return new ResponseBean<ArticleItem>(total,list);
	}
	
	/**
	 * 插入记录
	 * @param record
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "",method=RequestMethod.POST)
	public @ResponseBody
	Object insert(ArticleItem record,HttpServletRequest request) {
		ResponseState state = new ResponseState(false,"");
		try{			
			boolean isSuccess = articleItemService.insert(record);
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
	/**
	 * 删除记录
	 * @param record
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/{id}",method=RequestMethod.DELETE)
	public @ResponseBody
	Object delete(@PathVariable("id") Integer id,HttpServletRequest request) {
		ResponseState state = new ResponseState(false,"");
		try{
			if(ObjectUtils.isNotEmpty(id)){
				boolean isSuccess = articleItemService.delete(id);
				if(isSuccess){//删除成功
					state.setSuccess(true);
					state.setMsg("");
				}
			}	
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("error", e);
		}
		return state;
	}
	/**
	 * 更新
	 * @param record
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/{id}",method=RequestMethod.PUT)
	public @ResponseBody
	Object update(@RequestBody ArticleItem record,HttpServletRequest request) {
		ResponseState state = new ResponseState(false,"");
		try{			
			boolean isSuccess = articleItemService.update(record);
			if(isSuccess){//删除成功
				state.setSuccess(true);
				state.setMsg("");
			}
		}catch (Exception e) {
			logger.error("error", e);
		}
		return state;
	}

}
