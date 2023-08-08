# SpringCore

Introduction
-----------------
# => What is enterprise ?
	-> "Enterprise" is the term used for larger scale companies that has multiple departments, levels, divisons or groups
	-> For Example :-
		= Tata Group : Consumer & Retails, Hotels, Steel, Tata Power, IT, Automobiles etc
		= Mahindra Group : IT, Automobiles, Farm Equipments, Financial Services, Education, Defence etc

# => What is enterprise applications ?
	-> "Enterprise Applications" are large-scale, distributed, transaction and highly-available application which are designed to support enterprise business requirements
	-> In general we can say that "Enterprise Application" is the software hosted on servers that provides the application support to the enterprise
	-> We can develop enterprise application using J2EE
	-> To develop enterprise applications we have to use any one design pattern (for eg. MVC) and any one system architecture (for eg. 3-tire architecture)

# => Different types of applications in java :-
	-> There are 2 types of java applications :-
		1. Standalone Applications
			= Points to remember :-
				1. can be created using J2SE
				2. does not follows the client-server architecture
				3. can be executed only on one system
			= Types of standalone applications :-
				1. CUI (Character User Interface) Applications
				2. GUI (Graphical User Interface) Applications

		2. Enterprise Applications
			= Points to remember :-
				1. can be created using J2EE
				2. follows the client-server architecture
				3. can be executed on multiple systems
			= Types of Enterprise Applications :-
				1. Web Applications
					-> Client : Client is fixed i.e. Browser
					-> Technologies Used : CGI, Servlets, JSP, JSTL, EL etc
					-> Server Used : Web Servers & Application Servers
				2. Distributed Applications
					-> Client : Client is not fixed i.e. client can be broswer, java, mobile etc
					-> Technologies Used : EJB, RMI, CORBA, Web-services, microservices  etc
					-> Server Used : Application Servers

# => What is difference between Web Applications and Distributed Applications

# => What is difference between Web Server and Application Server
	= Web Server :
		-> Servlet container, JSP container
		-> For eg. Apache Tomcat, Resin etc
	= Application Server :
		-> EJB container, Also contains Servlet container, JSP container
		-> For eg. Weblogic, Websphere etc


# => What is framework :-
	= Frameworks are the pre-written code acting as a template which can be reused or customized by the developers
	= In simple terms we can say that framework is the collection of API's and tools which are used to develop projects

# => Advantages of frameworks :-
	= Fast development speed
	= Less code (because frameworks remove the boilerplate code)
	= Support API integration
	= Customization (frameworks are open source)
	= Easy debugging
	= Good document support

# => Types of frameworks :-
	= There are 2 types of frameworks :-
		1. Web Framework
			-> Frameworks which are used to create and execute web applications only
			-> For eg. Struts, JSF etc
		2. Application Framework
			-> Frameworks which are used to create and execute any type of applications i.e. standalone  applications or enterprise applications
			-> For eg. Spring

# => Spring Introduction :-
	= Spring is an open source framework which can be used to develop any type of application
	= Spring framework was written by Rod Johnson
	= Spring framework was released under Apache 2.0 licence
	= First version of spring framework was released in June 2003
	= First production release i.e. 1.0 version was released in March 2004
	= Latest version of spring is 5.x version which was released in 2017

=========

<img width="694" alt="image" src="https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/1c61e5e4-5954-4eef-a7cc-70115bf201bd">



<img width="733" alt="image" src="https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/80c43b77-6238-4692-a1db-66afa8409989">












# => Steps to create "Simple Spring Program" :-
	1. Download and install JDK and any one IDE (Netbeans / Eclipse)
	2. Download Spring jar Files
	3. Create "Java Project" in Eclipse
	4. Add spring jar files to the project (create spring library)
	5. Create "JavaBean" class (or "POJO" class) (.java)
	6. Create "Spring Configuration File" (.xml)
	7. Create "Test Application" (.java)
	
=========

# => Download Spring jar Files
	= Download any spring version jar from : 
	
	= Download commons-logging jar file
	
===================

# => What is JavaBean ?
	= JavaBeans are the classes that encapsulate the objects into single unit (bean)
	= To create JavaBean we have to follow below conditions :-
		1. JavaBean class must have private properties (variables)
		2. JavaBean class must contain public getter and setter methods
		3. JavaBean class must inherit Serializable interface
		4. JavaBean class must have public no-argument constructor
		
		
# => What is difference between "POJO (Plain Old Java Object)" class and "JavaBean" class :-
	1. POJO class can contain any type of variable i.e. public, protected or private
	   JavaBean class must contain only private variables (or properties or members)
	   
	2. POJO classes doesnt provide much control on the properties
	   JavaBean class has full control on their properties
	   
	3. Its not compulsory to have public getter and setter methods
	   JavaBean class must have public getter and setter methods
	   
	4. In POJO classes we can access the variables directly by their name
	   In JavaBean class we can access the variables only by getter and setter methods
	   
	5. In POJO class its not compulsory to inherit Serializable interface
	   In JavaBean class its compulsory to inherit Serializable interface
	   
	   
# => NOTE :
	1. JavaBean is the special type of POJO class.
	2. There are some restrictions on POJO class to become JavaBean class
	3. All JavaBean classes are POJO classes but all POJO classes are not JavaBean classes
	

===================

# => What is "Spring Configuration File" ?
	= Spring Configuration File is simple XML file
	= We can provide any name to Spring Configuration File but it is always recommended to have 
	  "applicationContext.xml" name
	= We have to provide the structure to the XML file using DTD (Document Type Defination) or XSD (XML 
	  Schema Defination)
	= "Spring Configuration File" is used to provide all the JavaBean configuration details i.e. bean 
	  class name, identity of the bean class, values of the bean class etc
	   
	   
==============

# => Resource :-
	= Whenever we need to read/load external resources like XML file, text file, properties file, image files etc then we can use Resource.
	
	= Resouce is an interface which is present in "org.springframework.core.io.Resource"
	= Spring has provided many implemented classes for Resouce interface :-
		1. ClassPathResource
		2. URLResource
		3. InputStreamResource
		4. ByteArrayResource
		5. FileSystemResource
		6. ServletContextResource



  #  What is Spring Container (IoC Container) ?	
	= The Spring Container is the core or say heart of the Spring Framework
	= It can be compared as :
		- Like JVM which is used to run Java Programs
		- Like servlet container which is used to run servlets
		- Like EJB container which provides the run-time environment for enterprise beans
		- Same Spring container is the place where bean objects are managed
		
	= The main responsibilites of Spring container are :-
		1. It is used to instantiate, initialize and wire up the bean objects
		2. It manages the bean life cycle
		
	= Types of Spring Containers ?
		1. BeanFactory Container
		2. ApplicationContext Container
		
	= Working of Spring Container :-
		
		



	
	![Spring_Containers_Hierarchy_lyst9263](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/7efd2ac5-a833-4b5b-901f-6ed1a7f054d3)

 ![ApplicationContext_internal_Working_lyst5415](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/c98eaf8c-de60-4153-9f0f-07a853db90e7)


![BeanFactory_internal_Working_lyst3598](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/e88cde2c-cf88-474a-9a5a-1cdf2ac77075)


![Spring_Container_lyst9344](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/daeffadd-36b7-4656-9662-7a304569b25d)



#  ApplicationContext Container :-
	= ApplicationContext is also a Spring Container that contains the collection of bean objects
	= It is advanced level spring container as compared to BeanFactory
	
	= ApplicationContext is used to create bean objects, then initialize the bean and return
                  it whenever asked by client/user (it has many more extra working as compared to BeanFactory)
	
	= ApplicationContext is an interface which is present in "org.springframework.context" package
	= ApplicationContext inherits BeanFactory interface (indirectly)
	
	
=> Hierarchy of Spring Containers :-


=> Working of ApplicationContext :-
	

 # Difference between BeanFactory and ApplicationContext :-
	1. BeanFactory is the fundamental spring container
	   ApplicationContext is an advanced container which provides all the functionalities of BeanFactory with additional features
	2. BeanFactory will create the bean object when we call getBean(-) method and thus it is known as 
	   "Lazy Initialization"
	   ApplicationContext will create the bean object at the time of startup and thus it is known as "Eager Initialization"
	3. BeanFactory is suitable for Standalone Applications
	   ApplicationContext is suitable for Enterprise Applications
	4. BeanFactory supports only Singleton and Prototype bean scope
	   ApplicationContext supports all the bean scopes i.e. Singleton, Prototype, Request, Session etc
	5. BeanFactory does not support I18N functionality
	   ApplicationContext supports I18N functionality
	6. BeanFactory does not support AOP module and ORM
	   ApplicationContext supports AOP module and ORM
	7. BeanFactory does not support Annotation. Thus in bean autowiring we have to provide the 
	   configurations in XML file only
	   ApplicationContext supports Annotation
	   



		
		
# => BeanFactory :-
	= BeanFactory is the actual "Spring Container" that contains the collection of bean objects
	= BeanFactory is used to create bean objects, initalize the beans and returns the bean objects to the client
	
	= BeanFactory is an interface which is present in "org.springframework.beans.factory" package
	= BeanFactory provides an implemented class i.e. XmlBeanFactory
	
	= BeanFactory has been deprecated from Spring 3.x version
	
===============




<img width="662" alt="image" src="https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/1ebb0b0d-d117-4c92-a907-552ed7c6f288">



<img width="701" alt="image" src="https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/1f58781c-2688-491e-908c-d4ee51ba1f0f">





<img width="593" alt="image" src="https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/b1fa1342-9b60-45b4-b7bd-64b4c609ac0f">



<img width="713" alt="image" src="https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/10c47754-c36d-425f-9269-bbfcf5e3267b">

















# => What is bean ?
	= Beans are the objects that form the the backbone of our application which is managed by the Spring Container
	= Beans are created with the configuration details/metadata that we provide to the container i.e. in 
	            the spring configuration file i.e. applicationContext.xml <bean/> 
	= Beans defination contains the configuration details in 3 parts :-
		1. Beans Creation :-
			<bean id="--" class="--" name="--" scope="--"/>
		2. Beans LifeCycle :-
			lazy-init="---", init-method="--", destroy-method="--"
		3. Beans Dependencies :- (attibutes which provides information how to inject the dependencies)
			properties, constructor-arg, autowiring mode
			
	= for example :-
		<bean id="bean unique identity" class="fully qualified class name">
			<propery name="--" value="--" />
		</bean>
		
==================

# => id attribute :
	= It specifies the bean unique identity
	
# => name attribute :-
	= It specifies the bean unique identity but it is more flexible as compared to id attribute
	
	= name attribute provides the flexibility to provide multiple names for one bean object
	= We can separate the multiple bean names by comma(,) or semi-colon(;) or space
	= We can provide same name to one bean object but same name cannot be provided to multiple bean objects
	= We can provide same bean name as that of id
	
====================

# => scope attribute :-
	= scope of the bean defines the life-cycle and visibility/accessbility of that bean in the context we use it
	= There are 7 types of scopes of bean object :-
		1. "singleton" scope
		2. "prototype" scope
		
		3. "request" scope
		4. "session" scope
		5. "globalSession" scope
		6. "application" scope
		7. "webSocket" scope
		
# = NOTE : We can provide custom scope to the bean objects
	
========

# => "singleton" scope :-
	= In this scope only one instance will be created for a single bean defination and the same object will be shared 
	     for each request made for that bean using getBean(-) method
	= It is the default scope of bean object
	
# => "prototype" scope :-
	= In this scope a new instance is created for a single bean defination, when we request for bean using getBean(-) method,
	     it willl return new bean instance
	
============
# single_bean_defination_object

<img width="575" alt="image" src="https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/e891dd19-e6ba-4e24-a3f1-5b6d060d99df">


multiple_bean_defination_object


<img width="569" alt="image" src="https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/aa9eb54f-7135-4579-b31c-a3815393c727">












# Bean_Life_Cycle

<img width="515" alt="image" src="https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/c1ebb431-bc42-4237-830f-cf4431c570fa">

















# Inversion of Control Dependency Injection

# => Inversion of Control (IoC) :-
	= Inversion of Control is a design pattern/principal which identifies the client required services or dependencies and then it will create and inject the required services or dependencies to the application without any client request
	= Spring container works on the basis of IoC principal and thus it is also known as IoC container
	= Advantages of IoC principal :-
		1. Classes are loosly coupled which makes it easier to switch between the different implementations
		2. Modularity can be achieved
		3. Easier to test and maintain the application
	= In spring we can implement IoC principal by following ways :-
		1. Dependency Injection
		2. Dependency Lookup

# => Dependency Injection :-
	= Dependency Injection is the main functionality of Spring Container (IoC Container) through which it "injects" one object into another object or "dependencies"
	= Dependency Injection can be achieved by following ways :-
		1. Setter method dependency injection
		2. Constructor dependency injection
		
# => Setter method dependency injection :-
	= If we inject dependent values through setter methods i.e. setXXX() then it is known as setter method dependency injection
	= To inject primitive values (int, char, long, float etc) or String values then we have to use "value" attribute in <property> tag
	= To inject object (any user defined data type) then we have to use "ref" attribute in <property> tag
	= To inject any List or Set into another object, then we have to use <list> or <set> tag
	= To inject any Map into another object then we have to use <map> and <entry key="" value=""> tag 
	

# => Constructor dependency injection :-
	= If we inject dependent values through constructor then it is known as Constructor dependency injection
	= To inject values through constructor we have to use <constructor-arg> tag
	
=========
IOC
![image](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/0d907a67-f070-44e1-b901-104345571556)

Object Dependency

![image](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/4e684a0a-7b58-4204-bd40-9912b5f8c161)












# Setter Vs Constructor  Circular Dependency Namespace

# => Difference between Setter Method Dependency Injection and Constructor Dependency Injection ?
	1. How dependency is injected :-
		= Setter Method Dependency Injection uses setter methods i.e. setXXX() to inject dependency on the bean
		= Constructor Dependency Injection uses constructor to inject dependency on the bean
	2. Readibility :-
		= Setter Method Dependency Injection is more readable because we have to provide the property name and then its value i.e. <property name="property_name" value="value">
		= Constructor Dependency Injection is less readable because we do not have to provide the property name, we have to provide the value only i.e. <constructor-arg value="value">
	3. Partial Dependency :-
		= Partial Dependency is possible in case of Setter Method Dependency Injection because we can provide any number of dependency injection
		= Partial Dependency is not possible in case of Constructor Dependency Injection because it needs proper constructor according to the bean object <constructor-arg> tag
	4. Overriding Property or Dependency :-
		= We can override the properties or dependencies in case of Setter Method Dependency Injection
		= We cannot override the properties or dependencies in case of Constructor Dependency Injection because if we try to override the property then it will create new bean object
	5. Circular Dependency Injection :-
		= Circular dependency injection can be achieved in case of Setter Method Dependency Injection
		= We cannot achieve Circular Dependency Injection in case of Constructor Dependency Injection
		
==================

# => What is Circular Dependency Injection :-
	= Circular dependency injection occurs when a bean object A depends on another bean object B and bean B is dependent on bean object A
	= Circular Dependency Injection can be achieved by Setter Method Dependency Injection because bean object is created first and then injection is done, so both bean objects are created and dependency will be successfully completed.....But
	In case of Constructor Dependency Injection, Circular Dependency Injection cannot be achieved because Constructor Dependency Injection requires another bean object which is not created and another bean object requires first bean object which is again not created and thus ambiguity condition will occur
	
=============

# => p-namespace :-
	= When we have to inject the dependencies in bean object using setter methods then we have to provide <property> tag. More dependencies - more <property> tags. This is not good because code becomes lengthy.
	= To resolve this problem spring has provided one shortcut i.e. p-namespace
	= How to use p-namespace :-
		1. Provide p-namespace declaration (xmlns:p="http://www.springframework.org/schema/p") in spring configuration file
		2. Then we can provide the dependencies in bean tag by p:property_name="value" OR p:property_name-ref="value"
		
		
# => c-namespace :-
	= When we have to inject the dependencies in bean object using constructor then we have to use <constructor-arg> tag. More dependencies - more <constructor-arg> tags. This is not good because code becomes lengthy and less readable
	= To resolve this problem spring has provided one shortcut i.e. c-namespace
	= How to use c-namespace :-
		1. Provide c-namespace declaration (xmlns:c="http://www.springframework.org/schema/c") in spring configuration file
		2. Then we can provide the dependencies in bean tag by c:property_name="value" OR c:_index-position="value" OR c:property_name-ref="value"
		
===================






class Student
{
	private String name;

	public void setName(String name)
	{
		this.name = name;
	}
}
---------------------------
class Test
{
	- - - main(-)
	{
		Student st=new Student();
		st.setName("Deepak");
		st.setName("Amit");
	}
}
=============






class Student
{
	private String name;

	public Student(String name)
	{
		this.name = name;
	}
}
---------------------
class Test
{
	- - - main(-)
	{
		Student st1=new Student("Deepak");
		Student st2=new Student("Amit");
	}
}
==============
















# Circular DI
![image](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/51f899e8-a879-4549-a121-0d6c4414fc5e)



# Circular_DI_using Setter Method

![image](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/d0860dcb-af58-4a81-9b19-fd1854874e02)




# Circular_DI_using Constructor

![image](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/59e278b1-f74b-411d-a5fc-aed3e7d5495a)


# Properties
![image](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/d5e10e35-c277-4706-bf57-e5885f99135e)


































# BeanPostProcessor__Bean Inheritance_Abstract Bean




# => BeanPostProcessor :-
	-> BeanPostProcessor allows us to modify the configurations of bean object before and after its creation
	-> BeanPostProcessor is an interface which contains 2 methods :-
		1. postProcessBeforeInitialization() - this method will execute before bean object is initialized
		2. postProcessAfterInitialization() - this method will be executed after bean object is initialized
	
=============

# => Global Attributes :-

	1. default-init-method :-
		-> It is an attribute which is used in beans tag
		-> It reduces the init-method attribute in bean tag
	
	2. default-destroy-method :-
	
----------------------------------

# => Bean Inheritance :-
	-> Bean Inheritance is the process by which parent bean object properties are inhertied to child bean object properties
	-> Bean Inheritance is not same as that of Core Java classes concept
	-> How bean inheritance is achieved ?
		= by using "parent" attribute
	
------------------------

# => "abstract" Attribute :-
	-> If we want to create bean template then we use abstract attribute
	-> By using "abstract" attribute, its object is not created
	-> "abstract" concept is not same as that of Core Java classes or interfaces concept 

============







# Bean_Inheritance_and_Abstract_Bean

![image](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/1e13d70c-c2a1-4d5f-8cbb-68b5c7e1cbfb)























# Autowiring
	
# => Dependency Injection :-
		-> DI is the process by which we can inject one bean object into another bean object
		-> DI can be achieved by using 2 ways :-
			1. Setter Method DI
			2. Constructor DI
			
		-> NOTE :- Till now we have achieved DI by explicit way ie by using "ref" attribute in either <property> tag or <constructor-arg> tag
	
	
# => Autowiring :-
	-> Autowiring is the feature of Spring Framework by which we can achieve DI by implicit way i.e. automatically i.e. without using "ref" attribute in either <property> or <constructor-arg> tag
	-> Advantage :-
		= It requires less code
	-> Disadvantage :-
		= Autowiring can be achieved only on non-primitive data types or user-defined data types (excluding String)
		= There is no control of the programmer
	-> How we can achieve autowiring ?
		= We can achieve autowiring by 4 ways :-
			1. XML Based Autowiring
			2. Annotation Based Autowiring
			3. Auto Discovery (Stereo Types)
			4. Java Based Autowiring
			
======

# => XML Based Autowiring :-
	-> In this case we can achieve autowiring without using "ref" attribute in <property> or <constructor-arg> tag
	-> We can achieve XML based autowiring by using "autowire" attribute in <bean> tag i.e. <bean id="--" class="----" autowire="--modes--">
	
	-> Modes of "autowire" attribute :-
		1. no :-
			= It is the default autowiring mode
			= It simply means that we dont want to achieve autowiring
		2. byName :-
			= In this case we will achieve autowiring by matching "property name" of bean class and "bean id" in spring configuration file
			= It uses "Setter Method DI" internally
		3. byType :-
			= In this case we will achieve autowiring by matching the data-types i.e. "data-type" in bean class should be same as that of "class" in <bean> tag
			= It uses "Setter Method DI" internally
			= In this case its not compulsory to have the same name of "property name" and "bean id"
			= In the situation where we have multiple beans of same bean class in spring configuration file, then there will be confusion for injection occurs. In that case we will use "autowire-candidate" attribute which informs that the particular bean will participate in injection or not
		4. constructor :-
			= This is same as that of byType
			= It uses "Constructor DI" internally
		5. autodeduct
			= It is depricated in spring 3 version
			
=========









# Dependency Injection

![image](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/64d3476c-cc16-4ed2-970c-ef68a5fa6e7f)


# Autowiring
![image](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/86963d6a-e803-4691-bff9-5734e4993840)











# Autowiring__ Annotation__Seterotype Based


# => Annotation Based Autowiring :-
	-> It will inject one bean object into another bean object automatically using annotations
	-> Annotations used in this case are :-
		1. @Required
		2. @Autowired
		3. @Qualifier
		
--------------------

# => @Required :-
	-> It is used to force the Spring Container (IoC Container) for Dependency Injection
	-> If we use @Required annotation then DI is necessary/compulsory
	
# => @Autowired :-
	-> It is used to provide DI without using <property> tag or any other attribute in XML Configuration file
	-> @Autowired can be used with setter methods or properties/variables or constructor
	-> If we dont want to use @Required annotation then we can use "required" member i.e. @Autowired(required = true)
	-> It uses by default "byType" mechanism
	
# => @Qualifier :-
	-> When we have multiple bean definations for single bean class in spring configuration file, then confusion may occur that which bean it has to inject. So to remove this confusion @Qualifier is used i.e. @Qualifier("bean-id")
	-> @Qualifier is used with @Autowired annotation
	
===============

# => Stereotypes Annotation bases Autowiring :-
	-> Stereotypes annotations are used to inject one bean object into another bean object automatically
	-> The main Stereotypes Annotation is "@Component"
	-> Some meta-annotations in @Component are :-
		1. @Controller
		2. @Service
		3. @Repositories
		
	-> NOTE :- Stereotypes annotations denotes the roles of types or methods in any architecture like MVC
	
-----------------------

# => @Component :-
	-> It is class level annotation. It is used to denote class as a component
	-> Its functionality is :-
		= It will scan our application for classes with @Component annotation in provided package
		= Then it will instantiate all those classes
		= Then it will inject specified dependencies into them
		
	-> NOTE : We dont need to provide bean definations in spring configuration file
	
	-> How @Component create objects :-
		@Component
		class Student			------------>      Student student = new Student();
		{
								
		}
		
		@Component
		class EmpModule			------------->   EmpModule empModule = new EmpModule();
		{
		
		}
		
	-> How to change the object name :-
		@Component("empmod")
		class EmpModule			------------->   EmpModule empmod = new EmpModule();
		{
		
		}
		
	-> How we can scan the multiple packages :-
		1. We can provide multiple packages i.e. 
			<context:component-scan base-package="in.sp.beans, in.sp.empbeans"/>
		2. We can provide base package which contains all the Component classes i.e.
			<context:component-scan base-package="in.sp"/>
			
	-> How we can inject primitive data type values ?
		= by using @Value("---") annotation above properties
		
	
---------------------------------------

# 1. @Controller
	-> It is used with the classes that acts as controller
	-> It is mainly used in combination with annotation handler methods i.e. @RequestMapping or @GetMapping or @Post or @Get etc
	
# 2. @Service
	-> It is used with the classes that provides some business logics

# 3. @Repositories
	-> It is used with the classes that are responsible for providing CRUD operations on database
	
==============






# Component Annotation
![image](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/bc4740a6-ecb1-42fe-a11d-9c4e007d7e5b)



# MVC Pattern
![image](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/b745b1f4-0f20-40c4-a0ec-34e0e71799c7)













# JAVA Configuration file


# => Java Based Configuration :-
	-> Till now we have learned to create Spring Configuration File in XML.
	-> Till Spring 2.4 version it was compulsory to create XML Based Spring Configuration File. But from 3.x version its not compulsory to create XML Based Spring Configuration File. In replace to it we can create Java Based Spring Configuration File.
	-> How to create Java Based Configuration File :-
		1. We have to create one java class and mark it as @Configuration
		2. Create methods and mark them as @Bean
		3. Create object of AnnotationConfigApplicationContext class and get the bean object


# => @Configuration :-
	-> It is class level annotation
	-> It indicates to the Spring Container that the provided class can be used as Spring Configuration File
	
# => @Bean :-
	-> It is method level annotation
	-> It indicates that the provided method will return bean object
	
================

# => Java Based Autowiring :-
	-> In this case bean object will be injected automatically into another bean object by using java based annotations
	-> To achieve Java Based Autowiring we have to use following annotations :-
		1. @Component
		2. @ComponentScan
		
=================

# => We can achieve autowiring by 4 ways :-
	1. XML Based Autowiring :-
		-> We can achieve by "autowire" with modes(no, byType, byName, constructor) and "autowire-candidate" attributes
		
	2. Annotation Based Autowiring :-
		-> We can achieve by annotations i.e. "@Required", "@Autowired" and "@Qualifier"
	
	3. Stereotypes Annotation bases Autowiring :-
		-> We can achieve by stereotypes annotations i.e. "@Component", "@Controller", "@Service" and "@Repositories" (other annotation used is "@Value")
	
	4. Java Based Autowiring :-
		-> We can achieve by annotations i.e. "@Component" and "@ComponentScan" (other annotation used is "@Value")
		
------------------------------------




















# Bean Validation

# => Bean Validations :-
	-> Bean Validations is the way by which we can check the proper data in the bean object
	
# => Steps to validate bean data :-
	1. Create any one Validator class (means create any class and implements it with Validator interface)
	2. Use any one class for error binding i.e. DataBinder, MapBindingResult etc
	
-------------------------------

interface Validator
{
	public boolean supports(Class cls);
	public void validate(Object obj, Errors errors);
}

--------------------------------

# => DataBinder :-
	-> It is the binder class that allows for setting property values on target object, including support for validation and binding result analysis.

class DataBinder
{
	DataBinder(Object target)
	DataBinder(Object target, String objname)
	
	addValidators()
	validate()
	getBindingResult()
}

--------------------------------

interface Errors
{
	rejectValue()
	getAllErrors()
}

--------------------------------
	
	
	










# Logging JAVA Logging API



# => Logging :-
	-> Logging is the feature or approach that helps the developers to track the issues or errors or messages in our applications
	-> For eg mail not received, transaction failed, server issues or any such critical failure or error will be tracked and stored in the log file
	
	-> Many programming languages including java supports Logging approach
	-> Logging was introduced in JDK 1.4 version
	
	-> There are a lot of API's or frameworks for Logging approach :-
		1. Java Logging API
		2. Log4j
		3. Logback
		4. Tinylog
		
		5. JCL (Jakarta Commons Logging) - also known as Apache Commons Logging
		6. SLF4J
		(5th and 6th are Logging Wrappers)
		
========

# => Java Logging API :-
	-> It is Logging API which is present in JRE by default, no need to download or install any external jar file
	-> This API is present in "java.util.logging" package
	
	-> There are 2 main components in Logging :-
		1. Logger :-
			-> A Logger is an object that allows the application to capture the log records and pass the records to the corresponding handler
			-> The application logs the messages with some security levels to the logger object
			-> Some security levels are :-
				1. SEVERE (highest value)
				2. WARNING
				3. INFO
				4. CONFIG
				5. FINE
				6. FINER
				7. FINEST (lowest value)
	       2. Handler :-
			-> Handler listens for the messages at or above a specified minimum security levels
			-> Handler will take the messages and post it to the provided medium like console or file or database or socket etc
			-> There are 5 Handlers :-
				1. ConsoleHandler
				2. FileHandler
				3. StreamHandler
				4. SocketHandler
				5. MemoryHandler
				
==============





# logging

![image](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/a6ccd7d0-958c-48b0-bf25-afe9f4995f1a)















# => Log4j :-
	-> Log4j is an open-source logging API for jav which was introduced in 2001
	-> It is used to store the log details and make it available for analysis at any point of time
	-> Log4j is fast, reliable and flexible logging framework
	
# -> Components of Log4j :-
		1. Logger :-
			-> Same task as that of Java Logging API
			-> Some security levels are :-
				1. OFF
				2. FATAL	-	fatal()
				3. ERROR	- 	error()
				4. WARN		- 	warn()
				5. INFO		- 	info()
				6. DEBUG	- 	debug()
				7. TRACE	- 	trace()
		2. Appender :-
			-> Same task as that of Java Logging API
			-> Some Appenders in Log4j are :-
				1. ConsoleAppender
				2. FileAppender
				3. WriterAppender
				4. JDBCAppender
				5. SocketAppender
				6. TelnetAppender
				7. SMTPAppender
				8. SyslogAppender
				
===========

# => ConversionPattern :-

	1. %p %d %m%n
		Output - ERROR 2022-10-20 07:58:18,533 this is ERROR message
		
	2. [%p] %d %m%n
		Output - [ERROR] 2022-10-20 08:01:40,007 this is ERROR message
		
	3. [%-10p] %d %m%n
		Output - [ERROR     ] 2022-10-20 08:03:52,189 this is ERROR message
		
	4. [%p] %d{dd MMM yyyy HH:mm:ss,SSS} %m%n
		Output - [ERROR] 20 Oct 2022 08:04:42,660 this is ERROR message
		
	5. [%p] %d{dd/MM/yyyy HH:mm:ss aa} %m%n
		Output - [ERROR] 20/10/2022 08:06:41 AM this is ERROR message
		
	6. [%p] [%d{dd/MM/yyyy HH:mm:ss aa}] - %m%n
		Output - [ERROR] [20/10/2022 08:08:03 AM] - this is ERROR message
		
	= % - The sequence %% outputs a single percent sign
	= p - Used to output the priority of the logging event
	= d - Used to output the date of the logging event
	= m - Used to output the application supplied message associated with the logging event
	= n - Outputs the platform dependent line separator character or characters
	
================
	












# Event Handling

# => Event Handling :-

-----------------------------
	=> According to Core Java :-
	-> Changing the state of an object is known as event
	-> For example : clicking on button, dragging mouse, clicking on tags, choosing menu options etc
	-> Types of Events :-
		1. Foreground Events
		2. Background Events
	-> In core java, some event classes and interfaces were provided in "java.awt.event" package
	-> Some "Event classes" and "Listener Interfaces" are :-
	
		  EVENT CLASSES     			        LISTENER INTERFACES
		1. ActionEvent -------------------------- ActionListener
		2. MouseEvent --------------------------- MouseListener
		3. KeyEvent ----------------------------- KeyListener
		4. ItemEvent ---------------------------- ItemListener
		5. WindowEvent -------------------------- WindowListener
		   etc
		   
------------------------
	=> According to Advance Java :-
	-> In this case events are generate by mainly 3 objects i.e. Request, Context and Session object
	-> Some "Event classes" and "Listener Interfaces" are :-
	
		1. ServletRequestEvent -------------------------- ServletRequestListener
		2. ServletRequestAttributeEvent ----------------- ServletRequestAttributeListener
		
		3. ServletContextEvent -------------------------- ServletContextListener
		4. ServletContextAttributeEvent ----------------- ServletContextAttributeListener
		
		5. HttpSessionEvent ----------------------------- HttpSessionListener
														  HttpSessionAttributeListener
		6. HttpSessionBindingEvent ---------------------- HttpSessionBindingListener
														  HttpSessionActivationListener
														  
-------------------
	=> According to Spring Framework :-
	-> We already know there are 2 types of Spring Containers i.e.
		1. BeanFactory
		2. ApplicationContext
	-> NOTE : BeanFactory does not support Event Handling
	
	-> The main task of ApplicationContext is to manage the bean object life cycle
	-> ApplicationContext perform or publish certain types of events for bean objects i.e. when Spring Container was started, refresh, stopped and closed
	-> To handle the events (Spring Container was started, refresh, stopped and closed) spring framework provides the concept of "event handling"
	-> Event Handling in ApplicationContext is provided through "ApplicationEvent" class and "ApplicationListener" interface
	
	-> Some standard events provided by Spring are :-
		1. ContextRefreshedEvent
			-> Event is generated or published when the ApplicationContext is either refreshed or initialized.
			-> This can also be raised using refresh() method of ConfigurableApplicationContext interface
		2. ContextStartedEvent
			-> Event is generated or published when the ApplicationContext is started.
			-> This can also be raised using start() method of ConfigurableApplicationContext interface
		3. ContextStoppedEvent
			-> Event is generated or published when the ApplicationContext is stopped.
			-> This can also be raised using stop() method of ConfigurableApplicationContext interface
		4. ContextClosedEvent
			-> Event is generated or published when the ApplicationContext is closed.
			-> This can also be raised using close() method of ConfigurableApplicationContext interface
		5. RequestHandledEvent
			-> Event is generated or published when request processing is completed
	-> Above all event classes are present in "org.springframework.context.event" package
	
=================


# Event_Handling

![image](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/ab95dff6-b153-416e-b7a4-9fc064004db3)















# Internationalization__Locale Class

=> Whenever we create any application we always want to execute it for different countries having different languages and time zones.

=> Some data or information that is different for different countries :-
	= Number
	= Currency
	= Date
	= Time
	= Messages
	= Phone Numbers
	= Postal Address
	= Labels on GUI components
	  etc
	  
=> For this purpose we use Internationalization and Localization concept

===============

# => Internationalization :-
	-> Internationalization is the process to design the application in such a way that provides the support for different countries or languages automatically without performing any change in the application
	-> Internationalization helps to make the application handle for different languages, number format, currencies, date, time etc
	
	-> Short form of Internationalization is "I18N" because there are 18 letters in between first "I" and last "n"
	
	
# => Localization :-
	-> Localization is the process of adapting application for a specific region or language by adding locale-specific components and translating text
	-> Short form of Localization is "L10N" because there is 10 letters in between first "L" and last "n"
	
	
# => NOTE : Localization typically follows the Internationalization

=============

# => To achieve Internationalization and Localization, Java has provided some classes which are as follows :-
	1. Locale
	2. NumberFormat
	   DecimalFormat
	3. DateFormat
	   SimpleDateFormat
	4. ResourceBundle
	
	(NOTE : this is for Core Java)
	
=================

# => Locale :-
	-> Locale class object represents a specific geographical, political or cultural region that the user wants to see in their user interface
	
	-> It is the class which is present in "java.util" package
		class Locale
		{
			//constructors
			//methods
		}

	-> While using Locale object we have to divide the users on the basis of three parameters :-
		1. Language : It is denoted by 2 lower-case letters for example en, hi, ar, fr, ko, la, ne etc
		2. Country : It is denoted by 2 upper-case letters for example IN, US, UA, RU, SA etc 
		3. System Varient (OS Varient) : It is denoted by 3 lower-case letters for example win, lin, uni etc
		
	-> Constructors :-
		1. public Locale(String language)
		2. public Locale(String language, String country)
		3. public Locale(String language, String country, String variant)
		
	-> Methods :-
		1. getDefault() : It is the static method which will return the current default values for the locale as per our JVM instance
		
		2. getDisplayCountry() : It will return the country name to which locale belongs to
		
		3. getCountry() : It will returns the country/region code for this locale, which should either be the empty string, an uppercase ISO 3166 2-letter code
		
		4. getDisplayLanguage() : It will returns a name for the locale's language that is appropriate for display to the user
		
		5. getLanguage() : It will returns the language code of this Locale
		
=================














# => ResourceBundle :-
	-> It is an abstract class which is present in "java.util" package
	-> It is used to achieve I18N wrt messages
	
	-> For this, we have to use properties file
	
=========

# => Properties file format :-
	
	-> Naming format :-
		basename_languagecode_countrycode_systemvarient.properties
		
	-> for example :-
		MessageBundle_en_US.properties
		MessageBundle_hi_IN.properties
		
-------------------------------






# tasks
![image](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/4e5b21b5-88d1-422c-8768-a28f0e41f7e6)



# frame_task
![image](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/c81f4853-aa3a-46c8-82c0-9f170d69fe51)









# Spring Internalization
=> I18N in Spring :-
	-> To achieve I18N in spring we can use following interfaces and classes :-
		1. MessageSource interface
		2. ResourceBundleMessageSource class
		3. ReloadableResourceBundleMessageSource class





# Spring I18N
![image](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/3603825d-e867-49d1-b13b-89730c2cd186)









# Reflection API, Bean Introspection in JAVA and Spring


# => Reflection :-
	-> Reflection is the feature in Java programming
	-> It is used to examine or "introspect" the class and manipulate internal properties of the class i.e. we can get the details of all the members or methods or constructors etc using reflection
	-> For this java has provided one API ie. Reflection API in "java.lang.reflect" package
	-> Reflection API hierarchy :-
	
	-> Main classes and interfaces used in Reflection API are :-
		1. Method
		2. Field
		3. Constructor
		4. Modifier
		5. Array
		7. Member <interface>
	
	-> How we can get class instance ?
		= We can get the class instance by 3 ways :-
			1. forName() method of Class class
			2. getClass() method of Object class
			3. ClassName.class syntax

==============

# => Bean Introspection (Java) :-
	-> It is the feature through which we can examine or "introspect" the bean class or object
	
	-> In todays world, there are a lot of reporisitories (it is centralized system where many objects are stored) present. So whenever we need any object from that reporisitory, then we also want to get the details of that object. In that case we use Bean Introspection feature
	
	-> For this java has provided one package i.e. "java.beans" package
	-> Main classes and interfaces present in "java.beans" package are :-
		1. Introspector class
		2. BeanInfo interface
		3. BeanDescriptor class
		4. PropertyDescriptor class
		5. MethodDescriptor class
		
-------------

# => Introspector :-
	-> Methods of Introspector class :-
		1. getBeanInfo(-) - static method
		
-----------

# => BeanInfo :-
	-> Methods of BeanInfo interface :-
		1. getBeanDescriptor()
		2. getMethodDescriptors()
		
------------

# => BeanDescriptor :-
	-> Methods of BeanDescriptor class :-
		1. getBeanClass()
		2. getName()
		3. setName(-)
		4. getDisplayName()
		5. setDisplayName()
		6. getShortDescription()
		7. setShortDescription()
		8. getValue(-)
		9. setValue(-, -)
		   etc
		
----------------
		
# => MethodDescriptor :-
	-> Methods of MethodDescriptor class :-
		1. getMethod()
		2. getName()
		3. setName(-)
		4. getDisplayName()
		5. setDisplayName()
		6. getShortDescription()
		7. setShortDescription()
		8. getValue(-)
		9. setValue(-, -)
		10. getParameterDescriptors()
		   etc

-------------------

# => PropertyDescriptor :-
	-> Methods of PropertyDescriptor class :-
		1. getPropertyType()
		2. getName()
		3. setName(-)
		4. getReadMethod()
		5. getWriteMethod()
		6. setValue(-, -)
		7. getValue(-)
		
=============

# => Bean Introspection (Spring) :-
	-> For bean introspection in spring, we have provided one package i.e. "org.springframework.beans"
	-> Main classes and interfaces present in this package are :-
		1. BeanWrapper <interface>
		2. BeanWrapperImp <class>
		3. BeanUtils <class>
		
---------------------]
		
# => BeanWrapper :-
	-> Methods of BeanWrapper interface :-
		1. getWrappedClass()
		2. getWrappedInstance()
		3. setPropertyValues(-)
		4. getPropertyValues(-)
		5. isReadableProperty(-)
		6. isWritableProperty(-)
		7. getPropertyType(-)
		   etc
		   
------------

# => BeanUtils :-
	-> It provides the utility methods i.e. static methods
	-> Methods of BeanUtils classes :-
		1. copyProperties()
		   etc

================




# Reflection API
![image](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/3bb37ab0-b460-4dd3-9687-24b09197278e)















# Property Editors in Java and Spring
# => Property Editor :-
	-> Property editor is the feature of JavaBeans API which is used to convert property values from text to object or object to text
	-> Simply we can say, it is the way through which we can make our bean object more user-friendly
	
------------------

# => Property Editor in J2SE :-
	-> A property editor is a tool which provides support for GUI that user wants to edit the property value of given type
	-> Property editor was introduced or designed for Swing Applications
	
	-> Pre-defined property editors are :-
		1. BooleanEditor
		2. ByteEditor
		3. IntEditor
		4. NumberEditor
		5. ShortEditor
		6. FloatEditor
		7. LongEditor
		8. StringEditor
		9. FontEditor
		10. ColorEditor
			etc
	-> NOTE : ABove all classes are present in "com.sun.beans.editors" package
	
	-> If we want to create customized property editors then java has provided one package i.e. "java.beans" package
	-> Main interfaces and classes used for property editors are :-
		1. PropertyEditor <interface>
		2. PropertyEditorSupport <class>
		3. PropertyEditorManager <class>
	
---------------------
			
# => PropertyEditor :-
	-> It is an interface which provides support for GUI
	-> Methods :-
		1. void setValue(Object value);
		2. Object getValue();
		3. String getAsText();
		4. void setAsText(String text)
		
		5. boolean isPaintable();
		6. void paintValue(java.awt.Graphics gfx, java.awt.Rectangle box);
		   etc
		   
# => PropertyEditorSupport :-
	-> It is the support class which us used to build property editors
	-> It can be used either as a base class or as a delegate
	-> Methods :-
		= Methods same as PropertyEditor interface
		
# => PropertyEditorManager :-
	-> It is the class which is used to locate the property editor for any given type name
	-> Methods :-
		1. public static void registerEditor(Class<?> targetType, Class<?> editorClass)
		2. public static PropertyEditor findEditor(Class<?> targetType)
		3. public static String[] getEditorSearchPath()
		4. public static void setEditorSearchPath(String[] path)
		
==============

# => Property Editor in Spring :-
	-> Property editor is the feature of JavaBeans API which is used to convert property values from text to object or object to text
	-> Some pre-defined property editors in Spring are :-
		1. ByteArrayPropertyEditor
		2. ClassEditor
		3. CustomBooleanEditor
		4. CustomNumberEditor
		5. CustomCollectionEditor
		6. FileEditor
		7. InputStreamEditor
		8. PatternEditor
		9. URLEditor
		10. StringTrimmerEditor
			etc
			
	-> Main interfaces and classes used for property editors are :-
		1. PropertyEditor <interface>
		2. PropertyEditorSupport <class>
		3. CustomEditorConfigurer <it is used for configurations in resource file>
		
===========




# Profiling SpEL


# => Profiling :-
	-> Profiling is the way through whch we can activate different profiles in different stages
	-> While developing any project we have different stages i.e. development, testing, production etc and sometimes
	      we want to use different profiles (configurations, database, testing tools, debugging tools etc), in that case we use Profiling concept
	
==============

# => SpEL :-
	-> Full form of SpEL is "Spring Expression Language"
	-> SpEL is an "Expression Langauge" (like Java is "Programming Language") having its own syntax
	-> Some other "Expression Langauges" are :-
		1. JSP EL
		2. OGNL (Object-Graph Navigation Langauge)
		3. MVEL
		4. JBoss EL
		   etc
	-> Its main objective is to manipulate the objects and their properties at runtime
	
	-> Spring has provided one package for SpEL i.e. "org.springframework.expression"
	-> Main interfaces and classes for SpEL are :-
		1. ExpressionParser <interface>
		2. SpelExpressionParser <class>
		
		3. Expression <interface>
		4. SpelExpression <class>
		
		5. EvaluationContext <interface>
		6. StandardEvaluationContext <class>
		
	-> Syntax of SpEL expression string :-
		= #{ expression }
		
	-> Features supported by SpEL :-
		1. Expressions
			= Literal expressions
			= Regular expression (RegEx)
			= Class expressions
			= Templated expressions
		2. Operators
			= Arithmetic Operators
				-> +, -, *, / etc
			= Relational Operators
				->  ==  or  eq
				->  !=  or  ne
				->  >   or  gt
				->  <   or  lt
				->  >=  or  ge
				->  <=  or  le
			= Logical Operators
				-> &&  or  and
				-> ||  or  or
				-> !   or  not
			= Ternary Operator
				->  variable = expression1 ? expression2 : expression3
			= Type Operator - T[class_name]
		3. Variables
		4. Method Invocation
		5. Accessing properties, arrays, maps, list
		6. Calling constructors
		7. Bean references
		   etc
		
------------------------------------------------

# => ExpressionParser :-
	-> It is an interface which is responsible to parse(resolve) an expression string
	-> Methods :-
		= parseExpression( - )
		
# => SpelExpressionParser :-
	-> It is an implemented class for ExpressionParser
	
------------------------------------------------

# => Expression :-
	-> It is an interface which is responsible to evaluate an expression string
	-> Methods :-
		= setValue(-)
		= getValue()
		= getValueType()
		= getValueTypeDescriptor()
		= getExpressionString()
		= isWritable(-)
		
# => SpelExpression :-
	-> It is an implemented class for Expression
	
--------------------------------------------------


# => Task :-
	-> create simple class with one static method and one instance method
	-> call them using SpEL
		







# SpEL Workflow

![image](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/3ce7279c-4207-4c8f-9848-ac06f2a95e11)


# Ternary Operator
![image](https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/401fdf59-76b1-478a-9d83-50825e91e9e9)
















