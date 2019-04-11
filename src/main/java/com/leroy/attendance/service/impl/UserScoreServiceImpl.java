package com.leroy.attendance.service.impl;

import com.leroy.attendance.dao.UserScoreMapper;
import com.leroy.attendance.model.UserScore;
import com.leroy.attendance.service.UserScoreService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by leroy on 2019-04-11.
 */
@Service
@Transactional
public class UserScoreServiceImpl  implements UserScoreService {
    @Resource
    private UserScoreMapper userScoreMapper;
    


}
