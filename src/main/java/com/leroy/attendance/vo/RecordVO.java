package com.leroy.attendance.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "签到数据")
public class RecordVO {

    public RecordVO(){

    }

    public static RecordVO getRecordVO(Integer num){
        if (num == 999){
            RecordVO recordVO = new RecordVO();
            recordVO.setNoSureForChineseAft(0);
            recordVO.setNoSureForChineseMon(0);
            recordVO.setNoSureForEngAft(0);
            recordVO.setNoSureForEngMon(0);
            recordVO.setNoSureForPathAft(0);
            recordVO.setNoSureForPathMon(0);
            return recordVO;
        }
        return new RecordVO();
    }

    @ApiModelProperty(value = "语文上午")
    private Integer noSureForChineseMon;

    @ApiModelProperty(value = "语文下午")
    private Integer noSureForChineseAft;

    @ApiModelProperty(value = "数学上午")
    private Integer noSureForPathMon;

    @ApiModelProperty(value = "数学下午")
    private Integer noSureForPathAft;

    @ApiModelProperty(value = "英语上午")
    private Integer noSureForEngMon;

    @ApiModelProperty(value = "英语下午")
    private Integer noSureForEngAft;


    public Integer getNoSureForChineseMon() {
        return noSureForChineseMon;
    }

    public void setNoSureForChineseMon(Integer noSureForChineseMon) {
        this.noSureForChineseMon = noSureForChineseMon;
    }

    public Integer getNoSureForChineseAft() {
        return noSureForChineseAft;
    }

    public void setNoSureForChineseAft(Integer noSureForChineseAft) {
        this.noSureForChineseAft = noSureForChineseAft;
    }

    public Integer getNoSureForPathMon() {
        return noSureForPathMon;
    }

    public void setNoSureForPathMon(Integer noSureForPathMon) {
        this.noSureForPathMon = noSureForPathMon;
    }

    public Integer getNoSureForPathAft() {
        return noSureForPathAft;
    }

    public void setNoSureForPathAft(Integer noSureForPathAft) {
        this.noSureForPathAft = noSureForPathAft;
    }

    public Integer getNoSureForEngMon() {
        return noSureForEngMon;
    }

    public void setNoSureForEngMon(Integer noSureForEngMon) {
        this.noSureForEngMon = noSureForEngMon;
    }

    public Integer getNoSureForEngAft() {
        return noSureForEngAft;
    }

    public void setNoSureForEngAft(Integer noSureForEngAft) {
        this.noSureForEngAft = noSureForEngAft;
    }
}
