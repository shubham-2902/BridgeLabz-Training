package com.day9.birdsanctuary;

public class Sparrow  extends Bird implements Flyable{
      public Sparrow(String name, String id)
      {
    	  super(name, id, "Sparrow");
    	  
      }
      @Override
       public void fly()
       {
    	  System.out.println(getName()+"is flying");
       }
      
}
