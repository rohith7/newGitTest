package com.rohith.spring;

public class Test {

	private String gender;
	private String location;

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	public void hello(String name){
		System.out.println("Hello..."+gender+" "+name+ " "+location);
	}
	
}
