package com.leroy.attendance.service.impl;

import com.leroy.attendance.dao.ChoiceMapper;
import com.leroy.attendance.model.Choice;
import com.leroy.attendance.service.ChoiceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by leroy on 2019-04-19.
 */
@Service
@Transactional
public class ChoiceServiceImpl  implements ChoiceService {
    @Resource
    private ChoiceMapper choiceMapper;
    


}
