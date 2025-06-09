package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShetuanjingfeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShetuanjingfeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShetuanjingfeiView;


/**
 * 社团经费
 *
 * @author 
 * @email 
 * @date 2020-11-26 08:47:15
 */
public interface ShetuanjingfeiService extends IService<ShetuanjingfeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShetuanjingfeiVO> selectListVO(Wrapper<ShetuanjingfeiEntity> wrapper);
   	
   	ShetuanjingfeiVO selectVO(@Param("ew") Wrapper<ShetuanjingfeiEntity> wrapper);
   	
   	List<ShetuanjingfeiView> selectListView(Wrapper<ShetuanjingfeiEntity> wrapper);
   	
   	ShetuanjingfeiView selectView(@Param("ew") Wrapper<ShetuanjingfeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShetuanjingfeiEntity> wrapper);
   	
}

