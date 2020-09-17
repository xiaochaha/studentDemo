package org.xyc.cs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xyc.cs.entity.Selection;
import org.xyc.cs.entity.SelectionExample;

public interface SelectionMapper {
    long countByExample(SelectionExample example);

    int deleteByExample(SelectionExample example);

    int deleteByPrimaryKey(Integer selectionId);

    int insert(Selection record);

    int insertSelective(Selection record);

    List<Selection> selectByExample(SelectionExample example);

    Selection selectByPrimaryKey(Integer selectionId);

    int updateByExampleSelective(@Param("record") Selection record, @Param("example") SelectionExample example);

    int updateByExample(@Param("record") Selection record, @Param("example") SelectionExample example);

    int updateByPrimaryKeySelective(Selection record);

    int updateByPrimaryKey(Selection record);
}