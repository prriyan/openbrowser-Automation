package com.sgic.logintest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class browserPopping {
	
	WebDriver driver;
	String baseUrl="https://www.google.co.in/";


	 @Test
	 public void openBrowser() {
	 System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL+"t");
	// driver.get("https://www.google.com/search?q=google+chrome&oq=google+chrome&aqs=chrome..69i57j69i64.12824j0j7&sourceid=chrome&ie=UTF-8");
	 }
	
	 
	 @Test(dependsOnMethods= {"openBrowser"})
	 public void Login() {
	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 driver.findElement(By.id("btnLogin")).click();
	 driver.findElement(By.id("welcome")).click();
	 driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
	 driver.close();
	 
	 }}
