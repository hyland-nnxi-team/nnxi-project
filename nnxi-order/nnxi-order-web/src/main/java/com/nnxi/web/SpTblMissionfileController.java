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
import com.nnxi.model.SpTblMission;
import com.nnxi.model.SpTblMissionfile;
import com.nnxi.service.ISpTblMissionfileService;
import com.nnxi.web.core.util.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/order")
@Api(value = "任务单附件", description = "任务单附件接口")
public class SpTblMissionfileController {
	  @Reference
	  public ISpTblMissionfileService sqTblMissionFile;
	@PostMapping("querySpTblMissionfile")
    @ApiOperation(value = "查询插入任务接口")
    public Result<IPage<SpTblMissionfile>> querySpTblMissionfile(@RequestBody(required = false) SpTblMissionfile model,
			@RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
			@RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize, HttpServletRequest req) {
		Result<IPage<SpTblMissionfile>> result = new Result<IPage<SpTblMissionfile>>();
		Page<SpTblMissionfile> page = new Page<SpTblMissionfile>(pageNo, pageSize);
		IPage<SpTblMissionfile> pageList = sqTblMissionFile.page(page);
		result.setSuccess(true);
		result.setResult(pageList);
		return result;
    } 
	  
	@PostMapping("saveSpTblMissionfile")
	@ApiOperation(value = "插入任务单附件")
	public boolean saveSpTblMissionfile(@RequestBody(required = true) SpTblMissionfile model) {
	    boolean save = sqTblMissionFile.save(model);
	    return save;
	}

	@PostMapping("updateSpTblMissionfile")
	@ApiOperation(value = "更新任务单附件")
	public boolean updateSpTblMissionfile(@RequestBody(required = true) SpTblMissionfile model) {
	    boolean update = sqTblMissionFile.updateById(model);
	    return update;
	}


	@DeleteMapping("deleteSpTblMissionfile")
	@ApiOperation(value = "删除任务单附件")
	public boolean deleteSpTblMissionfile(@RequestParam(required = true) Integer model) {
	    boolean update = sqTblMissionFile.removeById(model);
	    return update;
	}
}
