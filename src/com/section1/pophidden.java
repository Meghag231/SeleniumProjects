package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class pophidden {
	EdgeDriver driver;
	public static void main(String[]args) throws InterruptedException
	{
		
		GenericActi g=new GenericActi();
		g.launchEdge();
		g.loginAction();
		g.taskAction();
		g.CheckAction();
		
		
	}

		public void launchEdge()
		{
			driver=new EdgeDriver();
			
			driver.manage().window().maximize();
	    }
		public void loginAction()
		{
			driver.get("https://demo.actitime.com/login.do");
			 driver.findElement(By.id("username")).sendKeys("admin");
			 driver.findElement(By.name("pwd")).sendKeys("manager");
			 driver.findElement(By.id("keepLoggedInCheckBox")).click();
			 driver.findElement(By.id("loginButton")).click();
			
		}
	public void taskAction()throws InterruptedException 
	{
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(2000);
		
    }
	public void CheckAction()
	{
		//driver.findElement(By.className("headerRowTable")).click();
		driver.findElement(By.xpath("//table[contains(@class,'headerRowTable')]")).click();
		
	}
}



