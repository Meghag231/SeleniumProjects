package com.section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebey 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sudha\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		String title=driver.getTitle();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(200,300));
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(200,400));
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		driver.close();
	}
}
		
		
		
	


