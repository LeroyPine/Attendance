package com.leroy.attendance.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Courseware implements Serializable {
    /**
     * course - id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * name

     */
    private String name;

    /**
     * 上课时间
     */
    @Column(name = "start_time")
    private String startTime;

    /**
     * 下课时间
     */
    @Column(name = "end_time")
    private String endTime;

    /**
     * 状态
     */
    private String state;

    private static final long serialVersionUID = 1L;

    /**
     * 获取course - id
     *
     * @return id - course - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置course - id
     *
     * @param id course - id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取name

     *
     * @return name - name

     */
    public String getName() {
        return name;
    }

    /**
     * 设置name

     *
     * @param name name

     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取上课时间
     *
     * @return start_time - 上课时间
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 设置上课时间
     *
     * @param startTime 上课时间
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取下课时间
     *
     * @return end_time - 下课时间
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 设置下课时间
     *
     * @param endTime 下课时间
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取状态
     *
     * @return state - 状态
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(String state) {
        this.state = state;
    }
}