package com.day9.birdsanctuary;
public class Bird {
 private String name;
 private String id;
 private String species;
 public Bird (String name, String id, String species){
	  this.name= name;
	  this.id= id;
	  this.species= species;
 }
   			public String getName()
   			{
   				return name;
   			}
   			public String getId() {
   				return id;
   			}
   		    public String getSpecies() {
   		    	return species;
   		    }
   		    
   		    public void eat() {
   		    	 System.out.println(name + " ("+ species+ " ) is eating");
				
			}
   		      public void displayInfo() {
   		    	  System.out.println("ID: "+ id +" | name "+ name +  " | species "+species);
   		    	  System.out.println("Abilities: "+ abilities());
				
			}
   		       private String abilities() {
   		    	   boolean canFly = this instanceof Flyable;
   		    	   boolean canSwim = this instanceof Swimmable;
   		             
   		    	    if(canFly && canSwim) return "Fly+ Swim";
   		    	    if(canFly) return "Fly";
   		    	    return "Neither";
   		       }
   		     
	
}

