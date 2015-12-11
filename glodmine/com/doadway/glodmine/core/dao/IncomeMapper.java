package com.doadway.glodmine.core.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.doadway.glodmine.core.model.Income;
import com.doadway.glodmine.core.model.IncomeExample;
import com.enation.framework.pager.simple.Page;
@Repository
public interface IncomeMapper {
    int countByExample(IncomeExample example);

    int deleteByExample(IncomeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Income record);

    int insertSelective(Income record);

    List<Income> selectByExample(IncomeExample example);

    Income selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Income record, @Param("example") IncomeExample example);

    int updateByExample(@Param("record") Income record, @Param("example") IncomeExample example);

    int updateByPrimaryKeySelective(Income record);

    int updateByPrimaryKey(Income record);
    
    public List<Income> selectIncomeByPage(@Param("page")Page page,@Param("params")Map<String, Object> params);
    
    public List<Income> countIncomeByDate(@Param("params")Map<String, Object> params);
}