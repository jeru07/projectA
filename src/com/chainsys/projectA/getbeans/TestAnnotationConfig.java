package com.chainsys.projectA.getbeans;
import com.chainsys.projectA.appconfig.AppConfig;
import org.springframework.context.ApplicationContext; //parent
import org.springframework.context.annotation.AnnotationConfigApplicationContext; //child
import com.chainsys.projectA.beans.Employee;
import com.chainsys.projectA.beans.Customer;

public class TestAnnotationConfig 
{
    public static void testA()
    {
    	 ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
    	 Employee emp=ac.getBean(Employee.class);
    	 emp.setId(7);
    	 emp.setName("jerusha");
    	 emp.print();
    	 Employee secondemp=ac.getBean(Employee.class);
    	 
    }
}
