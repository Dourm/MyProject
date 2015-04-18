package org.yosneaker.store.api;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yosneaker.store.BaseController;
import org.yosneaker.store.ResponseState;
import org.yosneaker.store.dto.Account;
import org.yosneaker.store.service.IAccountService;

/**
 * 类描述:帐号
 * 创建人:Rainy
 * 创建时间:2015-04-18 10:09:28
 * @version
 */
@Controller
@RequestMapping("/register")
public class LoginController extends BaseController{
	private final static Logger logger = Logger.getLogger(LoginController.class);
	
	@Resource
    IAccountService accountService;//帐号

	/**
	 * 登入
	 * @param record
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "",method=RequestMethod.POST)
	public @ResponseBody
	Object loginWithThridPartAccount(Account record,HttpServletRequest request) {
		ResponseState state = new ResponseState(false,"");
		try{
			if(!accountService.exist(record)){
				boolean isSuccess = accountService.insert(record);
				if(isSuccess){//成功
					state.setSuccess(true);
					state.setMsg("");
					state.setObj(accountService.getByThridAccountId(record.getAccountThridPartId()));
				}
			}else{
				state.setSuccess(true);
				state.setMsg("");
				state.setObj(accountService.getByThridAccountId(record.getAccountThridPartId()));
			}
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("error", e);
		}
		return state;
	}
}
