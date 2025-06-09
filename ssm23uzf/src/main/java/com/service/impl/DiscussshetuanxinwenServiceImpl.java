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


import com.dao.DiscussshetuanxinwenDao;
import com.entity.DiscussshetuanxinwenEntity;
import com.service.DiscussshetuanxinwenService;
import com.entity.vo.DiscussshetuanxinwenVO;
import com.entity.view.DiscussshetuanxinwenView;

@Service("discussshetuanxinwenService")
public class DiscussshetuanxinwenServiceImpl extends ServiceImpl<DiscussshetuanxinwenDao, DiscussshetuanxinwenEntity> implements DiscussshetuanxinwenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshetuanxinwenEntity> page = this.selectPage(
                new Query<DiscussshetuanxinwenEntity>(params).getPage(),
                new EntityWrapper<DiscussshetuanxinwenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshetuanxinwenEntity> wrapper) {
		  Page<DiscussshetuanxinwenView> page =new Query<DiscussshetuanxinwenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshetuanxinwenVO> selectListVO(Wrapper<DiscussshetuanxinwenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshetuanxinwenVO selectVO(Wrapper<DiscussshetuanxinwenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshetuanxinwenView> selectListView(Wrapper<DiscussshetuanxinwenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshetuanxinwenView selectView(Wrapper<DiscussshetuanxinwenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
