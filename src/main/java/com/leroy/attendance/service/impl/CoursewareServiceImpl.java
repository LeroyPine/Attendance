package com.leroy.attendance.service.impl;

import com.leroy.attendance.dao.CoursewareMapper;
import com.leroy.attendance.model.Courseware;
import com.leroy.attendance.service.CoursewareService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by leroy on 2019-04-11.
 */
@Service
@Transactional
public class CoursewareServiceImpl  implements CoursewareService {
    @Resource
    private CoursewareMapper coursewareMapper;
    


}
