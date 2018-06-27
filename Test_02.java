package com.qainfotech.training.Test_001;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeClass;

public class Test_02 {
	@BeforeSuite
public void method_03() {
	System.out.println("First Method of "+getClass().getSimpleName()+"with Thread id"+ Thread.currentThread().getId());
			
}
	@BeforeClass
public void method_04() {
	System.out.println("Second Method of Class02"+ Thread.currentThread().getId());
}
}
