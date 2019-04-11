package com.leroy.attendance.controller;

import com.leroy.attendance.model.Exam;
import com.leroy.attendance.service.ExamService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
/**
* Created by leroy on 2019-04-11.
*/
@Controller
@RequestMapping("/exam")
@Api()
public class ExamController {
    @Resource
    private ExamService examService;

    public void save(@Validated Exam exam) {

    }


}
