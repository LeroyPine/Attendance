package com.leroy.attendance.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "exam_record")
public class ExamRecord implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "paper_id")
    private Integer paperId;

    @Column(name = "choice_id")
    private Integer choiceId;

    private Boolean rrect;

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
     * @return paper_id
     */
    public Integer getPaperId() {
        return paperId;
    }

    /**
     * @param paperId
     */
    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
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
     * @return rrect
     */
    public Boolean getRrect() {
        return rrect;
    }

    /**
     * @param rrect
     */
    public void setRrect(Boolean rrect) {
        this.rrect = rrect;
    }
}