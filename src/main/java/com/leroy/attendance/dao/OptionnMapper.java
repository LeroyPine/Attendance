package com.leroy.attendance.dao;

import com.leroy.attendance.model.Optionn;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface OptionnMapper extends Mapper<Optionn> {

    @Select("select id,choice_id choiceId,content from optionn where choice_id = #{choiceId}")
    List<Optionn> selectOption(@Param("choiceId")Integer choiceId);
}