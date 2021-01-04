package com.example.demo.entity;

import lombok.Data;

@Data
public class User {
	/**
	 * 主键ID
	 */
	private int id;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 年龄
	 */
	private int age;
}
