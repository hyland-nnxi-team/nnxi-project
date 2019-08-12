package com.nnxi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nnxi.model.SpTblMissionfile;

/**
 * <p>
 * 任务单附件 服务类
 * </p>
 *
 * @author ming
 * @since 2019-08-08
 */
public interface ISpTblMissionfileService extends IService<SpTblMissionfile> {


     Object querySpTblMissionFile();
	
	Object modifySpTblMissionFile(SpTblMissionfile data);
	
	Object saveSpTblMissionFile(SpTblMissionfile data);
}
