package com.dao;

import com.entity.ChongwuxihuLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuxihuLiuyanView;

/**
 * 萌宠洗护留言 Dao 接口
 *
 * @author 
 */
public interface ChongwuxihuLiuyanDao extends BaseMapper<ChongwuxihuLiuyanEntity> {

   List<ChongwuxihuLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
