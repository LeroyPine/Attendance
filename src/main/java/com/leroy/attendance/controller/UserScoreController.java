package com.leroy.attendance.controller;

import com.leroy.attendance.dao.ChoiceMapper;
import com.leroy.attendance.dao.ExamRecordMapper;
import com.leroy.attendance.dao.PaperMapper;
import com.leroy.attendance.dao.UserScoreMapper;
import com.leroy.attendance.model.Choice;
import com.leroy.attendance.model.ExamRecord;
import com.leroy.attendance.model.UserScore;
import com.leroy.attendance.service.UserScoreService;
import com.leroy.attendance.vo.GradeVO;
import com.leroy.attendance.vo.UserScoreVO;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
* Created by leroy on 2019-04-11.
*/
@Controller
@RequestMapping("/user/score")
@Api()
public class UserScoreController {
    @Resource
    private UserScoreService userScoreService;
    @Resource
    private UserScoreMapper userScoreMapper;
    @Resource
    private PaperMapper paperMapper;
    @Resource
    private ChoiceMapper choiceMapper;
    @Resource
    private ExamRecordMapper examRecordMapper;


    @PostMapping("/save")
    public String save(GradeVO gradeVO) {
        List<String> answers = gradeVO.getAnswers();  //传递过来的
        if (gradeVO.getAnswers() == null){
           return "answer 不能为空";
        }
        Integer paperId = gradeVO.getPaperId();
        List<Choice> choiceList = choiceMapper.selectChoiceListByPaperId(paperId);  //correct answer
        Integer score = 0;
        for (int i = 0; i < choiceList.size(); i++) {
            ExamRecord examRecord = new ExamRecord();
            examRecord.setChoiceId(choiceList.get(i).getId());   //设置选择题id
            examRecord.setPaperId(paperId);
            if (choiceList.get(i).getCorrect().equals(answers.get(i))){
                score += 20;
                examRecord.setRrect(true);
            }
            examRecord.setRrect(false);
        }
        //考试记录
        UserScore userScore = new UserScore();
        userScore.setPaperId(paperId);
        userScore.setScore(score);
        userScore.setCompletionTime(new Date());
        return score.toString();   //返回所得分数
    }



    @GetMapping("/userScoreList")  //分数列表
    @ResponseBody
    public List<UserScoreVO> findUserScore(Integer userId){
        List<UserScoreVO> userScores = userScoreMapper.selectUserScoreVOList(userId);
        return userScores;
    }




}
