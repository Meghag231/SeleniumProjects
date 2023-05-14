package com.section1;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class p2mouse
{
	public static void main(String[]args)
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			    driver.get("https://www.flipkart.com/");
			    driver.findElement(By.xpath("//button[text()='✕']")).click();
			    WebElement web = driver.findElement(By.xpath("//img[@alt='Electronics']"));
			    Actions s = new Actions(driver);
			    s.moveToElement(web).perform();
			    
			    
	}

}
