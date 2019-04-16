package com.leroy.attendance.controller;

import com.leroy.attendance.dao.CheckRecordMapper;
import com.leroy.attendance.model.CheckRecord;
import com.leroy.attendance.service.CheckRecordService;
import com.leroy.attendance.vo.RecordVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static com.leroy.attendance.vo.RecordVO.getRecordVO;

/**
* Created by leroy on 2019-04-11.
*/
@Controller
@RequestMapping("/check/record")
@Api()
public class CheckRecordController {
    @Resource
    private CheckRecordService checkRecordService;
    @Resource
    private CheckRecordMapper checkRecordMapper;


    @ResponseBody
    @RequestMapping("/save")
    @ApiOperation(value = "考勤打卡/签退")
    public RecordVO save(CheckRecord checkRecord) {
        CheckRecord checkRecord2 = checkExist(checkRecord);
        if (checkRecord2 != null){
            checkRecord2.setEndState(checkRecord.getEndState());
            checkRecordMapper.updateByPrimaryKeySelective(checkRecord2);
        }else {
            checkRecord.setCrateDate(new Date());
            checkRecord.setEndState(0);
            checkRecordMapper.insertSelective(checkRecord);
        }
        RecordVO recordVO = homeIndex(checkRecord.getUserId());
        return recordVO;
    }

    @ResponseBody
    @RequestMapping("/dataStat")
    @ApiOperation(value = "首页数据考勤打卡/签退")
    public RecordVO getHome(Integer userId) {
        RecordVO recordVO = homeIndex(userId);
        return recordVO;
    }




    public CheckRecord checkExist(CheckRecord checkRecord){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Example example = new Example(CheckRecord.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("crateDate","%"+format.format(new Date())+"%");
        criteria.andEqualTo("userId",checkRecord.getUserId());
        criteria.andEqualTo("cwId",checkRecord.getCwId());
        List<CheckRecord> checkRecords = checkRecordMapper.selectByExample(example);
        if (checkRecords != null && checkRecords.size() > 0){
            return checkRecords.get(0);
        }
        return null;
    }


    public RecordVO homeIndex(Integer userId){
        RecordVO recordVO = getRecordVO(999);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Example example = new Example(CheckRecord.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("crateDate","%"+format.format(new Date())+"%");
        criteria.andEqualTo("userId",userId);
        List<CheckRecord> checkRecords = checkRecordMapper.selectByExample(example);
        if (checkRecords != null && checkRecords.size() > 0){
            for (CheckRecord record : checkRecords) {
                switch (record.getCwId()){
                    case 1:
                        if (record.getStartState() != null) {
                            recordVO.setNoSureForChineseMon(record.getStartState());
                        }
                        if (record.getEndState() != null) {
                            recordVO.setNoSureForChineseAft(record.getEndState());
                        }
                        break;
                    case 2:
                        if (record.getStartState() != null) {
                            recordVO.setNoSureForPathMon(record.getStartState());
                        }
                        if (record.getEndState() != null) {
                            recordVO.setNoSureForPathAft(record.getEndState());
                        }
                        break;
                    case 3:
                        if (record.getStartState() != null) {
                            recordVO.setNoSureForEngMon(record.getStartState());
                        }
                        if (record.getEndState() != null) {
                            recordVO.setNoSureForEngAft(record.getEndState());
                        }
                        break;
                }
            }
        }
        return recordVO;
    }

}
