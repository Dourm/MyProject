package org.yosneaker.upload.web.api;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;
import org.yosneaker.upload.services.ResourceService;

@Controller
@RequestMapping("/resources")
public class ResourceBrowseController {

	@Resource(name = "resourceServiceImpl")
	private ResourceService resourceService;
	
	@RequestMapping(method = { RequestMethod.GET }, value = { "/generic/{groupId:g\\d+}/{f1:M\\d+}/{f2:\\w{2}}/{f3:\\w{2}}/{f4:.*}" })
	@ResponseBody
	public byte[] showGenericResource(@PathVariable("groupId") String groupId, @PathVariable("f1") String f1, @PathVariable("f2") String f2, @PathVariable("f3") String f3, @PathVariable("f4") String f4, HttpServletRequest request, HttpServletResponse response) throws NoSuchRequestHandlingMethodException {
		try {
			String resourcePath = new StringBuilder().append(groupId).append("/").append(f1).append("/").append(f2).append("/").append(f3).append("/").append(f4).toString();
			byte[] result = resourceService.getResourceByPath(resourcePath);
			if (ArrayUtils.isEmpty(result)) {
				throw new NoSuchRequestHandlingMethodException(request);
			}
			return result;
		} catch (Exception e) {
			throw new NoSuchRequestHandlingMethodException(request);
		}
	}
}
