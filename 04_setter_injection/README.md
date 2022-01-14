# For setter injection

- <bean> tag has child tag <property> tag we can use this

- for reference variable we have to give ref instead of value


- SYNTAX

```

    <bean id="alien" class="com.ayush.springDemo.Alien" scope="prototype">
	    <property name="age" value="10"></property>
	    <property name="laptop" ref="laptop"></property>
	</bean>
	
	<bean id="laptop" class="com.ayush.springDemo.Laptop">
	</bean>
    
```