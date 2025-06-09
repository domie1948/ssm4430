package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShetuanjingfeiEntity;
import com.entity.view.ShetuanjingfeiView;

import com.service.ShetuanjingfeiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 社团经费
 * 后端接口
 * @author 
 * @email 
 * @date 2020-11-26 08:47:15
 */
@RestController
@RequestMapping("/shetuanjingfei")
public class ShetuanjingfeiController {
    @Autowired
    private ShetuanjingfeiService shetuanjingfeiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShetuanjingfeiEntity shetuanjingfei, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shetuanfuzeren")) {
			shetuanjingfei.setShetuanbianhao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShetuanjingfeiEntity> ew = new EntityWrapper<ShetuanjingfeiEntity>();
		PageUtils page = shetuanjingfeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shetuanjingfei), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShetuanjingfeiEntity shetuanjingfei, HttpServletRequest request){
        EntityWrapper<ShetuanjingfeiEntity> ew = new EntityWrapper<ShetuanjingfeiEntity>();
		PageUtils page = shetuanjingfeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shetuanjingfei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShetuanjingfeiEntity shetuanjingfei){
       	EntityWrapper<ShetuanjingfeiEntity> ew = new EntityWrapper<ShetuanjingfeiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shetuanjingfei, "shetuanjingfei")); 
        return R.ok().put("data", shetuanjingfeiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShetuanjingfeiEntity shetuanjingfei){
        EntityWrapper< ShetuanjingfeiEntity> ew = new EntityWrapper< ShetuanjingfeiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shetuanjingfei, "shetuanjingfei")); 
		ShetuanjingfeiView shetuanjingfeiView =  shetuanjingfeiService.selectView(ew);
		return R.ok("查询社团经费成功").put("data", shetuanjingfeiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        ShetuanjingfeiEntity shetuanjingfei = shetuanjingfeiService.selectById(id);
        return R.ok().put("data", shetuanjingfei);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        ShetuanjingfeiEntity shetuanjingfei = shetuanjingfeiService.selectById(id);
        return R.ok().put("data", shetuanjingfei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShetuanjingfeiEntity shetuanjingfei, HttpServletRequest request){
    	shetuanjingfei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shetuanjingfei);

        shetuanjingfeiService.insert(shetuanjingfei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShetuanjingfeiEntity shetuanjingfei, HttpServletRequest request){
    	shetuanjingfei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shetuanjingfei);

        shetuanjingfeiService.insert(shetuanjingfei);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShetuanjingfeiEntity shetuanjingfei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shetuanjingfei);
        shetuanjingfeiService.updateById(shetuanjingfei);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shetuanjingfeiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShetuanjingfeiEntity> wrapper = new EntityWrapper<ShetuanjingfeiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shetuanfuzeren")) {
			wrapper.eq("shetuanbianhao", (String)request.getSession().getAttribute("username"));
		}

		int count = shetuanjingfeiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
