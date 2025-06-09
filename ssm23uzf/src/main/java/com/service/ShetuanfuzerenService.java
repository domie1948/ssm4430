package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShetuanfuzerenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShetuanfuzerenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShetuanfuzerenView;


/**
 * 社团负责人
 *
 * @author 
 * @email 
 * @date 2020-11-26 08:47:15
 */
public interface ShetuanfuzerenService extends IService<ShetuanfuzerenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShetuanfuzerenVO> selectListVO(Wrapper<ShetuanfuzerenEntity> wrapper);
   	
   	ShetuanfuzerenVO selectVO(@Param("ew") Wrapper<ShetuanfuzerenEntity> wrapper);
   	
   	List<ShetuanfuzerenView> selectListView(Wrapper<ShetuanfuzerenEntity> wrapper);
   	
   	ShetuanfuzerenView selectView(@Param("ew") Wrapper<ShetuanfuzerenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShetuanfuzerenEntity> wrapper);
   	
}

