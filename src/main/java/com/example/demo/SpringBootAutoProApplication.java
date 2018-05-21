package com.example.demo;

import java.beans.PropertyEditor;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.config.CharPropertyEditor;
import com.example.demo.config.DatePropertyEditorSupport;

@SpringBootApplication
@Configuration
public class SpringBootAutoProApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutoProApplication.class, args);
	}

	/**
	 * 添加自定义属性编辑器
	 * 
	 * @return
	 */
	@Bean
	public CustomEditorConfigurer customEditorConfigurer() {
		CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
		Map<Class<?>, Class<? extends PropertyEditor>> customEditors = new HashMap<>();
		customEditors.put(Date.class, DatePropertyEditorSupport.class);
		customEditors.put(Character.class, CharPropertyEditor.class);
		customEditorConfigurer.setCustomEditors(customEditors);
		return customEditorConfigurer;
	}
}
