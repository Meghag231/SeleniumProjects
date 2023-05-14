package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class yatra {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sudha\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.yatra.com/");
		Driver.manage().window().fullscreen();
		
		
	}

}
