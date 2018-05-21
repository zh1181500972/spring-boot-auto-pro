package com.example.demo.config;

import java.util.Date;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "student")
public class Student {
	private Long stuId;// 学号
	private Integer age;// 年龄
	private Short sex;// 性别 ，0，1,2
	private Byte status;// 状态
	private Date birthday;// 生日
	private String name;// 名字
	private Double higth;// 身高
	private Float weight;// 体重
	private Character genner;// 性别，汉字
	public Long getStuId() {
		return stuId;
	}

	public void setStuId(Long stuId) {
		this.stuId = stuId;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Short getSex() {
		return sex;
	}

	public void setSex(Short sex) {
		this.sex = sex;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getHigth() {
		return higth;
	}

	public void setHigth(Double higth) {
		this.higth = higth;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public Character getGenner() {
		return genner;
	}

	public void setGenner(Character genner) {
		this.genner = genner;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", age=" + age + ", sex=" + sex + ", status=" + status + ", birthday="
				+ birthday + ", name=" + name + ", higth=" + higth + ", weight=" + weight + ", genner=" + genner + "]";
	}

}
