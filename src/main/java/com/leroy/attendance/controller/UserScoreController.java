package com.leroy.attendance.controller;

import com.leroy.attendance.model.UserScore;
import com.leroy.attendance.service.UserScoreService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
/**
* Created by leroy on 2019-04-11.
*/
@Controller
@RequestMapping("/user/score")
@Api()
public class UserScoreController {
    @Resource
    private UserScoreService userScoreService;

    public void save(@Validated UserScore userScore) {

    }


}
