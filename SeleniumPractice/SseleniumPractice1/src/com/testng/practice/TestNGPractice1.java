package com.testng.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice1
{

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suit will display");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suit will displayed");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before test will displayed");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("after test will displayed");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class will be displayed");
	}
	
	@AfterClass
	public void beforeafterClass()
	{
		System.out.println("after class will be displayed");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method will be displayed");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method will be displayed");
	}
	
	@Test
	public void practice()
	{
		System.out.println("first testng program");
	}
}
