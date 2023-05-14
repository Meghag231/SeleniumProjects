package com.section1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class p2Actitime
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		   co.addArguments("--remote-allow-origins=*");
		   WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  Actions act=new Actions(driver);
		  
		  driver.findElement(By.name("username")).sendKeys("admin");
			 driver.findElement(By.name("pwd")).sendKeys("manager");
			 driver.findElement(By.xpath("//label[text()='Keep me logged in']")).click();
			 driver.findElement(By.xpath("//div[text()='Login ']")).click();
			 driver.findElement(By.xpath("//div[@class='menuTable']//div[@class='popup_menu_button popup_menu_button_settings ']")).click();
		     driver.findElement(By.cssSelector(".popup_menu_button.popup_menu_button_settings.popup_menu_button_pressed")).click();
	         driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']")).click();
	         WebElement SettingDropdown=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
	         driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
	         
	         //printing all options 
	        WebElement stop= driver.findElement(By.id("currencySignFieldPredefined"));
	         Select s =new Select(stop);
	        
	         List<WebElement> dp=s.getOptions();
	         for (WebElement d:dp)
	         {
	        	 System.out.println(d.getText());
	         }
	}

}