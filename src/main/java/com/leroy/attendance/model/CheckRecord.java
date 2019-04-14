package com.leroy.attendance.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "check_record")
public class CheckRecord implements Serializable {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户Id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 课程Id
     */
    @Column(name = "cw_id")
    private Integer cwId;

    /**
     * 创建日期
     */
    @Column(name = "crate_date")
    private Date crateDate;

    /**
     * 开始状态
     */
    @Column(name = "start_state")
    private Integer startState;

    /**
     * 结束状态
     */
    @Column(name = "end_state")
    private Integer endState;

    private static final long serialVersionUID = 1L;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户Id
     *
     * @return user_id - 用户Id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户Id
     *
     * @param userId 用户Id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取课程Id
     *
     * @return cw_id - 课程Id
     */
    public Integer getCwId() {
        return cwId;
    }

    /**
     * 设置课程Id
     *
     * @param cwId 课程Id
     */
    public void setCwId(Integer cwId) {
        this.cwId = cwId;
    }

    /**
     * 获取创建日期
     *
     * @return crate_date - 创建日期
     */
    public Date getCrateDate() {
        return crateDate;
    }

    /**
     * 设置创建日期
     *
     * @param crateDate 创建日期
     */
    public void setCrateDate(Date crateDate) {
        this.crateDate = crateDate;
    }

    /**
     * 获取开始状态
     *
     * @return start_state - 开始状态
     */
    public Integer getStartState() {
        return startState;
    }

    /**
     * 设置开始状态
     *
     * @param startState 开始状态
     */
    public void setStartState(Integer startState) {
        this.startState = startState;
    }

    /**
     * 获取结束状态
     *
     * @return end_state - 结束状态
     */
    public Integer getEndState() {
        return endState;
    }

    /**
     * 设置结束状态
     *
     * @param endState 结束状态
     */
    public void setEndState(Integer endState) {
        this.endState = endState;
    }
}