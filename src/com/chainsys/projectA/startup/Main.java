package com.chainsys.projectA.startup;

import com.chainsys.projectA.beans.Customer;
import com.chainsys.projectA.beans.Employee;
import org.springframework.context.ApplicationContext; //parent
import org.springframework.context.support.ClassPathXmlApplicationContext; //child
public class Main {

	public static void main(String[] args) 
	{
		testB();
	}
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
}
