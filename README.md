# SpringCore

Introduction
-----------------
=> What is enterprise ?
	-> "Enterprise" is the term used for larger scale companies that has multiple departments, levels, divisons or groups
	-> For Example :-
		= Tata Group : Consumer & Retails, Hotels, Steel, Tata Power, IT, Automobiles etc
		= Mahindra Group : IT, Automobiles, Farm Equipments, Financial Services, Education, Defence etc

=> What is enterprise applications ?
	-> "Enterprise Applications" are large-scale, distributed, transaction and highly-available application which are designed to support enterprise business requirements
	-> In general we can say that "Enterprise Application" is the software hosted on servers that provides the application support to the enterprise
	-> We can develop enterprise application using J2EE
	-> To develop enterprise applications we have to use any one design pattern (for eg. MVC) and any one system architecture (for eg. 3-tire architecture)

=> Different types of applications in java :-
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

=> What is difference between Web Applications and Distributed Applications

=> What is difference between Web Server and Application Server
	= Web Server :
		-> Servlet container, JSP container
		-> For eg. Apache Tomcat, Resin etc
	= Application Server :
		-> EJB container, Also contains Servlet container, JSP container
		-> For eg. Weblogic, Websphere etc


=> What is framework :-
	= Frameworks are the pre-written code acting as a template which can be reused or customized by the developers
	= In simple terms we can say that framework is the collection of API's and tools which are used to develop projects

=> Advantages of frameworks :-
	= Fast development speed
	= Less code (because frameworks remove the boilerplate code)
	= Support API integration
	= Customization (frameworks are open source)
	= Easy debugging
	= Good document support

=> Types of frameworks :-
	= There are 2 types of frameworks :-
		1. Web Framework
			-> Frameworks which are used to create and execute web applications only
			-> For eg. Struts, JSF etc
		2. Application Framework
			-> Frameworks which are used to create and execute any type of applications i.e. standalone  applications or enterprise applications
			-> For eg. Spring

=> Spring Introduction :-
	= Spring is an open source framework which can be used to develop any type of application
	= Spring framework was written by Rod Johnson
	= Spring framework was released under Apache 2.0 licence
	= First version of spring framework was released in June 2003
	= First production release i.e. 1.0 version was released in March 2004
	= Latest version of spring is 5.x version which was released in 2017

============================================================================================

<img width="694" alt="image" src="https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/1c61e5e4-5954-4eef-a7cc-70115bf201bd">



<img width="733" alt="image" src="https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/80c43b77-6238-4692-a1db-66afa8409989">












=> Steps to create "Simple Spring Program" :-
	1. Download and install JDK and any one IDE (Netbeans / Eclipse)
	2. Download Spring jar Files
	3. Create "Java Project" in Eclipse
	4. Add spring jar files to the project (create spring library)
	5. Create "JavaBean" class (or "POJO" class) (.java)
	6. Create "Spring Configuration File" (.xml)
	7. Create "Test Application" (.java)
	
==============================================================================================

=> Download Spring jar Files
	= Download any spring version jar from : 
		https://repo.spring.io/ui/native/release/org/springframework/spring
	= Download commons-logging jar file
	
==============================================================================================

=> What is JavaBean ?
	= JavaBeans are the classes that encapsulate the objects into single unit (bean)
	= To create JavaBean we have to follow below conditions :-
		1. JavaBean class must have private properties (variables)
		2. JavaBean class must contain public getter and setter methods
		3. JavaBean class must inherit Serializable interface
		4. JavaBean class must have public no-argument constructor
		
		
=> What is difference between "POJO (Plain Old Java Object)" class and "JavaBean" class :-
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
	   
	   
=> NOTE :
	1. JavaBean is the special type of POJO class.
	2. There are some restrictions on POJO class to become JavaBean class
	3. All JavaBean classes are POJO classes but all POJO classes are not JavaBean classes
	

=======================================================================================================

=> What is "Spring Configuration File" ?
	= Spring Configuration File is simple XML file
	= We can provide any name to Spring Configuration File but it is always recommended to have 
	  "applicationContext.xml" name
	= We have to provide the structure to the XML file using DTD (Document Type Defination) or XSD (XML 
	  Schema Defination)
	= "Spring Configuration File" is used to provide all the JavaBean configuration details i.e. bean 
	  class name, identity of the bean class, values of the bean class etc
	   
	   
======================================================================================================

=> Resource :-
	= Whenever we need to read/load external resources like XML file, text file, properties file, image files etc then we can use Resource.
	
	= Resouce is an interface which is present in "org.springframework.core.io.Resource"
	= Spring has provided many implemented classes for Resouce interface :-
		1. ClassPathResource
		2. URLResource
		3. InputStreamResource
		4. ByteArrayResource
		5. FileSystemResource
		6. ServletContextResource
		
		
=> BeanFactory :-
	= BeanFactory is the actual "Spring Container" that contains the collection of bean objects
	= BeanFactory is used to create bean objects, initalize the beans and returns the bean objects to the client
	
	= BeanFactory is an interface which is present in "org.springframework.beans.factory" package
	= BeanFactory provides an implemented class i.e. XmlBeanFactory
	
	= BeanFactory has been deprecated from Spring 3.x version
	
=======================================================================================================




<img width="662" alt="image" src="https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/1ebb0b0d-d117-4c92-a907-552ed7c6f288">



<img width="701" alt="image" src="https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/1f58781c-2688-491e-908c-d4ee51ba1f0f">





<img width="593" alt="image" src="https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/b1fa1342-9b60-45b4-b7bd-64b4c609ac0f">



<img width="713" alt="image" src="https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/10c47754-c36d-425f-9269-bbfcf5e3267b">

















=> What is bean ?
	= Beans are the objects that form the the backbone of our application which is managed by the Spring Container
	= Beans are created with the configuration details/metadata that we provide to the container i.e. in the spring configuration file i.e. applicationContext.xml <bean/> 
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
		
=======================================================================================================

=> id attribute :
	= It specifies the bean unique identity
	
=> name attribute :-
	= It specifies the bean unique identity but it is more flexible as compared to id attribute
	
	= name attribute provides the flexibility to provide multiple names for one bean object
	= We can separate the multiple bean names by comma(,) or semi-colon(;) or space
	= We can provide same name to one bean object but same name cannot be provided to multiple bean objects
	= We can provide same bean name as that of id
	
=======================================================================================================

=> scope attribute :-
	= scope of the bean defines the life-cycle and visibility/accessbility of that bean in the context we use it
	= There are 7 types of scopes of bean object :-
		1. "singleton" scope
		2. "prototype" scope
		
		3. "request" scope
		4. "session" scope
		5. "globalSession" scope
		6. "application" scope
		7. "webSocket" scope
		
	= NOTE : We can provide custom scope to the bean objects
	
=======================================================================================================

=> "singleton" scope :-
	= In this scope only one instance will be created for a single bean defination and the same object will be shared for each request made for that bean using getBean(-) method
	= It is the default scope of bean object
	
=> "prototype" scope :-
	= In this scope a new instance is created for a single bean defination, when we request for bean using getBean(-) method, it willl return new bean instance
	
=======================================================================================================
single_bean_defination_object

<img width="575" alt="image" src="https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/e891dd19-e6ba-4e24-a3f1-5b6d060d99df">


multiple_bean_defination_object


<img width="569" alt="image" src="https://github.com/Nishita-Maheshwari/SpringCore/assets/47790697/aa9eb54f-7135-4579-b31c-a3815393c727">







