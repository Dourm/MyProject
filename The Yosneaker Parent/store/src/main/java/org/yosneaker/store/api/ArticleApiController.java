package org.yosneaker.store.api;
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
import org.yosneaker.store.dto.Article;
import org.yosneaker.store.dto.ArticleExample;
import org.yosneaker.store.service.IArticleService;

/**
 * 类描述:测评管理
 * 创建人:rainy(yang.lin)
 * 创建时间:2014-12-04 17:11:21
 * @version
 */
@Controller
@RequestMapping("/v0.1/articles")
public class ArticleApiController extends BaseController{
	private final static Logger logger = Logger.getLogger(ArticleApiController.class);
	
	@Resource
    IArticleService articleService;//测评管理
	/**
	 * 获取测评管理列表
	 * @param record
	 
	 
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "",method=RequestMethod.GET)
	public @ResponseBody
	Object getListPage(Article record,Page page,HttpServletRequest request) {
		int total = 0;
		List<Article> list = new ArrayList<Article>();
		try{
			/*	查询条件    */
			ArticleExample example = new ArticleExample();
			
			//统计数量
			total = articleService.countByExample(example);
			if(total>0){
				list = articleService.getList(example);
			}
		}catch (Exception e) {
			logger.error("error", e);
		}
		return new ResponseBean<Article>(total,list);
	}
	
	/**
	 * 插入记录
	 * @param record
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "",method=RequestMethod.POST)
	public @ResponseBody
	Object insert(@RequestBody Article record,HttpServletRequest request) {
		ResponseState state = new ResponseState(false,"");
		try{			
			boolean isSuccess = articleService.insertArticleAndItems(record);
			if(isSuccess){//成功
				state.setSuccess(true);
				state.setMsg("");
				state.setObj(record);
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
				boolean isSuccess = articleService.delete(id);
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
	Object update(@RequestBody Article record,HttpServletRequest request) {
		ResponseState state = new ResponseState(false,"");
		try{			
			boolean isSuccess = articleService.update(record);
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
