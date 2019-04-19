package com.leroy.attendance.dao;

import com.leroy.attendance.model.Option;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface OptionMapper extends Mapper<Option> {


    @Select("select * from option where choice_id = #{choiceId}")
    List<Option> selectOption(@Param("choiceId")Integer choiceId);
}