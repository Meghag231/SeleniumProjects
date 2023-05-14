package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class maximise
{
	public static void main(String[]args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sudha\\Desktop\\selenium\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.selenium.dev/");
    String sourcecode=driver.getPageSource();
    System.out.println(sourcecode);
  
	

}
}
