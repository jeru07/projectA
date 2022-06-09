package com.chainsys.projectA.getbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chainsys.projectA.beans.Actor;
import com.chainsys.projectA.beans.Calendar;
import com.chainsys.projectA.beans.Customer;
import com.chainsys.projectA.beans.Employee;
import com.chainsys.projectA.beans.Lunch;
import com.chainsys.projectA.beans.ScoreBoard;

import org.springframework.context.ApplicationContext; //parent
import org.springframework.context.support.ClassPathXmlApplicationContext; //child

public class TestClassPathXml {
	public static void testA()
	  {
		  Employee emp=new Employee();
		  emp.setId(1);
		  emp.setName("jerusha");
		  emp.print();
	  }
	  public static void testB()
	  {
		  ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		  // Employee emp=ac.getBean(Employee.class);
		  Employee emp=(Employee)ac.getBean("emp");
		  emp.setId(7);
		  emp.setName("virat");
		  emp.print();
		  Customer c=ac.getBean(Customer.class);
		  c.setId(100);
		  c.setName("dhoni");
		  c.print();
	  }
	  public static void testLazyInit()
	  {
		  ApplicationContext ac1=new ClassPathXmlApplicationContext("beans.xml");
		 Employee emp=ac1.getBean(Employee.class);
		  Customer c=ac1.getBean(Customer.class);
		  Employee secondEmp=ac1.getBean(Employee.class);
		  Customer secondCu=ac1.getBean(Customer.class);
		  System.out.println(emp.hashCode());
		  System.out.println(secondEmp.hashCode());
		  System.out.println(c.hashCode());
		  System.out.println(secondCu.hashCode());
	  }
    
	  public static void testPrototype()
	  {
		  ApplicationContext ac1=new ClassPathXmlApplicationContext("beans.xml");
		  Actor hero=ac1.getBean(Actor.class);
		  Actor heroine=ac1.getBean(Actor.class);
		  Actor comedian=ac1.getBean(Actor.class);
		  Actor friend=ac1.getBean(Actor.class);
		  System.out.println(hero.hashCode());
		  System.out.println(heroine.hashCode());
		  System.out.println(comedian.hashCode());
		  System.out.println(friend.hashCode());
		  
	  }
	  public static void testBeanWithConstructor()
	  {
		  ApplicationContext ac1=new ClassPathXmlApplicationContext("beans.xml");
	  }
	  public static void testFactoryMethod()
	  {
		  ApplicationContext ac1=new ClassPathXmlApplicationContext("beans.xml");
		  ScoreBoard sb=ac1.getBean("sb1",ScoreBoard.class);
		 sb.targetScore=183;
		  System.out.println(sb.targetScore);
		  ScoreBoard sb2=ac1.getBean("sb2",ScoreBoard.class);
			  //sb2.targetScore=183;
			  System.out.println(sb2.targetScore);  
	  }
	  public static void testCalendarFactory()
	  {
		  ApplicationContext ac1=new ClassPathXmlApplicationContext("beans.xml");
		  Calendar today= ac1.getBean(Calendar.class);
		  today.day=9;
		  today.month="june";
		  today.year=2022;
		  System.out.println(today.day);
		  System.out.println(today.month);
		  System.out.println(today.year);
		  
	  }
	  public static void testLunchFactory()
	  {
		  ApplicationContext ac1=new ClassPathXmlApplicationContext("lunch.xml");
		  Lunch nvsilunch=ac1.getBean("nvsilunch",Lunch.class);
		  Lunch vsilunch=ac1.getBean("vsilunch",Lunch.class);
		  Lunch nilunch=ac1.getBean("nilunch",Lunch.class);
		  Lunch chlunch=ac1.getBean("chlunch",Lunch.class);
		 System.out.println("---------");
		 nvsilunch.serve();
		 System.out.println("--------");
		 vsilunch.serve();
		 System.out.println("--------");
		 nilunch.serve();
		 System.out.println("------");
		 chlunch.serve();
		  
	  }
	  
}
