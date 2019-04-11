package com.leroy.attendance.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "user_score")
public class UserScore implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "paper_id")
    private Integer paperId;

    private String score;

    @Column(name = "completion_time")
    private Date completionTime;

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
     * @return score
     */
    public String getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(String score) {
        this.score = score;
    }

    /**
     * @return completion_time
     */
    public Date getCompletionTime() {
        return completionTime;
    }

    /**
     * @param completionTime
     */
    public void setCompletionTime(Date completionTime) {
        this.completionTime = completionTime;
    }
}