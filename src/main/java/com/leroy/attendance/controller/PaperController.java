package com.leroy.attendance.controller;
import com.leroy.attendance.dao.ChoiceMapper;
import com.leroy.attendance.dao.OptionnMapper;
import com.leroy.attendance.dao.PaperMapper;
import com.leroy.attendance.model.Choice;
import com.leroy.attendance.model.Optionn;
import com.leroy.attendance.vo.ChoiceVO;
import com.leroy.attendance.vo.PaperVO;
import org.springframework.stereotype.Controller;
import com.leroy.attendance.model.Paper;
import com.leroy.attendance.service.PaperService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.Api;

/**
* Created by leroy on 2019-04-19.
*/
@Controller
@RequestMapping("/paper")
@Api()
public class PaperController {
    @Resource
    private PaperService paperService;
    @Resource
    private PaperMapper paperMapper;
    @Resource
    private ChoiceMapper choiceMapper;
    @Resource
    private OptionnMapper optionMapper;

    @GetMapping("/save")
    public String save(Paper paper,Model model) {
         paperMapper.insertSelective(paper);
        List<Paper> papers = paperMapper.selectAll();
        model.addAttribute("paperList",papers);
        return "content";
    }


    @GetMapping("/list")
    public String list(Model model){
        List<Paper> papers = paperMapper.selectAll();
        model.addAttribute("paperList",papers);
        return "content";
    }


    @GetMapping("/detail")
    public String get(Integer paperId, Model model){
        List<Choice> choiceList = choiceMapper.selectChoiceListByPaperId(paperId);
        List<ChoiceVO> choiceVOList = new ArrayList<>();
        if (choiceList != null && choiceList.size() > 0){
            for (Choice choice : choiceList) {
                List<Optionn> optionList = optionMapper.selectOption(choice.getId());
                ChoiceVO choiceVO = new ChoiceVO();
                choiceVO.setChoice(choice);
                choiceVO.setOptionList(optionList);
                choiceVOList.add(choiceVO);
            }
        }
        PaperVO paperVO = new PaperVO();
        paperVO.setChoiceList(choiceVOList);
        model.addAttribute("choiceVOList",choiceVOList);
        return "content";
    }


    @GetMapping("/detailForWX")
    @ResponseBody
    public List<ChoiceVO> getWx(Integer paperId, Model model){
        List<Choice> choiceList = choiceMapper.selectChoiceListByPaperId(paperId);
        List<ChoiceVO> choiceVOList = new ArrayList<>();
        if (choiceList != null && choiceList.size() > 0){
            for (Choice choice : choiceList) {
                List<Optionn> optionList = optionMapper.selectOption(choice.getId());
                ChoiceVO choiceVO = new ChoiceVO();
                choiceVO.setChoice(choice);
                choiceVO.setOptionList(optionList);
                choiceVOList.add(choiceVO);
            }
        }
        return choiceVOList;
    }

}
