package com.nnxi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nnxi.model.DbCategory;

/**
 * <p>
 * 类别 服务类
 * </p>
 *
 * @author ming
 * @since 2019-08-07
 */
public interface IDbCategoryService extends IService<DbCategory> {
	
	Object queryCategory();
	
}
