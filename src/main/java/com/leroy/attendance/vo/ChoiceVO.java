package com.leroy.attendance.vo;

import com.leroy.attendance.model.Choice;
import com.leroy.attendance.model.Optionn;

import java.util.List;

public class ChoiceVO {

    private String examTitle;

    private Choice choice;

    private List<Optionn> optionList;

    public List<Optionn> getOptionList() {
        return optionList;
    }

    public String getExamTitle() {
        return examTitle;
    }

    public void setExamTitle(String examTitle) {
        this.examTitle = examTitle;
    }

    public void setOptionList(List<Optionn> optionList) {
        this.optionList = optionList;
    }

    public Choice getChoice() {
        return choice;
    }

    public void setChoice(Choice choice) {
        this.choice = choice;
    }
}
