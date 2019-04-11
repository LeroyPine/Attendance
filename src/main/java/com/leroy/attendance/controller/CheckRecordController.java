package com.leroy.attendance.controller;

import com.leroy.attendance.model.CheckRecord;
import com.leroy.attendance.service.CheckRecordService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
* Created by leroy on 2019-04-11.
*/
@Controller
@RequestMapping("/check/record")
@Api()
public class CheckRecordController {
    @Resource
    private CheckRecordService checkRecordService;

    public void save(@Validated CheckRecord checkRecord) {

    }


}
