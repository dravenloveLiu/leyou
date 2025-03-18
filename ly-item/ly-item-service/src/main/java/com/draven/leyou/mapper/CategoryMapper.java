package com.draven.leyou.mapper;

import com.draven.leyou.item.pojo.Category;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;


public interface CategoryMapper extends BaseMapper<Category> {

    @Select("select * from tb_category where parent_id = #{category.parentId}")
    List<Category> selectList(@Param("category") Category category);
}