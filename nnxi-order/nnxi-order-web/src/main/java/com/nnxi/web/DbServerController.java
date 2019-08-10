package com.nnxi.web;

import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nnxi.model.DbServer;
import com.nnxi.model.SpTblMission;
import com.nnxi.service.IDbServerService;

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
	    public List<DbServer> DbServer(@RequestBody(required = true) DbServer model) {
			QueryWrapper queryWrapper=new QueryWrapper();
	        return server.list(queryWrapper);
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
