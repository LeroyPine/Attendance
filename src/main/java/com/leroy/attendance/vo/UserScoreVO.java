package com.leroy.attendance.vo;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class UserScoreVO {


    @ApiModelProperty(value = "名称")
    private String paperName;

    private Integer id;

    private Integer paperId;

    private Integer score;

    private Date completionTime;

    public String getPaperName() {
        return paperName;
    }



    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(Date completionTime) {
        this.completionTime = completionTime;
    }
}
