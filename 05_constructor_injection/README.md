# For constructor injection

- Idea is same as setter injection to assign the value to the private attribute of the class but this time using constructor

- passing arguments to constructor and using that parameterized constructor to initialize the attribute of class

- SYNTAX

```
    <bean id="alien" class="com.ayush.springDemo.Alien">
		<constructor-arg value="10"></constructor-arg>
		<constructor-arg ref="laptop"></constructor-arg>
	</bean>
	
	<bean id="laptop" class="com.ayush.springDemo.Laptop">
	</bean>
```