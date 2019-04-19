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
     * 试卷id
     */
    @Column(name = "paper_id")
    private Integer paperId;

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
     * 获取试卷id
     *
     * @return paper_id - 试卷id
     */
    public Integer getPaperId() {
        return paperId;
    }

    /**
     * 设置试卷id
     *
     * @param paperId 试卷id
     */
    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }
}