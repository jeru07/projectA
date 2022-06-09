package com.chainsys.projectA.beans;

public class Lunch {
  public Starters entree;
  public MainCourse mainFood;
  public Desert sweets;
  //dependency injection
  public Lunch(Starters s,MainCourse m,Desert d) 
  {
	  System.out.println("lunch is ready");
	  entree=s;
	  mainFood=m;
	  sweets=d;
  }
  public void serve() {
	  System.out.println(entree.Name);
	  System.out.println(mainFood.Name); 
	  System.out.println(sweets.Name);
  }
}