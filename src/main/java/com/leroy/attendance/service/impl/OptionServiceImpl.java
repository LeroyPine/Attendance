package com.leroy.attendance.service.impl;

import com.leroy.attendance.dao.OptionnMapper;
import com.leroy.attendance.service.OptionnService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by leroy on 2019-04-11.
 */
@Service
@Transactional
public class OptionServiceImpl implements OptionnService {
    @Resource
    private OptionnMapper optionMapper;
    


}
