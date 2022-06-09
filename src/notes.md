     first jvm gets loaded
	main method gets executed
	ApplicationContext is loaded 
	Application context reads xml config file
	ApplicationContext pre loads one object for each bean in the config file
	lazy-init="true" this informs springContainer not to preload object for this bean
	by default spring early loads objects in memory.
     for lazy-init beams object is created only when the getBean() is called.
	for pre init beans getBean() returns the reference of the preloaded object
	by default only one object for every bean is created
	
## prototype
Prototype beans are by default lazy init  
prototypes are not singleton  
a new object is created for prototype when get bean method is called  

```
	<bean id="act" class="com.chainsys.projectA.beans.Actor" scope="prototype"></bean>  
```

## Bean with parameterize constructor

  	-<bean id="film" class="com.chainsys.projectA.beans.Movie">
  	<constructor-arg type="java.lang.String" value="kgf" /> 
  	<constructor-arg type="java.lang.String" value="jerusha" /> 




	
	