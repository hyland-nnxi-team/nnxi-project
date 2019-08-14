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
import com.nnxi.model.DbServer;
import com.nnxi.model.SpTblMission;
import com.nnxi.model.SpTblMissionfile;
import com.nnxi.service.ISpTblMissionService;
import com.nnxi.web.core.util.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/order")
@Api(value = "任务单接口", description = "任务单 接口")
public class ISpTblMissionController {
	  @Reference
	  public ISpTblMissionService sqTblMission;
		
	  @PostMapping("querySpTblMission")
	    @ApiOperation(value = "查询插入任务接口")
	    public Result<IPage<SpTblMission>> querySpTblMission(@RequestBody(required = false) SpTblMission model,
				@RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
				@RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize, HttpServletRequest req) {
			Result<IPage<SpTblMission>> result = new Result<IPage<SpTblMission>>();
			Page<SpTblMission> page = new Page<SpTblMission>(pageNo, pageSize);
			IPage<SpTblMission> pageList = sqTblMission.page(page);
			result.setSuccess(true);
			result.setResult(pageList);
			return result;
	    }  
	  
	@PostMapping("saveSpTblMission")
	@ApiOperation(value = "插入任务单")
	public boolean saveSpTblMission(@RequestBody(required = true) SpTblMission model) {
	    boolean save = sqTblMission.save(model);
	    return save;
	}

	@PostMapping("updateSpTblMission")
	@ApiOperation(value = "更新任务单")
	public boolean updateSpTblMission(@RequestBody(required = true) SpTblMission model) {
	    boolean update = sqTblMission.updateById(model);
	    return update;
	}


	@DeleteMapping("deleteSpTblMission")
	@ApiOperation(value = "删除任务单")
	public boolean deleteSpTblMission(@RequestParam(required = true) Integer model) {
	    boolean update = sqTblMission.removeById(model);
	    return update;
	}
}
