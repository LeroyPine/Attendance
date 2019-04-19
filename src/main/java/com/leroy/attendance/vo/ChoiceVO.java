package com.leroy.attendance.vo;

import com.leroy.attendance.model.Choice;
import com.leroy.attendance.model.Option;

import java.util.List;

public class ChoiceVO {


    private Choice choice;

    private List<Option> optionList;

    public List<Option> getOptionList() {
        return optionList;
    }

    public void setOptionList(List<Option> optionList) {
        this.optionList = optionList;
    }

    public Choice getChoice() {
        return choice;
    }

    public void setChoice(Choice choice) {
        this.choice = choice;
    }
}
