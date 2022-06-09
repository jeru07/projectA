package com.chainsys.projectA.beans;

public abstract class Desert {
	public String Name;

}
class Icecream extends Desert {
	public Icecream() 
	{
		Name="blackcurrant";
		
	}
}
class Sweets extends Desert 
{ 
	public Sweets() 
	{
		Name="gulab jamun";
		
	}
	}
class Cakes extends Desert {
	public Cakes() 
	{
		Name="russian velvet";
	}
   
	 public Cakes(String Name)
	 {
		 this.Name=Name;
	 }
}

