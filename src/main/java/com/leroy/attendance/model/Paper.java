package com.leroy.attendance.model;

import java.io.Serializable;
import javax.persistence.*;

public class Paper implements Serializable {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 试卷id
     */
    @Column(name = "exam_id")
    private Integer examId;

    /**
     * 创建人id
     */
    @Column(name = "create_user_id")
    private Integer createUserId;

    /**
     * 标题
     */
    private String title;

    /**
     * 及格线
     */
    @Column(name = "pass_line")
    private Integer passLine;

    /**
     * 满分
     */
    @Column(name = "full_marks")
    private Integer fullMarks;

    private static final long serialVersionUID = 1L;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取试卷id
     *
     * @return exam_id - 试卷id
     */
    public Integer getExamId() {
        return examId;
    }

    /**
     * 设置试卷id
     *
     * @param examId 试卷id
     */
    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    /**
     * 获取创建人id
     *
     * @return create_user_id - 创建人id
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建人id
     *
     * @param createUserId 创建人id
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取及格线
     *
     * @return pass_line - 及格线
     */
    public Integer getPassLine() {
        return passLine;
    }

    /**
     * 设置及格线
     *
     * @param passLine 及格线
     */
    public void setPassLine(Integer passLine) {
        this.passLine = passLine;
    }

    /**
     * 获取满分
     *
     * @return full_marks - 满分
     */
    public Integer getFullMarks() {
        return fullMarks;
    }

    /**
     * 设置满分
     *
     * @param fullMarks 满分
     */
    public void setFullMarks(Integer fullMarks) {
        this.fullMarks = fullMarks;
    }
}