package com.nnxi.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nnxi.mapper.SpTblMissionfileMapper;
import com.nnxi.model.SpTblMissionfile;
import com.nnxi.service.ISpTblMissionfileService;

/**
 * <p>
 * 任务单附件 服务实现类
 * </p>
 *
 * @author ming
 * @since 2019-08-08
 */
@Service(interfaceClass = ISpTblMissionfileService.class)
public class SpTblMissionfileServiceImpl extends ServiceImpl<SpTblMissionfileMapper, SpTblMissionfile> implements ISpTblMissionfileService {
	@Autowired
	private SpTblMissionfileMapper spTbMisionFile;
	@Override
	public Object querySpTblMissionFile() {
		QueryWrapper<SpTblMissionfile> wrap =new  QueryWrapper<>();
		return spTbMisionFile.selectList(wrap);
	}

	@Override
	public Object modifySpTblMissionFile(SpTblMissionfile data) {
		return spTbMisionFile.updateById(data);
	}

	@Override
	public Object saveSpTblMissionFile(SpTblMissionfile data) {
		return spTbMisionFile.insert(data);
	}
	
	
}
