package org.yosneaker.upload.support;

import org.csource.fastdfs.ClientGlobal;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 客户端配置初始化器。
 * 
 * @author Daniel Li
 * @since 19 Jun 2013
 */
public class ClientGlobalInitializer implements InitializingBean {

	private Resource configResource;

	/**
	 * 设置客户端配置资源。
	 * 
	 * @param configResource 客户端配置资源。
	 */
	public void setConfigResource(Resource configResource) {
		/*this.configResource = configResource;*/
		this.configResource = new ClassPathResource("fdfs_client.conf");
	}

	/**
	 * 初始化配置信息。
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		this.configResource = new ClassPathResource("fdfs_client.conf");
		ClientGlobal.init(configResource.getFile().getAbsolutePath());
	}

}
