package com.chainsys.projectA.startup;

import com.chainsys.projectA.getbeans.TestClassPathXml;
import com.chainsys.projectA.beans.Calendar;

public class Main {

	public static void main(String[] args) 
	{
		
		TestClassPathXml.testLunchFactory();
		//Calendar c1=new Calender(); cannot acces outside constructor
	}
	
}
