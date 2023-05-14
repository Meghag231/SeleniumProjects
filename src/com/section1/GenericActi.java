package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GenericActi
{
	EdgeDriver driver;
	public static void main(String[]args) throws InterruptedException
	{
		String name="d";
		String description="ddd";
		GenericActi g=new GenericActi();
		g.launchEdge();
		g.loginAction();
		g.taskAction();
		String result = g.createAccount(name,description);
		System.out.println(result);
		g.exit();
		
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
	public void taskAction( )throws InterruptedException {
		Thread.sleep(2000);
		 Thread.sleep(2000);
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
		driver.findElement(By.cssSelector(".item.createNewVustomer")).click();
	}
	public String createAccount(String name,String description)throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".inputFindWithPlaceholder.newNameField.inputNameField")).sendKeys(name);
		driver.findElement(By.cssSelector("[placeholder='Enter customer Description']")).sendKeys(description);
		driver.findElement(By.xpath("//div[text()='create Customer']")).click();
		Thread.sleep(2000);
		String result=driver.findElement(By.cssSelector(".titleEditButtonContainer")).getText();
		return result;
	}
	public void exit() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}

	public void CheckAction() {
		// TODO Auto-generated method stub
		
	}
	
}
		
			 
			 
				