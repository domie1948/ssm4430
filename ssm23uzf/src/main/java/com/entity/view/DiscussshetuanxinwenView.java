package com.entity.view;

import com.entity.DiscussshetuanxinwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社团新闻评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-26 08:47:16
 */
@TableName("discussshetuanxinwen")
public class DiscussshetuanxinwenView  extends DiscussshetuanxinwenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshetuanxinwenView(){
	}
 
 	public DiscussshetuanxinwenView(DiscussshetuanxinwenEntity discussshetuanxinwenEntity){
 	try {
			BeanUtils.copyProperties(this, discussshetuanxinwenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
