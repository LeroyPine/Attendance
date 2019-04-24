package com.leroy.attendance.service.impl;

import com.leroy.attendance.dao.ExamRecordMapper;
import com.leroy.attendance.model.ExamRecord;
import com.leroy.attendance.service.ExamRecordService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by leroy on 2019-04-22.
 */
@Service
@Transactional
public class ExamRecordServiceImpl  implements ExamRecordService {
    @Resource
    private ExamRecordMapper examRecordMapper;
    


}
