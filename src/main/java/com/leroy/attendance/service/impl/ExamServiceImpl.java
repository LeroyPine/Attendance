package com.leroy.attendance.service.impl;

import com.leroy.attendance.dao.ExamMapper;
import com.leroy.attendance.model.Exam;
import com.leroy.attendance.service.ExamService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by leroy on 2019-04-11.
 */
@Service
@Transactional
public class ExamServiceImpl  implements ExamService {
    @Resource
    private ExamMapper examMapper;
    


}
