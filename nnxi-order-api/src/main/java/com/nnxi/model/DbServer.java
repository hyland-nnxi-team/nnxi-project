package com.nnxi.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 服务项目
 * </p>
 *
 * @author ming
 * @since 2019-08-08
 */
@TableName("db_server")
public class DbServer implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value="ID",type=IdType.AUTO)
	private Integer id;
    /**
     * 服务项目
     */
	private String service;
    /**
     * 价格
     */
	private BigDecimal price;
    /**
     * 类别编号
     */
	private String cacode;
    /**
     * 商户id
     */
	@TableField("spID")
	private String spID;


	public Integer getId() {
		return id;
	}

	public DbServer setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getService() {
		return service;
	}

	public DbServer setService(String service) {
		this.service = service;
		return this;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public DbServer setPrice(BigDecimal price) {
		this.price = price;
		return this;
	}

	public String getCacode() {
		return cacode;
	}

	public DbServer setCacode(String cacode) {
		this.cacode = cacode;
		return this;
	}

	public String getSpID() {
		return spID;
	}

	public DbServer setSpID(String spID) {
		this.spID = spID;
		return this;
	}

	@Override
	public String toString() {
		return "DbServer{" +
			", id=" + id +
			", service=" + service +
			", price=" + price +
			", cacode=" + cacode +
			", spID=" + spID +
			"}";
	}
}
