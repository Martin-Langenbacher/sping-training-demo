package de.udemy.springdemo;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContex context = new ClassPathXmlApplicationContex "beanScope-applicationContext.xml");
		
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		
		// ----------------------------------> Chapter: 45 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
	}

}
