package com.leroy.attendance.controller;

import com.leroy.attendance.model.Option;
import com.leroy.attendance.service.OptionService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
/**
* Created by leroy on 2019-04-11.
*/
@Controller
@RequestMapping("/option")
@Api()
public class OptionController {
    @Resource
    private OptionService optionService;

    public void save(Option option) {

    }


}
