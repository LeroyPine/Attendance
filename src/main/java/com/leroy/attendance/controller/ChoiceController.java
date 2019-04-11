package com.leroy.attendance.controller;

import com.leroy.attendance.model.Choice;
import com.leroy.attendance.service.ChoiceService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
* Created by leroy on 2019-04-11.
*/
@Controller
@RequestMapping("/choice")
@Api()
public class ChoiceController {
    @Resource
    private ChoiceService choiceService;

    public void save(@Validated Choice choice) {

    }


}
