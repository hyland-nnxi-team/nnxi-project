package com.nnxi.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * <p>
 * 类别
 * </p>
 *
 * @author ming
 * @since 2019-08-07
 */
public class DbCategory implements Serializable {

    private static final long serialVersionUID = 1L;

	@TableId(value="ID", type= IdType.AUTO)
	private Integer id;
    /**
     * 用code
     */
	private String prcode;
	private String code;
	private String name;
    /**
     * 1 一级分类  2二级分类
     */
	private Integer category;
    /**
     * 0 停用  1 启用
     */
	private Integer state;


	public Integer getId() {
		return id;
	}

	public DbCategory setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getPrcode() {
		return prcode;
	}

	public DbCategory setPrcode(String prcode) {
		this.prcode = prcode;
		return this;
	}

	public String getCode() {
		return code;
	}

	public DbCategory setCode(String code) {
		this.code = code;
		return this;
	}

	public String getName() {
		return name;
	}

	public DbCategory setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getCategory() {
		return category;
	}

	public DbCategory setCategory(Integer category) {
		this.category = category;
		return this;
	}

	public Integer getState() {
		return state;
	}

	public DbCategory setState(Integer state) {
		this.state = state;
		return this;
	}

	@Override
	public String toString() {
		return "DbCategory{" +
			", id=" + id +
			", prcode=" + prcode +
			", code=" + code +
			", name=" + name +
			", category=" + category +
			", state=" + state +
			"}";
	}
}
