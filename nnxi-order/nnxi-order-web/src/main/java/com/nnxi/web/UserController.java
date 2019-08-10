//package com.nnxi.web;
//
//import com.baomidou.mybatisplus.core.metadata.IPage;
//import com.nnxi.model.User;
//import com.nnxi.service.IUserService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.apache.dubbo.config.annotation.Reference;
//import org.springframework.web.bind.annotation.*;
//
//
//import javax.servlet.http.HttpServletRequest;
//import javax.validation.Valid;
//import java.util.List;
//import java.util.Map;
//
///**
// * 控制器
// *
// * @author hyl
// * @since 2018-08-02
// */
//@RestController
//@RequestMapping("/User")
//@Api(value = "员工接口", description = "员工测试接口")
//public class UserController {
//
//    @Reference
//    public IUserService userService;
//
//    @PostMapping("/page")
//    @ApiOperation(value = "分页查询接口")
//    public List<User> page(@RequestBody(required = true) IPage<User> page) {
//        IPage<User> result = userService.page(page);
//        List<User> records = result.getRecords();
//        return records;
//    }
//
//    @PostMapping
//    @ApiOperation(value = "插入接口")
//    public boolean save(@RequestBody(required = true) User model) {
//        boolean save = userService.save(model);
//        return save;
//    }
//
//    @PutMapping
//    @ApiOperation(value = "更新接口")
//    public boolean update(@RequestBody(required = true) User model) {
//        boolean update = userService.updateById(model);
//        return update;
//    }
//
//
//    @DeleteMapping
//    @ApiOperation(value = "删除接口")
//    public boolean delete(@RequestParam(required = true) Integer model) {
//        boolean update = userService.removeById(model);
//        return update;
//    }
//
//}