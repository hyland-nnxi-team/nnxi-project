package com.nnxi.web;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nnxi.model.DbCategory;
import com.nnxi.service.IDbCategoryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/order")
@Api(value = "类别 接口", description = "类别 接口")
public class DbCategoryController {
    @Reference
    public IDbCategoryService dbCategory;

    @PostMapping("/queryDbCategory")
    @ApiOperation(value = "查询类别接口")
    public Object queryDbCategory(@RequestBody(required = true) DbCategory data) {
        return dbCategory.queryCategory();
    }
}
