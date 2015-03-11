package org.yosneaker.upload.web.api;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;
import org.yosneaker.common.tools.StringUtils;
import org.yosneaker.common.tools.i18n.Message;
import org.yosneaker.common.tools.i18n.MessageUtils;
import org.yosneaker.upload.services.ResourceService;

import com.loopj.android.http.Base64;

@Controller
@RequestMapping("/resources")
public class ResourceUploadController {

	@Resource(name = "resourceServiceImpl")
	private ResourceService resourceService;
	
	private static String AUTHOR = "author";
	
	private static String FILE_NAME = "fileName";
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ResourceUploadController.class);

	@RequestMapping(method = { RequestMethod.POST }, value = { "/image" })
	@ResponseBody
	public Message<String> uploadImage(@RequestParam(required = false) MultipartFile image, HttpServletRequest request) {
		try {
			String username = getLoginUserName(request);
			String extension = null;
			if (StringUtils.isEmpty(username)) {
				return MessageUtils.warn("upload.resources.post.noSession");
			}
			
			if (image == null) {
				request.setCharacterEncoding("utf-8");  
		        String photo = request.getParameter("image");  
		        if(photo == null)
		        	return MessageUtils.error("upload.resources.empty");
		        extension = request.getParameter("name");
		        Map<String, String> metadata = new HashMap<String, String>();
				metadata.put(AUTHOR, username);
				metadata.put(FILE_NAME, extension);
			    // 对base64数据进行解码 生成 字节数组，不能直接用Base64.decode（）；进行解密  
	            byte[] photoimg = Base64.decode(photo,Base64.DEFAULT); 
	            for (int i = 0; i < photoimg.length; ++i) {  
	                if (photoimg[i] < 0) {  
	                    // 调整异常数据  
	                    photoimg[i] += 256;  
	                }  
	            }  
				//byte[] imageData = imageService.resizeImage(image.getOriginalFilename(), image.getBytes(), imageGeometry, Gravity.Center);
				String resourcePath = resourceService.uploadResource(extension,photoimg, metadata);
				return MessageUtils.success("upload.resources.post.success", resourcePath);
		        
			}else{
				extension = FilenameUtils.getExtension(image.getOriginalFilename());
				if (StringUtils.isEmpty(extension)) {
					return MessageUtils.warn("upload.resources.delete.noExtention");
				} 
				Map<String, String> metadata = new HashMap<String, String>();
				metadata.put(AUTHOR, username);
				metadata.put(FILE_NAME, image.getOriginalFilename());
				//byte[] imageData = imageService.resizeImage(image.getOriginalFilename(), image.getBytes(), imageGeometry, Gravity.Center);
				String resourcePath = resourceService.uploadResource(extension, image.getBytes(), metadata);
				return MessageUtils.success("upload.resources.post.success", resourcePath);
			}
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			return MessageUtils.error("upload.resources.post.error");
		}
	}
	
	@RequestMapping(method = { RequestMethod.POST } )
	@ResponseBody
	public Message<String> uploadResource(@RequestParam(required = false) MultipartFile image, HttpServletRequest request) {
		try {
			if (image == null) {
				return MessageUtils.warn("upload.resources.empty");
			}
			String username = getLoginUserName(request);
			if (StringUtils.isEmpty(username)) {
				return MessageUtils.warn("upload.resources.post.noSession");
			}
			String extension = FilenameUtils.getExtension(image.getOriginalFilename());
			if (StringUtils.isEmpty(extension)) {
				return MessageUtils.warn("upload.resources.delete.noExtention");
			} 
			Map<String, String> metadata = new HashMap<String, String>();
			metadata.put(AUTHOR, username);
			metadata.put(FILE_NAME, image.getOriginalFilename());
			String resourcePath = resourceService.uploadResource(extension, image.getBytes(), metadata);
			return MessageUtils.success("upload.resources.post.success", resourcePath);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			return MessageUtils.error("upload.resources.post.error");
		}
	}
	
	@RequestMapping(method = { RequestMethod.DELETE }, value = { "/{groupId:g\\d+}/{f1:M\\d+}/{f2:\\w{2}}/{f3:\\w{2}}/{f4:.*}" })
	@ResponseBody
	public Message<String> deleteResource(@PathVariable("groupId") String groupId, @PathVariable("f1") String f1, @PathVariable("f2") String f2, @PathVariable("f3") String f3, @PathVariable("f4") String f4,  HttpServletRequest request) throws NoSuchRequestHandlingMethodException {
		try {
			String resourcePath = new StringBuilder().append(groupId).append("/").append(f1).append("/").append(f2).append("/").append(f3).append("/").append(f4).toString();
			Map<String, String> metadata = resourceService.getMetadataByPath(resourcePath);
			if (MapUtils.isEmpty(metadata)) {
				throw new NoSuchRequestHandlingMethodException(request);
			}
			String author = metadata.get(AUTHOR);
			String username = getLoginUserName(request);
			if (StringUtils.isEmpty(username)) {
				return MessageUtils.warn("upload.resources.delete.noSession");
			}
			if (!StringUtils.equals(username, author)) {
				return MessageUtils.warn("upload.resources.delete.noPermission");
			}
			resourceService.deleteResourceByPath(resourcePath);
			return MessageUtils.success("upload.resources.delete.success");
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			return MessageUtils.error("upload.resources.delete.error");
		}
	}
	
	private String getLoginUserName(HttpServletRequest request) {
		return "daniellitoc";
	}
	
	@RequestMapping(method = { RequestMethod.POST }, value = { "/picture" })
	@ResponseBody
	public Message<String> uploadImage2(HttpServletRequest request) {
		try {
			String username = getLoginUserName(request);
			String extension = "";
			if (StringUtils.isEmpty(username)) {
				return MessageUtils.warn("upload.resources.post.noSession");
			}
			
				request.setCharacterEncoding("utf-8");  
		        String photo = request.getParameter("image");  
		        if(photo == null)
		        	return MessageUtils.error("upload.resources.empty");
		        extension = request.getParameter("name");
		        Map<String, String> metadata = new HashMap<String, String>();
				metadata.put(AUTHOR, username);
				metadata.put(FILE_NAME, extension);
			    // 对base64数据进行解码 生成 字节数组，不能直接用Base64.decode（）；进行解密  
	            byte[] photoimg = Base64.decode(photo,Base64.DEFAULT); 
	            for (int i = 0; i < photoimg.length; ++i) {  
	                if (photoimg[i] < 0) {  
	                    // 调整异常数据  
	                    photoimg[i] += 256;  
	                }  
	            }  
				//byte[] imageData = imageService.resizeImage(image.getOriginalFilename(), image.getBytes(), imageGeometry, Gravity.Center);
				String resourcePath = resourceService.uploadResource(extension,photoimg, metadata);
				return MessageUtils.success("upload.resources.post.success", resourcePath);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			return MessageUtils.error("upload.resources.post.error");
		}
	}
	
	@RequestMapping(method = { RequestMethod.POST }, value = { "/picture.json" })
	@ResponseBody
	public Message<String> uploadImage3(HttpServletRequest request) {
		try {
			String username = getLoginUserName(request);
			String extension = "";
			if (StringUtils.isEmpty(username)) {
				return MessageUtils.warn("upload.resources.post.noSession");
			}
			
				request.setCharacterEncoding("utf-8");  
		        String photo = request.getParameter("image");  
		        if(photo == null)
		        	return MessageUtils.error("upload.resources.empty");
		        extension = request.getParameter("name");
		        Map<String, String> metadata = new HashMap<String, String>();
				metadata.put(AUTHOR, username);
				metadata.put(FILE_NAME, extension);
			    // 对base64数据进行解码 生成 字节数组，不能直接用Base64.decode（）；进行解密  
	            byte[] photoimg = Base64.decode(photo,Base64.DEFAULT); 
	            for (int i = 0; i < photoimg.length; ++i) {  
	                if (photoimg[i] < 0) {  
	                    // 调整异常数据  
	                    photoimg[i] += 256;  
	                }  
	            }  
				//byte[] imageData = imageService.resizeImage(image.getOriginalFilename(), image.getBytes(), imageGeometry, Gravity.Center);
				String resourcePath = resourceService.uploadResource(extension,photoimg, metadata);
				return MessageUtils.success("upload.resources.post.success", resourcePath);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			return MessageUtils.error("upload.resources.post.error",e);
		}
	}
}
