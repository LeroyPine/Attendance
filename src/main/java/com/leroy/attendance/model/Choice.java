package com.leroy.attendance.model;

import java.io.Serializable;
import javax.persistence.*;

public class Choice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String correct;

    /**
     * 选项id
     */
    @Column(name = "option_id")
    private Integer optionId;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return correct
     */
    public String getCorrect() {
        return correct;
    }

    /**
     * @param correct
     */
    public void setCorrect(String correct) {
        this.correct = correct;
    }

    /**
     * 获取选项id
     *
     * @return option_id - 选项id
     */
    public Integer getOptionId() {
        return optionId;
    }

    /**
     * 设置选项id
     *
     * @param optionId 选项id
     */
    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }
}