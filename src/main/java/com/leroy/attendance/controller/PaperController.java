package com.leroy.attendance.controller;

import com.leroy.attendance.dao.PaperMapper;
import com.leroy.attendance.model.Paper;
import com.leroy.attendance.service.PaperService;
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
@RequestMapping("/paper")
@Api(value = "试卷主体")
public class PaperController {
    @Resource
    private PaperService paperService;

    @Resource
    private PaperMapper paperMapper;

    @PostMapping("/save")
    @ApiOperation(value = "创建试卷主体")
    public void save(Paper paper) {
        paperMapper.insert(paper);
    }


}
