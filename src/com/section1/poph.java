package com.section1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class poph 
{
	public static void main(String [] args)
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Sudha\\Desktop\\selenium\\chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#keepLoggedInCheckBoxContainer")).click();
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("container_tasks")).click();
		
		
		driver.findElement(By.xpath("//table[@class='headerRowTable']//div[@class='img']")).click();
		driver.findElement(By.className("delete")).click();
		String web = driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]")).getText();
		
		System.out.println(web);
		
		
		
		
				
		
	}

}
