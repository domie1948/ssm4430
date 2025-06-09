package com.dao;

import com.entity.ShetuanjingfeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShetuanjingfeiVO;
import com.entity.view.ShetuanjingfeiView;


/**
 * 社团经费
 * 
 * @author 
 * @email 
 * @date 2020-11-26 08:47:15
 */
public interface ShetuanjingfeiDao extends BaseMapper<ShetuanjingfeiEntity> {
	
	List<ShetuanjingfeiVO> selectListVO(@Param("ew") Wrapper<ShetuanjingfeiEntity> wrapper);
	
	ShetuanjingfeiVO selectVO(@Param("ew") Wrapper<ShetuanjingfeiEntity> wrapper);
	
	List<ShetuanjingfeiView> selectListView(@Param("ew") Wrapper<ShetuanjingfeiEntity> wrapper);

	List<ShetuanjingfeiView> selectListView(Pagination page,@Param("ew") Wrapper<ShetuanjingfeiEntity> wrapper);
	
	ShetuanjingfeiView selectView(@Param("ew") Wrapper<ShetuanjingfeiEntity> wrapper);
	
}
