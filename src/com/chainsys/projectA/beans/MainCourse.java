package com.chainsys.projectA.beans;

public abstract class MainCourse {
	public String Name;

}
class SouthIndian extends MainCourse {
	 public SouthIndian() 
	{
		Name="Briyani";
		
	}
	
}
class NorthIndian extends MainCourse {
	public NorthIndian() 
	{
		Name="chappati";
		
	}
}
class Chinese extends MainCourse {
	 public Chinese()
	{
		Name="Noodles";
		
	}
	
}

