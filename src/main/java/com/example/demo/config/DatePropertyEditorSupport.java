package com.example.demo.config;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;

/**
 * 自定义属性编辑器
 * 
 * @author zhanghao
 * @time 2018年5月21日 下午4:23:04
 */
@Component
public class DatePropertyEditorSupport extends PropertyEditorSupport {
	private String format = "yyyy-MM-dd HH:mm:ss";

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			this.setValue(sdf.parse(text));
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
