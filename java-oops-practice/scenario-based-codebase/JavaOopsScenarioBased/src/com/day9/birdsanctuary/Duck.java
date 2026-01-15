package com.day9.birdsanctuary;

public class Duck  extends Bird implements Swimmable{
	public Duck(String name, String id)
	{
		super(name, id,"Duck");
		
	}
	@Override
	public void swim() {
		System.out.println(getName()+ " is Swimming");
	}

}
