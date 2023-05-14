package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath 
{
	public static void main(String[]aargs)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sudha/Desktop/Registration.html");
		driver.findElement(By.xpath("//input[1]")).sendKeys("Megha");
		driver.findElement(By.xpath("//input[2]")).sendKeys("Me");
		driver.findElement(By.xpath("//input[5]")).click();
		driver.findElement(By.xpath("//input[7]")).click();
		driver.findElement(By.xpath("//input[8]")).click();
		
		
	
		
	}
}
