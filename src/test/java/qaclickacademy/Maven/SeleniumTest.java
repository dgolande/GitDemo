package qaclickacademy.Maven;

import org.testng.annotations.Test;

public class SeleniumTest 
{
	
	
	// How to execute all test cases from Test folder - mvn test
	
	// src/test/java - Test cases
	// src/main/java - Test data,utilities
	// While writing test case make sure to write Test at the end
	// To execute all test cases we need to add: maven-surefire-plugin in POM.XML
	// TestNG suite XML file allows flexible configuration of the test to be run
	// 2 profiles created in POM.xml (one for testng.xml(Regression test case) and second for testng2.xml(Smoke test case)) - mvn test -PRegression
	// Profiles used for maintaining testng XML file
	
	
	
	@Test
	public void display()
	{
		System.out.println("First method");
		System.out.println("First method 1");
		System.out.println("First method 2");
		
		
		System.out.println("First method 3");
		System.out.println("First method 4");
		System.out.println("First method 5");
		
		
		
	}

	@Test
	public void show()
	{
		System.out.println("Second method");
		
		System.out.println("Second hand method");
	}
	
	
	public void insert()
	{
		System.out.println("Insert method");
	}
	
	public void plugin()
	{
		System.out.println("PlugIN method");
	}
	
	
}
