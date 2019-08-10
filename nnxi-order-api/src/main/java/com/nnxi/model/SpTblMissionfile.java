package com.nnxi.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * <p>
 * 任务单附件
 * </p>
 *
 * @author ming
 * @since 2019-08-08
 */
public class SpTblMissionfile implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value="ID", type= IdType.AUTO)
	private Integer id;
	private Integer missionid;
	private String path;


	public Integer getId() {
		return id;
	}

	public SpTblMissionfile setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getMissionid() {
		return missionid;
	}

	public SpTblMissionfile setMissionid(Integer missionid) {
		this.missionid = missionid;
		return this;
	}

	public String getPath() {
		return path;
	}

	public SpTblMissionfile setPath(String path) {
		this.path = path;
		return this;
	}

	@Override
	public String toString() {
		return "SpTblMissionfile{" +
			", id=" + id +
			", missionid=" + missionid +
			", path=" + path +
			"}";
	}
}
