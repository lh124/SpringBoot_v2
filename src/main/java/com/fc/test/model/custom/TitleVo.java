package com.fc.test.model.custom;

import lombok.Getter;
import lombok.Setter;

/**
 * 设置通用标题
 * @param title 标题
 * @param parenttitle 父标题
 * @param isMsg 是否开启内容
 * @param msgHtml 内容html
 * @param isControl 是否开启小控件
 * @param isribbon 是都开启彩带
 * @ClassName: TitleVo
 * @author fuce
 * @date 2018年8月26日
 */
@Setter
@Getter
public class TitleVo {
	
	private String title;//正标题
	private String parenttitle;//父级标题
	private boolean isMsg;//是都添加欢迎语 默认为false
	private String msgHtml;//欢迎语内容 默认内容为""
	private boolean isControl;//控件下拉列表点击  默认true
	private boolean isribbon;//控件彩带 默认true
	/**
	 * 设置通用标题
	 * @param title 标题
	 * @param parenttitle 父标题
	 * @param isMsg 是否开启内容
	 * @param msgHtml 内容html
	 * @param isControl 是否开启小控件
	 * @param isribbon 是都开启彩带
	 * @ClassName: TitleVo
	 * @author fuce
	 * @date 2018年8月26日
	 */
	public TitleVo(String title, String parenttitle, boolean isMsg,
			String msgHtml, boolean isControl, boolean isribbon) {
		super();
		this.title = title;
		this.parenttitle = parenttitle;
		this.isMsg = isMsg;
		if(isMsg==true){
			this.msgHtml = msgHtml;
		}else{
			this.msgHtml = "";
		}
		
		this.isControl = isControl;
		this.isribbon = isribbon;
	}
	
	
}
