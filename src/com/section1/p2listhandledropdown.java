package com.section1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class p2listhandledropdown
{
	public static void main(String []args)
	{
		System.setProperty("webdriver.Edge.driver","C:\\Users\\Sudha\\Desktop\\selenium\\Edgedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		//driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#keepLoggedInCheckBoxContainer")).click();
		driver.findElement(By.cssSelector("[class=\'initial\']")).click();
		//driver.findElement(By.xpath("//div[contains(@class,'button_settings')]")).click();
		driver.findElements(By.className("cpreventPanelsHiding"));
		driver.findElement(By.id("popup_menu_item_6")).click();
		
	}
	
}





