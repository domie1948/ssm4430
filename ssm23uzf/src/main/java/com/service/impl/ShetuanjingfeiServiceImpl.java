package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShetuanjingfeiDao;
import com.entity.ShetuanjingfeiEntity;
import com.service.ShetuanjingfeiService;
import com.entity.vo.ShetuanjingfeiVO;
import com.entity.view.ShetuanjingfeiView;

@Service("shetuanjingfeiService")
public class ShetuanjingfeiServiceImpl extends ServiceImpl<ShetuanjingfeiDao, ShetuanjingfeiEntity> implements ShetuanjingfeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShetuanjingfeiEntity> page = this.selectPage(
                new Query<ShetuanjingfeiEntity>(params).getPage(),
                new EntityWrapper<ShetuanjingfeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShetuanjingfeiEntity> wrapper) {
		  Page<ShetuanjingfeiView> page =new Query<ShetuanjingfeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShetuanjingfeiVO> selectListVO(Wrapper<ShetuanjingfeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShetuanjingfeiVO selectVO(Wrapper<ShetuanjingfeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShetuanjingfeiView> selectListView(Wrapper<ShetuanjingfeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShetuanjingfeiView selectView(Wrapper<ShetuanjingfeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
