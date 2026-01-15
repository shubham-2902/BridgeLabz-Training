package com.day9.birdsanctuary;

public class Eagle extends Bird implements Flyable {
	public Eagle(String name , String id)
	{
		super(name, id, "Eagle");
		
	}
	@Override
	public void fly()
	{
		System.out.println(getName()+ " is flying");
	}

}
