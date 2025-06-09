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


import com.dao.ShetuanfuzerenDao;
import com.entity.ShetuanfuzerenEntity;
import com.service.ShetuanfuzerenService;
import com.entity.vo.ShetuanfuzerenVO;
import com.entity.view.ShetuanfuzerenView;

@Service("shetuanfuzerenService")
public class ShetuanfuzerenServiceImpl extends ServiceImpl<ShetuanfuzerenDao, ShetuanfuzerenEntity> implements ShetuanfuzerenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShetuanfuzerenEntity> page = this.selectPage(
                new Query<ShetuanfuzerenEntity>(params).getPage(),
                new EntityWrapper<ShetuanfuzerenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShetuanfuzerenEntity> wrapper) {
		  Page<ShetuanfuzerenView> page =new Query<ShetuanfuzerenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShetuanfuzerenVO> selectListVO(Wrapper<ShetuanfuzerenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShetuanfuzerenVO selectVO(Wrapper<ShetuanfuzerenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShetuanfuzerenView> selectListView(Wrapper<ShetuanfuzerenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShetuanfuzerenView selectView(Wrapper<ShetuanfuzerenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
