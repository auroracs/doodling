package com.jengle.as400;

import org.apache.log4j.Logger;

public class SimpleJava {

	final static Logger logger = Logger.getLogger(SimpleJava.class);
	
	public static void main(String[] args) {

		SimpleJava obj = new SimpleJava();
		obj.runMe(args);

	}

	private void runMe(String[] argus){
		
		String firstName = argus[0].trim();
		String lastName = argus[1].trim();
		String age = argus[2].trim();

		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Age: " + age);

		logger.warn("First Name : " + firstName);
		logger.error("Last Name : " + lastName);
		logger.fatal("Age : " + age);
		
	}


}
