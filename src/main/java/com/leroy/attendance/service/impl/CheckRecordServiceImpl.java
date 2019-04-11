package com.leroy.attendance.service.impl;

import com.leroy.attendance.dao.CheckRecordMapper;
import com.leroy.attendance.model.CheckRecord;
import com.leroy.attendance.service.CheckRecordService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by leroy on 2019-04-11.
 */
@Service
@Transactional
public class CheckRecordServiceImpl  implements CheckRecordService {
    @Resource
    private CheckRecordMapper checkRecordMapper;
    


}
