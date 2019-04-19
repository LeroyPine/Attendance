package com.leroy.attendance.service.impl;

import com.leroy.attendance.dao.PaperMapper;
import com.leroy.attendance.model.Paper;
import com.leroy.attendance.service.PaperService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by leroy on 2019-04-19.
 */
@Service
@Transactional
public class PaperServiceImpl  implements PaperService {
    @Resource
    private PaperMapper paperMapper;
    


}
