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
import com.nnxi.model.DbServer;
import com.nnxi.model.DbSpRegister;
import com.nnxi.service.IDbSpRegisterService;
import com.nnxi.web.core.util.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 * 服务商注册 前端控制器
 * </p>
 *
 * @author ming
 * @since 2019-08-15
 */
@RestController
@RequestMapping("/dbSpRegister")
@Api(value = "服务商注册 接口", description = "服务商注册 接口")
public class DbSpRegisterController {
	  @Reference
	public IDbSpRegisterService spRegister;
	  
	  @PostMapping("queryDbSpRegister")
	    @ApiOperation(value = "查询服务商注册接口")
	    public Result<IPage<DbSpRegister>> queryDbSpRegister(@RequestBody(required = false) DbSpRegister model,
				@RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
				@RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize, HttpServletRequest req) {
			Result<IPage<DbSpRegister>> result = new Result<IPage<DbSpRegister>>();
			Page<DbSpRegister> page = new Page<DbSpRegister>(pageNo, pageSize);
			IPage<DbSpRegister> pageList = spRegister.page(page);
			result.setSuccess(true);
			result.setResult(pageList);
			return result;
		}
	    
	  
	@PostMapping("saveDbSpRegister")
	@ApiOperation(value = "插入服务商注册接口")
	public boolean saveDbSpRegister(@RequestBody(required = true) DbSpRegister model) {
	    boolean save = spRegister.save(model);
	    return save;
	}

	@PostMapping("updateDbSpRegister")
	@ApiOperation(value = "更新服务商注册接口")
	public boolean updateDbSpRegister(@RequestBody(required = true) DbSpRegister model) {
	    boolean update = spRegister.updateById(model);
	    return update;
	}


	@DeleteMapping("deleteDbSpRegister")
	@ApiOperation(value = "删除服务商注册接口")
	public boolean deleteDbSpRegister(@RequestParam(required = true) Integer model) {
	    boolean update = spRegister.removeById(model);
	    return update;
	}
}
