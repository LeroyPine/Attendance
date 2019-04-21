package com.leroy.attendance.controller;

import com.leroy.attendance.dao.ChoiceMapper;
import com.leroy.attendance.dao.OptionnMapper;
import com.leroy.attendance.dao.PaperMapper;
import com.leroy.attendance.model.Choice;
import com.leroy.attendance.model.Optionn;
import com.leroy.attendance.model.Paper;
import com.leroy.attendance.service.ChoiceService;
import com.leroy.attendance.vo.SaveChoiceVO;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by leroy on 2019-04-19.
 */
@Controller
@RequestMapping("/choice")
@Api()
public class ChoiceController {
    @Resource
    private PaperMapper paperMapper;
    @Resource
    private ChoiceService choiceService;
    @Resource
    private ChoiceMapper choiceMapper;
    @Resource
    private OptionnMapper optionMapper;

    @PostMapping("/save")
    @ResponseBody
    @Transactional
    public String save(SaveChoiceVO saveChoiceVO, Model model) {
        System.out.println(123);
        String paperName = saveChoiceVO.getPaperName();
        Example example = new Example(Paper.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("title",paperName);
        List<Paper> papers = paperMapper.selectByExample(example);
        Paper paper = papers.get(0);
        Choice choice = new Choice();
        choice.setPaperId(paper.getId());
        choice.setTitle(saveChoiceVO.getChoiceTitle());
        choice.setCorrect(saveChoiceVO.getCorrect());
        choiceMapper.insertSelective(choice);
        List<String> optionTitle = saveChoiceVO.getOptionTitle();
        for (String content : optionTitle) {
            Optionn option = new Optionn();
            option.setChoiceId(choice.getId());
            option.setContent(content);
            optionMapper.insertSelective(option);
        }
        return "添加成功";
    }


}
