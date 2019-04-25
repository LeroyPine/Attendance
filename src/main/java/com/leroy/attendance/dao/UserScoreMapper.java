package com.leroy.attendance.dao;

import com.leroy.attendance.model.UserScore;
import com.leroy.attendance.vo.UserScoreVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserScoreMapper extends Mapper<UserScore> {

    /**
     * 通过用户 id 去查询
     * @param userId
     * @return
     */
    @Select("select paper.title paperName,user_score.score,user_score.completion_time completionTime," +
            " user_score.paper_id paperId,user_score.id from  user_score left join paper  on user_score.paper_id = paper.id " +
            " where user_score.user_id =  #{userId}  ")
    List<UserScoreVO> selectUserScoreVOList(@Param("userId") Integer userId);
}