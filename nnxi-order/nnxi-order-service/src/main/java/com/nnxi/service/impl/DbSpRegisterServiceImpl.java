package com.nnxi.service.impl;


import org.apache.dubbo.config.annotation.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nnxi.mapper.DbSpRegisterMapper;
import com.nnxi.model.DbSpRegister;
import com.nnxi.service.IDbSpRegisterService;

/**
 * <p>
 * 服务商注册 服务实现类
 * </p>
 *
 * @author ming
 * @since 2019-08-15
 */
@Service(interfaceClass = IDbSpRegisterService.class)
public class DbSpRegisterServiceImpl extends ServiceImpl<DbSpRegisterMapper, DbSpRegister> implements IDbSpRegisterService {
	
}
