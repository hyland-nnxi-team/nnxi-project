package com.nnxi.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * <p>
 * 用户地址
 * </p>
 *
 * @author ming
 * @since 2019-08-08
 */
public class DbCusAddr implements Serializable {

    private static final long serialVersionUID = 1L;

	@TableId(value="ID", type= IdType.AUTO)
	private Integer id;
    /**
     * 客户id
     */
	private Integer cusid;
    /**
     * 省份id
     */
	private Integer province;
    /**
     * 城市id
     */
	private Integer city;
    /**
     * 区域id
     */
	private Integer district;
    /**
     * 地址
     */
	private Integer address;
    /**
     * 联系人
     */
	private String user;
    /**
     * 联系电话
     */
	private String telephone;


	public Integer getId() {
		return id;
	}

	public DbCusAddr setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getCusid() {
		return cusid;
	}

	public DbCusAddr setCusid(Integer cusid) {
		this.cusid = cusid;
		return this;
	}

	public Integer getProvince() {
		return province;
	}

	public DbCusAddr setProvince(Integer province) {
		this.province = province;
		return this;
	}

	public Integer getCity() {
		return city;
	}

	public DbCusAddr setCity(Integer city) {
		this.city = city;
		return this;
	}

	public Integer getDistrict() {
		return district;
	}

	public DbCusAddr setDistrict(Integer district) {
		this.district = district;
		return this;
	}

	public Integer getAddress() {
		return address;
	}

	public DbCusAddr setAddress(Integer address) {
		this.address = address;
		return this;
	}

	public String getUser() {
		return user;
	}

	public DbCusAddr setUser(String user) {
		this.user = user;
		return this;
	}

	public String getTelephone() {
		return telephone;
	}

	public DbCusAddr setTelephone(String telephone) {
		this.telephone = telephone;
		return this;
	}

	@Override
	public String toString() {
		return "DbCusAddr{" +
			", id=" + id +
			", cusid=" + cusid +
			", province=" + province +
			", city=" + city +
			", district=" + district +
			", address=" + address +
			", user=" + user +
			", telephone=" + telephone +
			"}";
	}
}
