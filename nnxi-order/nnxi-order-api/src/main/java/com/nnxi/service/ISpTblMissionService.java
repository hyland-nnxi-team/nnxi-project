package com.nnxi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nnxi.model.SpTblMission;

/**
 * <p>
 * 任务单 服务类
 * </p>
 *
 * @author ming
 * @since 2019-08-08
 */
public interface ISpTblMissionService extends IService<SpTblMission> {
	
	Object querySpTblMission();
	
	Object modifySpTblMission(SpTblMission data);
	
	Object saveSpTblMission(SpTblMission data);
}
