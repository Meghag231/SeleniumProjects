package com.section1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class p2alert 
{
	public static void main(String[]args)
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#keepLoggedInCheckBoxContainer")).click();
		driver.findElement(By.cssSelector("[class=\'initial\']")).click();
		
		// settings
		driver.findElement(By.xpath("//div[@class='menuTable']//div[@class='popup_menu_button popup_menu_button_settings ']")).click();
		
		
		//click types of work
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		
		//click on create type of work
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		//driver.findElement(By.cssSelector("#name")).click();
		driver.findElement(By.cssSelector("#name")).sendKeys("Megha");
		driver.findElement(By.xpath("//input[@onclick='handleCancel();']")).click();
		Alert alt=driver.switchTo().alert();
	
		//GetAlert msg
		System.out.println(alt.getText());
		alt.dismiss();
		
		}
		
		}



