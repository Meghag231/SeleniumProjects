package com;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class genericproporties{
	

public String getgeneric(String url,String useraname,String password, String String) throws IOException
{
	FileInputStream fis= new FileInputStream("C:\\Users\\Sudha\\Desktop\\propertiesactifile.txt");
	Properties pdoj = new Properties();
	pdoj.load(fis);
	String url1=pdoj.getProperty("C:\\Users\\Sudha\\Desktop\\propertiesactifile.txt");
	System.out.println(url1);
	String username = pdoj.getProperty("username");
	System.out.println(username);
	String password1 = pdoj.getProperty("password");
	System.out.println(password1);
	return String; 
}
   public String launchbrowser()
    {
       ChromeOptions co=new ChromeOptions();
       co.addArguments("--remote-allow-origins=*");
       WebDriver driver=new ChromeDriver(co);
       driver.manage().window().maximize();
      
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get(url);
       driver.findElement(By.id("username")).sendKeys(username);
       driver.findElement(By.id("password")).sendKeys(password);
       driver.findElement(By.id("loginButton")).click();
}
public static void main(String[]args)
{
	genericproporties p=new genericproporties();
	p.launchbrowser();
	p.getgeneric(url,admin,manager);
	

}
}

