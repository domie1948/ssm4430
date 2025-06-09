package com.entity.model;

import com.entity.ShetuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 社团信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-11-26 08:47:15
 */
public class ShetuanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 社团名称
	 */
	
	private String shetuanmingcheng;
		
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 社团宗旨
	 */
	
	private String shetuanzongzhi;
		
	/**
	 * 创办日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuangbanriqi;
		
	/**
	 * 社团地址
	 */
	
	private String shetuandizhi;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 邮箱
	 */
	
	private String youxiang;
		
	/**
	 * 社团风采
	 */
	
	private String shetuanfengcai;
				
	
	/**
	 * 设置：社团名称
	 */
	 
	public void setShetuanmingcheng(String shetuanmingcheng) {
		this.shetuanmingcheng = shetuanmingcheng;
	}
	
	/**
	 * 获取：社团名称
	 */
	public String getShetuanmingcheng() {
		return shetuanmingcheng;
	}
				
	
	/**
	 * 设置：分类
	 */
	 
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：社团宗旨
	 */
	 
	public void setShetuanzongzhi(String shetuanzongzhi) {
		this.shetuanzongzhi = shetuanzongzhi;
	}
	
	/**
	 * 获取：社团宗旨
	 */
	public String getShetuanzongzhi() {
		return shetuanzongzhi;
	}
				
	
	/**
	 * 设置：创办日期
	 */
	 
	public void setChuangbanriqi(Date chuangbanriqi) {
		this.chuangbanriqi = chuangbanriqi;
	}
	
	/**
	 * 获取：创办日期
	 */
	public Date getChuangbanriqi() {
		return chuangbanriqi;
	}
				
	
	/**
	 * 设置：社团地址
	 */
	 
	public void setShetuandizhi(String shetuandizhi) {
		this.shetuandizhi = shetuandizhi;
	}
	
	/**
	 * 获取：社团地址
	 */
	public String getShetuandizhi() {
		return shetuandizhi;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：邮箱
	 */
	 
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
				
	
	/**
	 * 设置：社团风采
	 */
	 
	public void setShetuanfengcai(String shetuanfengcai) {
		this.shetuanfengcai = shetuanfengcai;
	}
	
	/**
	 * 获取：社团风采
	 */
	public String getShetuanfengcai() {
		return shetuanfengcai;
	}
			
}
