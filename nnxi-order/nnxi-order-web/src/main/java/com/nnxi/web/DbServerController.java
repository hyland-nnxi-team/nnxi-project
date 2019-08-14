package com.nnxi.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nnxi.model.DbCusAddr;
import com.nnxi.model.DbServer;
import com.nnxi.model.SpTblMission;
import com.nnxi.service.IDbServerService;
import com.nnxi.web.core.util.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/order")
@Api(value = "服务项目接口", description = "服务项目 接口")
public class DbServerController {
	  @Reference
	public IDbServerService server;
	  
	  @PostMapping("queryDbServer")
	    @ApiOperation(value = "查询服务项目接口")
	    public Result<IPage<DbServer>> DbServer(@RequestBody(required = false) DbServer model,
				@RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
				@RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize, HttpServletRequest req) {
			Result<IPage<DbServer>> result = new Result<IPage<DbServer>>();
			Page<DbServer> page = new Page<DbServer>(pageNo, pageSize);
			IPage<DbServer> pageList = server.page(page);
			result.setSuccess(true);
			result.setResult(pageList);
			return result;
		}
	    
	  
	@PostMapping("saveDbServer")
	@ApiOperation(value = "插入服务项目接口")
	public boolean saveDbServer(@RequestBody(required = true) DbServer model) {
	    boolean save = server.save(model);
	    return save;
	}

	@PostMapping("updateDbServer")
	@ApiOperation(value = "更新服务项目接口")
	public boolean updateDbServer(@RequestBody(required = true) DbServer model) {
	    boolean update = server.updateById(model);
	    return update;
	}


	@DeleteMapping("deleteDbServer")
	@ApiOperation(value = "删除服务项目接口")
	public boolean deleteDbServer(@RequestParam(required = true) Integer model) {
	    boolean update = server.removeById(model);
	    return update;
	}
}
