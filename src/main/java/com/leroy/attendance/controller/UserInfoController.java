package com.leroy.attendance.controller;

import com.leroy.attendance.model.UserInfo;
import com.leroy.attendance.service.UserInfoService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
/**
* Created by leroy on 2019-04-11.
*/
@Controller
@RequestMapping("/user/info")
@Api()
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService;

    public void save(@Validated UserInfo userInfo) {

    }


}
