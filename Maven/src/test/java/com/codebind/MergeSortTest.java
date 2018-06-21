package com.codebind;


import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//This is a JUnit framework for testing merge sort
public class MergeSortTest
{
	//This method is executed first
	@BeforeClass
	public static void MergeSort()
	{
		System.out.println("Before class is the first method executed");
	}

	//this method will be executed before each test
	@Before
	public void beforeEachTest()
	{
		System.out.println("Before method is executed before each test.");
	}

	//This is a test method you can create as many tests as you want
	@Test
	public void test()
	{
		System.out.println("This is a test method to test bubble sort");
		MergeSort.main(null);
	}
	//This is executed after each test
	@After
	public void afterEachTest()
	{
		System.out.println("This is exceuted after each Test");

	}

}
