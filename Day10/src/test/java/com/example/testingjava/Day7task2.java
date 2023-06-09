package com.example.testingjava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day7task2 {
	int num1 = 30;
	 int num2 = 10;
	 @Test(priority = 1)
	 public void add()
	 {
		 int sum = num1+num2;
		 Assert.assertEquals(sum,40);
	 }
	 @Test(priority = 2)
	 public void sub()
	 {
		 int minus = num1-num2;
		 Assert.assertEquals(minus, 20);
	 }
	 @Test(priority = 3)
	 public void mul()
	 {
		 int product = num1+num2;
		 Assert.assertEquals(product ,200);
	 }
	 @Test(priority = 4)
	 public void div()
	 {
		 int divide = num1/num2;
		 Assert.assertEquals(divide ,200);
	 }
}
