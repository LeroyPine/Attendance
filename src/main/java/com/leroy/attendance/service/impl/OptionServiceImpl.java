package com.leroy.attendance.service.impl;

import com.leroy.attendance.dao.OptionMapper;
import com.leroy.attendance.model.Option;
import com.leroy.attendance.service.OptionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by leroy on 2019-04-11.
 */
@Service
@Transactional
public class OptionServiceImpl  implements OptionService {
    @Resource
    private OptionMapper optionMapper;
    


}
