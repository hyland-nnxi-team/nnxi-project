package com.nnxi.web;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nnxi.model.User;
import com.nnxi.service.IUserService;
import com.nnxi.web.core.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


/**
 * 控制器
 *
 * @author hyl
 * @since 2018-08-02
 */
@RestController
@RequestMapping("/User")
@Api(value = "员工接口", description = "员工测试接口")
public class UserController {

    @Reference
    public IUserService userService;


    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Result<IPage<User>> queryPageList(@RequestBody(required = false) User sysDict, @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                                             @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize, HttpServletRequest req) {
        Result<IPage<User>> result = new Result<IPage<User>>();
        ///QueryWrapper<User> queryWrapper = QueryGenerator.initQueryWrapper(sysDict, req.getParameterMap());
        Page<User> page = new Page<User>(pageNo, pageSize);
        IPage<User> pageList = userService.page(page);
        result.setSuccess(true);
        result.setResult(pageList);
        return result;
    }


    @PostMapping
    @ApiOperation(value = "插入接口")
    public boolean save(@RequestBody(required = true) User model) {
        boolean save = userService.save(model);
        return save;
    }

    @PutMapping
    @ApiOperation(value = "更新接口")
    public boolean update(@RequestBody(required = true) User model) {
        boolean update = userService.updateById(model);
        return update;
    }


    @DeleteMapping
    @ApiOperation(value = "删除接口")
    public boolean delete(@RequestParam(required = true) Integer model) {
        boolean update = userService.removeById(model);
        return update;
    }

}