package com.nnxi.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nnxi.mapper.DbCategoryMapper;
import com.nnxi.model.DbCategory;
import com.nnxi.service.IDbCategoryService;

/**
 * <p>
 * 类别 服务实现类
 * </p>
 *
 * @author ming
 * @since 2019-08-07
 */
@Service(interfaceClass = IDbCategoryService.class)
public class DbCategoryServiceImpl extends ServiceImpl<DbCategoryMapper, DbCategory> implements IDbCategoryService {
	@Autowired
	private DbCategoryMapper category;

	@Override
	public Object queryCategory() {
		QueryWrapper<DbCategory> wrapper=new QueryWrapper<>();
		wrapper.eq("state", "1");
		wrapper.eq("category", "0");
		List<DbCategory> paInfo=category.selectList(wrapper);
		List<Map<String,Object>> list = new ArrayList<>();
		for (DbCategory dbCategory : paInfo) {
			Map<String,Object> obj=new HashMap<String,Object>();
			obj.put("code", dbCategory.getCode());
			obj.put("name", dbCategory.getName());
			obj.put("children", getChildren(dbCategory.getCode()));
			list.add(obj);
		}
		return list;
	}	
	public List<Map<String,Object>> getChildren(String parentId){
		List<Map<String,Object>> list = new ArrayList<>();
		QueryWrapper<DbCategory> wrapper=new QueryWrapper<>();
		wrapper.eq("state", "1");
		wrapper.eq("prcode", parentId);
		List<DbCategory> children =category.selectList(wrapper);
		for (DbCategory dbCategory : children) {
			Map<String,Object> obj=new HashMap<String,Object>();
			obj.put("code", dbCategory.getCode());
			obj.put("name", dbCategory.getName());
			List<Map<String,Object>> data=getChildren(dbCategory.getCode());
			if(data.size()>0)
			{
				obj.put("children",data);
			}
			list.add(obj);
		}
		return list;
	}

	
}
