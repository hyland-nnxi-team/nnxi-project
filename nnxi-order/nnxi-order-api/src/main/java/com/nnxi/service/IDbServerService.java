package com.nnxi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nnxi.model.DbServer;

/**
 * <p>
 * 服务项目 服务类
 * </p>
 *
 * @author Lesso
 * @since 2019-08-08
 */
public interface IDbServerService extends IService<DbServer> {
	/**
	 * 
	 * @return
	 */
	Object queryServer();
	
	Object saveServer(DbServer data);
	
	Object modifyServer(DbServer data);
}
