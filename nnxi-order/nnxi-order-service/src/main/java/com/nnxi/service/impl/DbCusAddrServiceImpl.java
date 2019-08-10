package com.nnxi.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nnxi.mapper.DbCusAddrMapper;
import com.nnxi.model.DbCusAddr;
import com.nnxi.service.IDbCusAddrService;

/**
 * <p>
 * 用户地址 服务实现类
 * </p>
 *
 * @author ming
 * @since 2019-08-08
 */
@Service(interfaceClass = IDbCusAddrService.class)
public class DbCusAddrServiceImpl extends ServiceImpl<DbCusAddrMapper, DbCusAddr> implements IDbCusAddrService {
	@Autowired
	private DbCusAddrMapper cusAddr;
	@Override
	public Object queryCusAddr() {
		QueryWrapper<DbCusAddr> wrap =new QueryWrapper<>();
		return cusAddr.selectList(wrap);
	}

	@Override
	public Object saveCusAddr(DbCusAddr data) {
		// TODO Auto-generated method stub
		return cusAddr.insert(data);
	}

	@Override
	public Object modifyCusAddr(DbCusAddr data) {
		return cusAddr.updateById(data);
	}
	
}
