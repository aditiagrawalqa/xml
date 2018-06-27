package com.qainfotech.training.Test_001;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class_01 {
@Test
	public void method_01 ()
	{
		System.out.println("First method of class_001");
		
	}
@BeforeTest
	public void method_02()
	{
		System.out.println("Second method of class_001");
	}
	
}
