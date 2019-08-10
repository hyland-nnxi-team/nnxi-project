package com.nnxi.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nnxi.mapper.DbServerMapper;
import com.nnxi.model.DbServer;
import com.nnxi.service.IDbServerService;

/**
 * <p>
 * 服务项目 服务实现类
 * </p>
 *
 * @author ming
 * @since 2019-08-08
 */
@Service(interfaceClass = IDbServerService.class)
public class DbServerServiceImpl extends ServiceImpl<DbServerMapper, DbServer> implements IDbServerService {	
	@Autowired
	private DbServerMapper dbserver;

	@Override
	public Object queryServer() {
		QueryWrapper<DbServer> wrapper=new QueryWrapper<>();
		return dbserver.selectList(wrapper);
	}

	@Override
	public Object saveServer(DbServer data) {
		return dbserver.insert(data);
	}

	@Override
	public Object modifyServer(DbServer data) {
		return dbserver.updateById(data);
	}
	
}
