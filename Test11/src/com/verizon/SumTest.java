package com.verizon;

import org.testng.annotations.Test;

public class SumTest {

  @Test
  public void addNumTest() {
    //throw new RuntimeException("Test not implemented");
  }
  
  @Test(priority=-8,invocationCount=5)
  public void addNumTest1() {
	  System.out.println("Test case addNum1");
    //throw new RuntimeException("Test not implemented");
  }
  @Test(priority=10,enabled=false) //enabled false makes the case disable
  public void addNumTest2() {
    //throw new RuntimeException("Test not implemented");
  }
}
