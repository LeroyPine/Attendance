package com.leroy.attendance.model;

import java.io.Serializable;
import javax.persistence.*;

public class Exam implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "choice_id")
    private Integer choiceId;

    @Column(name = "judge_id")
    private Integer judgeId;

    @Column(name = "short_question_id")
    private Integer shortQuestionId;

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
     * @return choice_id
     */
    public Integer getChoiceId() {
        return choiceId;
    }

    /**
     * @param choiceId
     */
    public void setChoiceId(Integer choiceId) {
        this.choiceId = choiceId;
    }

    /**
     * @return judge_id
     */
    public Integer getJudgeId() {
        return judgeId;
    }

    /**
     * @param judgeId
     */
    public void setJudgeId(Integer judgeId) {
        this.judgeId = judgeId;
    }

    /**
     * @return short_question_id
     */
    public Integer getShortQuestionId() {
        return shortQuestionId;
    }

    /**
     * @param shortQuestionId
     */
    public void setShortQuestionId(Integer shortQuestionId) {
        this.shortQuestionId = shortQuestionId;
    }
}