package com.dao;

import com.entity.ChongwuxihuCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuxihuCollectionView;

/**
 * 萌宠洗护收藏 Dao 接口
 *
 * @author 
 */
public interface ChongwuxihuCollectionDao extends BaseMapper<ChongwuxihuCollectionEntity> {

   List<ChongwuxihuCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
