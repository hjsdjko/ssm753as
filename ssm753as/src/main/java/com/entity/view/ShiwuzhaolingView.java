package com.entity.view;

import com.entity.ShiwuzhaolingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 失物招领
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-26 11:12:36
 */
@TableName("shiwuzhaoling")
public class ShiwuzhaolingView  extends ShiwuzhaolingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiwuzhaolingView(){
	}
 
 	public ShiwuzhaolingView(ShiwuzhaolingEntity shiwuzhaolingEntity){
 	try {
			BeanUtils.copyProperties(this, shiwuzhaolingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}