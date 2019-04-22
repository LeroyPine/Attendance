package com.leroy.attendance.dao;

import com.leroy.attendance.model.Choice;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface ChoiceMapper extends Mapper<Choice> {

    //通过paperId 查询 出 选择题

   @Select("select * from choice where paper_id = #{paperId}")
   List<Choice> selectChoiceListByPaperId(@Param("paperId") Integer paperId);


   @Select("select correct from choice where paper_id = #{paperId}")
   List<String> selectChoiceAnswerListByPaperId(@Param("paperId")Integer paperId);
}