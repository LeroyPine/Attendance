package com.leroy.attendance.controller;

import com.leroy.attendance.model.Exam;
import com.leroy.attendance.service.ExamService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
/**
* Created by leroy on 2019-04-11.
*/
@Controller
@RequestMapping("/exam")
@Api(tags = "试卷")
public class ExamController {
    @Resource
    private ExamService examService;



    @PostMapping("/add")
    @ApiOperation(value = "添加试卷次级")
    public void save(Exam exam) {    //目前只做Choice


    }


}
