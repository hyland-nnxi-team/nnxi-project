package com.nnxi.web;

import com.nnxi.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;

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

    @PostMapping
    @ApiOperation(value = "用户测试接口")
    public String queryCurrUser() {
        List<Map<String, Object>> maps = userService.listMaps();
        return "查询成功";
    }


}