package com.nnxi.model;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * <p>
 * 服务商注册
 * </p>
 *
 * @author ming
 * @since 2019-08-15
 */
public class DbSpRegister implements Serializable {

    private static final long serialVersionUID = 1L;

	@TableId(value="ID", type= IdType.AUTO)
	private Integer id;
    /**
     * 姓名
     */
	private String sprname;
    /**
     * 性别 男1 女0 
     */
	private Integer gender;
    /**
     * 出生年月
     */
	private Date borndate;
    /**
     * 身份证
     */
	private String idcard;
    /**
     * 手机号码
     */
	private Integer phonenum;
    /**
     * 商家名称
     */
	private String spname;
    /**
     * 商家地址
     */
	private String spadd;
    /**
     * 服务种类
     */
	private String spcategory;
    /**
     * 服务省份
     */
	private String province;
    /**
     * 服务市
     */
	private String city;
    /**
     * 服务地区
     */
	private String district;
    /**
     * 服务镇街
     */
	private String address;
    /**
     * 身份证正面
     */
	private String idfront;
    /**
     * 身份证反面
     */
	private String idbehind;
    /**
     * 头像
     */
	private String icon;


	public Integer getId() {
		return id;
	}

	public DbSpRegister setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getSprname() {
		return sprname;
	}

	public DbSpRegister setSprname(String sprname) {
		this.sprname = sprname;
		return this;
	}

	public Integer getGender() {
		return gender;
	}

	public DbSpRegister setGender(Integer gender) {
		this.gender = gender;
		return this;
	}

	public Date getBorndate() {
		return borndate;
	}

	public DbSpRegister setBorndate(Date borndate) {
		this.borndate = borndate;
		return this;
	}

	public String getIdcard() {
		return idcard;
	}

	public DbSpRegister setIdcard(String idcard) {
		this.idcard = idcard;
		return this;
	}

	public Integer getPhonenum() {
		return phonenum;
	}

	public DbSpRegister setPhonenum(Integer phonenum) {
		this.phonenum = phonenum;
		return this;
	}

	public String getSpname() {
		return spname;
	}

	public DbSpRegister setSpname(String spname) {
		this.spname = spname;
		return this;
	}

	public String getSpadd() {
		return spadd;
	}

	public DbSpRegister setSpadd(String spadd) {
		this.spadd = spadd;
		return this;
	}

	public String getSpcategory() {
		return spcategory;
	}

	public DbSpRegister setSpcategory(String spcategory) {
		this.spcategory = spcategory;
		return this;
	}

	public String getProvince() {
		return province;
	}

	public DbSpRegister setProvince(String province) {
		this.province = province;
		return this;
	}

	public String getCity() {
		return city;
	}

	public DbSpRegister setCity(String city) {
		this.city = city;
		return this;
	}

	public String getDistrict() {
		return district;
	}

	public DbSpRegister setDistrict(String district) {
		this.district = district;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public DbSpRegister setAddress(String address) {
		this.address = address;
		return this;
	}

	public String getIdfront() {
		return idfront;
	}

	public DbSpRegister setIdfront(String idfront) {
		this.idfront = idfront;
		return this;
	}

	public String getIdbehind() {
		return idbehind;
	}

	public DbSpRegister setIdbehind(String idbehind) {
		this.idbehind = idbehind;
		return this;
	}

	public String getIcon() {
		return icon;
	}

	public DbSpRegister setIcon(String icon) {
		this.icon = icon;
		return this;
	}

	@Override
	public String toString() {
		return "DbSpRegister{" +
			", id=" + id +
			", sprname=" + sprname +
			", gender=" + gender +
			", borndate=" + borndate +
			", idcard=" + idcard +
			", phonenum=" + phonenum +
			", spname=" + spname +
			", spadd=" + spadd +
			", spcategory=" + spcategory +
			", province=" + province +
			", city=" + city +
			", district=" + district +
			", address=" + address +
			", idfront=" + idfront +
			", idbehind=" + idbehind +
			", icon=" + icon +
			"}";
	}
}
