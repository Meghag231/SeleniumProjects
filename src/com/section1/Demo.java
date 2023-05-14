package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sudha\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}

}
