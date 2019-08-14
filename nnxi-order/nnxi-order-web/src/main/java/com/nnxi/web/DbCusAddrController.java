package com.nnxi.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nnxi.model.DbCusAddr;
import com.nnxi.service.IDbCusAddrService;
import com.nnxi.web.core.util.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/order")
@Api(value = "用户地址 接口", description = "用户地址 接口")
public class DbCusAddrController {
  @Reference
  public IDbCusAddrService cusAddr;
  @PostMapping("queryDbCusAddr")
	@ApiOperation(value = "查询用户地址接口")
	public Result<IPage<DbCusAddr>> DbDbCusAddr(@RequestBody(required = false) DbCusAddr model,
			@RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
			@RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize, HttpServletRequest req) {
		Result<IPage<DbCusAddr>> result = new Result<IPage<DbCusAddr>>();
		Page<DbCusAddr> page = new Page<DbCusAddr>(pageNo, pageSize);
		IPage<DbCusAddr> pageList = cusAddr.page(page);
		result.setSuccess(true);
		result.setResult(pageList);
		return result;
	}
  
@PostMapping("saveDbCusAddr")
@ApiOperation(value = "插入用户地址接口")
public boolean saveDbCusAddr(@RequestBody(required = true) DbCusAddr model) {
    boolean save = cusAddr.save(model);
    return save;
}

@PostMapping("updateDbCusAddr")
@ApiOperation(value = "更新用户地址接口")
public boolean updateDbCusAddr(@RequestBody(required = true) DbCusAddr model) {
    boolean update = cusAddr.updateById(model);
    return update;
}


@DeleteMapping("deleteDbCusAddr")
@ApiOperation(value = "删除用户地址接口")
public boolean deleteDbCusAddr(@RequestParam(required = true) Integer model) {
    boolean update = cusAddr.removeById(model);
    return update;
}
}
