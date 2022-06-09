package com.chainsys.projectA.beans;

public class LunchFactory {
	
	public Lunch createNonvegSouthIndianLunch() {
		Starters s1=new Chicken(); 
		s1.Name="Honeychicken";
		MainCourse m=new SouthIndian();
		m.Name="Rice";
		Desert d=new Cakes(); 
		d.Name="ChocoBrownie";
		Lunch l=new Lunch (s1,m,d);
		return l;
		}
		public Lunch createVegSouthIndianLunch()
		{
		Starters s1=new Vegroll();
		s1.Name="Cabbageroll";
		MainCourse m=new SouthIndian();
		m.Name="Rice";
		Desert d=new Icecream();
		d.Name="Falooda";
		Lunch l=new Lunch(s1,m,d);
		return l;
		}
		
		public Lunch createNorthIndianLunch() 
		{
		Starters s1=new Soup();
		s1.Name="Sweetcorn";
		MainCourse m =new NorthIndian();
		m.Name="chappati";
		Desert d=new Sweets();
		d.Name="rasagulla";
		Lunch l=new Lunch(s1, m, d);
		return l;
}
		public Lunch createChineseIndianLunch()
		{ 
		Starters s1=new Vegroll();
		s1.Name="Springroll";
		MainCourse m=new Chinese();
		m.Name="Noodles";
		Desert d=new Icecream();
		d.Name="Snake";
		Lunch l=new Lunch (s1,m,d); 
		return l;
}
}
