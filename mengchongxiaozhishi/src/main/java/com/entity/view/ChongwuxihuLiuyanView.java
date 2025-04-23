package com.entity.view;

import com.entity.ChongwuxihuLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 萌宠洗护留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("chongwuxihu_liuyan")
public class ChongwuxihuLiuyanView extends ChongwuxihuLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 chongwuxihu
			/**
			* 标题
			*/
			private String chongwuxihuName;
			/**
			* 封面
			*/
			private String chongwuxihuPhoto;
			/**
			* 教学视频
			*/
			private String chongwuxihuVideo;
			/**
			* 洗护类型
			*/
			private Integer chongwuxihuTypes;
				/**
				* 洗护类型的值
				*/
				private String chongwuxihuValue;
			/**
			* 详情内容
			*/
			private String chongwuxihuContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public ChongwuxihuLiuyanView() {

	}

	public ChongwuxihuLiuyanView(ChongwuxihuLiuyanEntity chongwuxihuLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, chongwuxihuLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
















				//级联表的get和set chongwuxihu

					/**
					* 获取： 标题
					*/
					public String getChongwuxihuName() {
						return chongwuxihuName;
					}
					/**
					* 设置： 标题
					*/
					public void setChongwuxihuName(String chongwuxihuName) {
						this.chongwuxihuName = chongwuxihuName;
					}

					/**
					* 获取： 封面
					*/
					public String getChongwuxihuPhoto() {
						return chongwuxihuPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setChongwuxihuPhoto(String chongwuxihuPhoto) {
						this.chongwuxihuPhoto = chongwuxihuPhoto;
					}

					/**
					* 获取： 教学视频
					*/
					public String getChongwuxihuVideo() {
						return chongwuxihuVideo;
					}
					/**
					* 设置： 教学视频
					*/
					public void setChongwuxihuVideo(String chongwuxihuVideo) {
						this.chongwuxihuVideo = chongwuxihuVideo;
					}

					/**
					* 获取： 洗护类型
					*/
					public Integer getChongwuxihuTypes() {
						return chongwuxihuTypes;
					}
					/**
					* 设置： 洗护类型
					*/
					public void setChongwuxihuTypes(Integer chongwuxihuTypes) {
						this.chongwuxihuTypes = chongwuxihuTypes;
					}


						/**
						* 获取： 洗护类型的值
						*/
						public String getChongwuxihuValue() {
							return chongwuxihuValue;
						}
						/**
						* 设置： 洗护类型的值
						*/
						public void setChongwuxihuValue(String chongwuxihuValue) {
							this.chongwuxihuValue = chongwuxihuValue;
						}

					/**
					* 获取： 详情内容
					*/
					public String getChongwuxihuContent() {
						return chongwuxihuContent;
					}
					/**
					* 设置： 详情内容
					*/
					public void setChongwuxihuContent(String chongwuxihuContent) {
						this.chongwuxihuContent = chongwuxihuContent;
					}



















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
