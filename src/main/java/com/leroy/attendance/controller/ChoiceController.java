package com.leroy.attendance.controller;

import com.leroy.attendance.dao.ChoiceMapper;
import com.leroy.attendance.dao.OptionMapper;
import com.leroy.attendance.model.Choice;
import com.leroy.attendance.model.Option;
import com.leroy.attendance.service.ChoiceService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by leroy on 2019-04-19.
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
    public String save(Choice choice, Integer paperId, Option option,Model model) {
        choice.setPaperId(paperId);
        choiceMapper.insertSelective(choice);
        option.setChoiceId(choice.getId());
        optionMapper.insertSelective(option);
        return "redirect:paper/detail?paperId="+paperId;
    }


}
