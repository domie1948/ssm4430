package com.dao;

import com.entity.ShetuanfuzerenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShetuanfuzerenVO;
import com.entity.view.ShetuanfuzerenView;


/**
 * 社团负责人
 * 
 * @author 
 * @email 
 * @date 2020-11-26 08:47:15
 */
public interface ShetuanfuzerenDao extends BaseMapper<ShetuanfuzerenEntity> {
	
	List<ShetuanfuzerenVO> selectListVO(@Param("ew") Wrapper<ShetuanfuzerenEntity> wrapper);
	
	ShetuanfuzerenVO selectVO(@Param("ew") Wrapper<ShetuanfuzerenEntity> wrapper);
	
	List<ShetuanfuzerenView> selectListView(@Param("ew") Wrapper<ShetuanfuzerenEntity> wrapper);

	List<ShetuanfuzerenView> selectListView(Pagination page,@Param("ew") Wrapper<ShetuanfuzerenEntity> wrapper);
	
	ShetuanfuzerenView selectView(@Param("ew") Wrapper<ShetuanfuzerenEntity> wrapper);
	
}
