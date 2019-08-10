package com.nnxi.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nnxi.mapper.SpTblMissionMapper;
import com.nnxi.model.SpTblMission;
import com.nnxi.service.ISpTblMissionService;

/**
 * <p>
 * 任务单 服务实现类
 * </p>
 *
 * @author ming
 * @since 2019-08-08
 */
@Service(interfaceClass = ISpTblMissionService.class)
public class SpTblMissionServiceImpl extends ServiceImpl<SpTblMissionMapper, SpTblMission> implements ISpTblMissionService {
@Autowired
private SpTblMissionMapper spTbMision;
	@Override
	public Object querySpTblMission() {
		QueryWrapper<SpTblMission> wrap =new QueryWrapper ();
		return spTbMision.selectList(wrap);
	}

	@Override
	public Object modifySpTblMission(SpTblMission data) {
		return spTbMision.updateById(data);
	}

	@Override
	public Object saveSpTblMission(SpTblMission data) {
		return spTbMision.insert(data);
	}
	
}
