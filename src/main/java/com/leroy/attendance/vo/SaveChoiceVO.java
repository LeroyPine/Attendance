package com.leroy.attendance.vo;

import java.util.List;

public class SaveChoiceVO {

    private String choiceTitle;
    private String paperName;
    private String correct;
    private List<String> optionTitle;


    public String getChoiceTitle() {
        return choiceTitle;
    }

    public void setChoiceTitle(String choiceTitle) {
        this.choiceTitle = choiceTitle;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public List<String> getOptionTitle() {
        return optionTitle;
    }

    public void setOptionTitle(List<String> optionTitle) {
        this.optionTitle = optionTitle;
    }
}
