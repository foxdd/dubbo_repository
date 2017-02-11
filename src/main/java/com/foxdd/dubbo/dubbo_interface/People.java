package com.foxdd.dubbo.dubbo_interface;

import java.io.Serializable;

public class People implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8712295099843974373L;
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
