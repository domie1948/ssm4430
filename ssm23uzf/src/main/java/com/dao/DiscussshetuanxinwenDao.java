package com.dao;

import com.entity.DiscussshetuanxinwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshetuanxinwenVO;
import com.entity.view.DiscussshetuanxinwenView;


/**
 * 社团新闻评论表
 * 
 * @author 
 * @email 
 * @date 2020-11-26 08:47:16
 */
public interface DiscussshetuanxinwenDao extends BaseMapper<DiscussshetuanxinwenEntity> {
	
	List<DiscussshetuanxinwenVO> selectListVO(@Param("ew") Wrapper<DiscussshetuanxinwenEntity> wrapper);
	
	DiscussshetuanxinwenVO selectVO(@Param("ew") Wrapper<DiscussshetuanxinwenEntity> wrapper);
	
	List<DiscussshetuanxinwenView> selectListView(@Param("ew") Wrapper<DiscussshetuanxinwenEntity> wrapper);

	List<DiscussshetuanxinwenView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshetuanxinwenEntity> wrapper);
	
	DiscussshetuanxinwenView selectView(@Param("ew") Wrapper<DiscussshetuanxinwenEntity> wrapper);
	
}
