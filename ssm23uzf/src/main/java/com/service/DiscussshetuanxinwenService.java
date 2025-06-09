package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshetuanxinwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshetuanxinwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshetuanxinwenView;


/**
 * 社团新闻评论表
 *
 * @author 
 * @email 
 * @date 2020-11-26 08:47:16
 */
public interface DiscussshetuanxinwenService extends IService<DiscussshetuanxinwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshetuanxinwenVO> selectListVO(Wrapper<DiscussshetuanxinwenEntity> wrapper);
   	
   	DiscussshetuanxinwenVO selectVO(@Param("ew") Wrapper<DiscussshetuanxinwenEntity> wrapper);
   	
   	List<DiscussshetuanxinwenView> selectListView(Wrapper<DiscussshetuanxinwenEntity> wrapper);
   	
   	DiscussshetuanxinwenView selectView(@Param("ew") Wrapper<DiscussshetuanxinwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshetuanxinwenEntity> wrapper);
   	
}

