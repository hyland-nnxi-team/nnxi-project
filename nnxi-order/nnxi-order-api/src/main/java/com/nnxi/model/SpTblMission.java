package com.nnxi.model;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * <p>
 * 任务单
 * </p>
 *
 * @author ming
 * @since 2019-08-08
 */
public class SpTblMission implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value="ID", type= IdType.AUTO)
	private Integer id;
    /**
     * 任务单号
     */
	private Integer missiono;
	private String service;
	private String price;
	private Integer onecategory;
	private Integer cusid;
    /**
     * 地址id
     */
	private Integer addrid;
    /**
     * 预约时间
     */
	private Date appointime;
    /**
     * 备注
     */
	private String remark;
    /**
     * 0 待接单  1 已接单（进行中）   2 完成待支付   3 （已支付）  4 取消
     */
	private Integer state;
    /**
     * 接单人id
     */
	private Integer receiveid;
    /**
     * 实付金额
     */
	private Float realpay;
    /**
     * 下单时间
     */
	private Date ordertime;
	private Integer score;
	private String comment;


	public Integer getId() {
		return id;
	}

	public SpTblMission setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getMissiono() {
		return missiono;
	}

	public SpTblMission setMissiono(Integer missiono) {
		this.missiono = missiono;
		return this;
	}

	public String getService() {
		return service;
	}

	public SpTblMission setService(String service) {
		this.service = service;
		return this;
	}

	public String getPrice() {
		return price;
	}

	public SpTblMission setPrice(String price) {
		this.price = price;
		return this;
	}

	public Integer getOnecategory() {
		return onecategory;
	}

	public SpTblMission setOnecategory(Integer onecategory) {
		this.onecategory = onecategory;
		return this;
	}

	public Integer getCusid() {
		return cusid;
	}

	public SpTblMission setCusid(Integer cusid) {
		this.cusid = cusid;
		return this;
	}

	public Integer getAddrid() {
		return addrid;
	}

	public SpTblMission setAddrid(Integer addrid) {
		this.addrid = addrid;
		return this;
	}

	public Date getAppointime() {
		return appointime;
	}

	public SpTblMission setAppointime(Date appointime) {
		this.appointime = appointime;
		return this;
	}

	public String getRemark() {
		return remark;
	}

	public SpTblMission setRemark(String remark) {
		this.remark = remark;
		return this;
	}

	public Integer getState() {
		return state;
	}

	public SpTblMission setState(Integer state) {
		this.state = state;
		return this;
	}

	public Integer getReceiveid() {
		return receiveid;
	}

	public SpTblMission setReceiveid(Integer receiveid) {
		this.receiveid = receiveid;
		return this;
	}

	public Float getRealpay() {
		return realpay;
	}

	public SpTblMission setRealpay(Float realpay) {
		this.realpay = realpay;
		return this;
	}

	public Date getOrdertime() {
		return ordertime;
	}

	public SpTblMission setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
		return this;
	}

	public Integer getScore() {
		return score;
	}

	public SpTblMission setScore(Integer score) {
		this.score = score;
		return this;
	}

	public String getComment() {
		return comment;
	}

	public SpTblMission setComment(String comment) {
		this.comment = comment;
		return this;
	}

	@Override
	public String toString() {
		return "SpTblMission{" +
			", id=" + id +
			", missiono=" + missiono +
			", service=" + service +
			", price=" + price +
			", onecategory=" + onecategory +
			", cusid=" + cusid +
			", addrid=" + addrid +
			", appointime=" + appointime +
			", remark=" + remark +
			", state=" + state +
			", receiveid=" + receiveid +
			", realpay=" + realpay +
			", ordertime=" + ordertime +
			", score=" + score +
			", comment=" + comment +
			"}";
	}
}
