package com.leroy.attendance.controller;

import com.leroy.attendance.model.Courseware;
import com.leroy.attendance.service.CoursewareService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
/**
* Created by leroy on 2019-04-11.
*/
@Controller
@RequestMapping("/courseware")
@Api()
public class CoursewareController {
    @Resource
    private CoursewareService coursewareService;

    public void save(@Validated Courseware courseware) {

    }


}
