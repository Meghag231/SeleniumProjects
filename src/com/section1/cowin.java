package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class cowin {
	
	public static void main(String[] args){   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sudha\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cowin.gov.in/");
		String title=driver.getTitle();
		System.out.println("title is:"+title);
		String url=driver.getCurrentUrl();
		System.out.println("url is:"+url);	
	}
}
