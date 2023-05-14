package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime 
{
	public static void main(String[]args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#keepLoggedInCheckBoxContainer")).click();
		driver.findElement(By.cssSelector("[class=\'initial\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".content.tasks")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
	}
}

		
	