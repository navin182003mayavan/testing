package com.example.testingjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3task1 {
  @Test
  public  void main1() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(actualTitle,driver.getTitle());
  }
}
