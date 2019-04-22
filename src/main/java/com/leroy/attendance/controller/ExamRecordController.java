package com.leroy.attendance.controller;
import org.springframework.stereotype.Controller;
import com.leroy.attendance.model.ExamRecord;
import com.leroy.attendance.service.ExamRecordService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;
import javax.annotation.Resource;
import java.util.List;



import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
* Created by leroy on 2019-04-22.
*/
@Controller
@RequestMapping("/exam/record")
@Api()
public class ExamRecordController {
    @Resource
    private ExamRecordService examRecordService;

    public void save(@Validated ExamRecord examRecord) {

    }


}
