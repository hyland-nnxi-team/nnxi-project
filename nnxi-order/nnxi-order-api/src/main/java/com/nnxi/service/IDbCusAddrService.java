package com.nnxi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nnxi.model.DbCusAddr;

/**
 * <p>
 * 用户地址 服务类
 * </p>
 *
 * @author ming
 * @since 2019-08-08
 */
public interface IDbCusAddrService extends IService<DbCusAddr> {
	/**
	 * 
	 * @return
	 */
	Object queryCusAddr();
	
	Object saveCusAddr(DbCusAddr data);
	
	Object modifyCusAddr(DbCusAddr data);
}
