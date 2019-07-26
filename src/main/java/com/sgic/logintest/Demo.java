package com.sgic.logintest;

import java.util.concurrent.TimeUnit;

import javax.swing.Spring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	
	WebDriver driver;
	 @Test
	 public void openBrowser() {
	 System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
//	 driver.get("https://opensource-demo.orangehrmlive.com/");
	// driver.get("https://www.google.com/search?q=google+chrome&oq=google+chrome&aqs=chrome..69i57j69i64.12824j0j7&sourceid=chrome&ie=UTF-8");
	 driver.get("http://demo.guru99.com/selenium/deprecated.html");
     driver.switchTo().frame("classFrame");
     driver.findElement(By.linkText("Deprecated")).click();
//     driver.ExecuteScript("window.open('https://www.google.com','_blank');");
//     driver.close(); 
     driver.navigate().to("https://www.youtube.com/");
     driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/R7z2wh1lO_c/hqdefault.jpg?sqp=-oaymwEYCNIBEHZIVfKriqkDCwgBFQAAiEIYAXAB&rs=AOn4CLB6koQ9OuarAzF2UfI517eKvOLzlw' and @class=\"style-scope yt-img-shadow\" ]")).click();
	 }

	 
}
