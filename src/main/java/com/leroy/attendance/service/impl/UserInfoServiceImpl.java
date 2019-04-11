package com.leroy.attendance.service.impl;

import com.leroy.attendance.dao.UserInfoMapper;
import com.leroy.attendance.model.UserInfo;
import com.leroy.attendance.service.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by leroy on 2019-04-11.
 */
@Service
@Transactional
public class UserInfoServiceImpl  implements UserInfoService {
    @Resource
    private UserInfoMapper userInfoMapper;
    


}
