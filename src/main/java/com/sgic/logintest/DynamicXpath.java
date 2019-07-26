package com.sgic.logintest;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicXpath {
	
	WebDriver driver ;
	@Test
	public void Script() {
		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL+"t");

		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(1)); //switches to new tab

		 driver.get("https://www.mailinator.com/");

		 driver.switchTo().window(tabs.get(0)); // switch back to old
	}
	

}
