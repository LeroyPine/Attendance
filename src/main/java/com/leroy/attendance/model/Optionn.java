package com.leroy.attendance.model;

import java.io.Serializable;
import javax.persistence.*;

public class Optionn implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "choice_id")
    private Integer choiceId;

    private String content;

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
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }
}