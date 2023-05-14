package com.section1;


import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class p2acticalender
{
	private static Object month;
	private static Object year;

	public static void main(String [] args)
	{
		
        ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Calendar cal=Calendar.getInstance();
		Calendar month= Calendar.getInstance();
		
		Date currentdateDate=cal.getTime();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    driver.findElement(By.id("ext-gen10")).click();
	    String CurrentMonth = driver.findElement(By.className("x-btn-text")).getText();
	     String CurrentYear = driver.findElement(By.className("x-btn-text")).getText();
	    
		
		While(!(CurrentMonth.equals(month)&&CurrentYear.equals(year))) 
	   {
		   driver.findElement(By.id("ext-gen48")).click();
		   String CurrentMonth1 = driver.findElement(By.className("x-btn-text")).getText();
		   String CurrentYear1 = driver.findElement(By.className("x-btn-text")).getText();
		   
	   }
	 }

	private static calendar getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
