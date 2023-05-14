package com.section1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class p2se
{
	public static void main(String[]args)
	{
	 
	     WebDriver driver = new EdgeDriver();
		 driver.get("https://www.google.co.in/");
		 driver.manage().window().maximize();
		 driver.findElement(By.name("q")).sendKeys("Selenium");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 List<WebElement> listOfElements=driver.findElements(By.xpath(".//*[@role='listbox']/li"));
		 for(WebElement webElement : listOfElements)
		 {
			 if(webElement.getText().trim().equals("selenium webdriver"))
			 {
				 webElement.click();
				 break;
				 
			 }
		 }
		 WebElement result=driver.findElement(By.id("result-stats"));
		 System.out.println(result.getText());
	}
}

		
//b[text()='m webdriver']"