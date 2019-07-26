package com.sgic.logintest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class downloadTry {
	
	WebDriver driver;
	 @Test
	 public void browserOpen() {
	 System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 // driver.get("https://opensource-demo.orangehrmlive.com/");
	 driver.get("https://www.google.com/");
	 }


	 @Test(dependsOnMethods= {"browserOpen"})
public void Search() {
		 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("WAMP");
		 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div/div[1]/a/h3")).click();
//	 driver.findElement(By.xpath("//*[@id=\"pg_project\"]/div[5]/div[2]/div[1]/div/section/div[2]/div[3]/a[1]")).click();
         driver.quit();
	 

	 } }
