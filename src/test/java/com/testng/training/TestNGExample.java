package com.testng.training;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGExample {
	
	@BeforeClass
	 public void beforeClass() {
	        System.out.println("This is my before Class");
	}
	
	@AfterClass
  	 public void afterClass() {
  	        System.out.println("This is my after Class");
   }
	
	@BeforeMethod
	 public void beforeMethod() {
	        System.out.println("This is my before Method");
	}
    @Test
    public void test1() {
        System.out.println("This is my first test using TestNG"); 
        
        
    } 
    @Test
    public void test2() {
        System.out.println("This is my second test using TestNG"); 
    }
        
        @AfterMethod
   	 public void afterMethod() {
   	        System.out.println("This is my after Method");
        }
        
   
}

