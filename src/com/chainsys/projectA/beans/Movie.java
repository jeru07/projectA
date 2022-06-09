package com.chainsys.projectA.beans;

public class Movie {
	
	public String title;
	public String director;

	  public Movie(String filmTitle,String filmDirector)
	  {
		 
		  title=filmTitle; // similar to this.title=filmtitle but using this. is not compulsory
		  director=filmDirector;
		  System.out.println(title);
		  System.out.println(director);
		
	  }
}
