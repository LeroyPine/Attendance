package com.leroy.attendance.controller;

import com.leroy.attendance.dao.ChoiceMapper;
import com.leroy.attendance.dao.OptionMapper;
import com.leroy.attendance.model.Choice;
import com.leroy.attendance.model.Option;
import com.leroy.attendance.service.ChoiceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
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
    @Resource
    private ChoiceMapper choiceMapper;
    @Resource
    private OptionMapper optionMapper;

    @PostMapping("/save")
    @ApiOperation(value = "保存")
    @Transactional
    public void save(Choice choice, Option option) {
        optionMapper.insertSelective(option);
        choice.setOptionId(option.getId());
        choiceMapper.insertSelective(choice);
    }


}
