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

OUTPUT

![constructor_injection](https://user-images.githubusercontent.com/70189069/149465638-3e96604a-15ed-4867-a0a0-7c066901859f.png)
