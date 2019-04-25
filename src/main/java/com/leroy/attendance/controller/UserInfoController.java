package com.leroy.attendance.controller;

import com.leroy.attendance.dao.UserInfoMapper;
import com.leroy.attendance.model.UserInfo;
import com.leroy.attendance.service.UserInfoService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by leroy on 2019-04-11.
*/
@RestController
@RequestMapping("/user/info")
@Api()
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService;
    @Resource
    private UserInfoMapper userInfoMapper;

    @PostMapping("/add")
    public void save(@RequestBody UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("openId",userInfo.getOpenId());
        List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
        if (userInfos != null && userInfos.size() > 0 ){
            return;
        }
        userInfoMapper.insertSelective(userInfo);
    }

    @GetMapping("/userInfo")
    public UserInfo save(String openId) {
        Example example = new Example(UserInfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("openId",openId);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
        if (userInfos != null && userInfos.size() > 0 ){
            return userInfos.get(0);
        }
        return null;
    }

}
