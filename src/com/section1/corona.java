package com.section1;
import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;

public class corona
{
EdgeDriver driver;
public static void main(String[] args) throws InterruptedException
{
	corona c=new corona();
	c.launchBrowser();
	System.out.println(c.getCoronaCase());
	System.out.println(c.getDeathCase());
	System.out.println(c.getRecoveredCase());
	
	
}

public void launchBrowser() throws InterruptedException
{
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\Selenium\\chromedriver.exe");
	driver=new EdgeDriver();
	driver.get("https://www.worldometers.info/coronavirus/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
}
public String getCoronaCase()
{
	String res =driver.findElement(By.xpath("//h1[text()='Coronavirus Cases:']/../div/span")).getText();
	return res;
}

public String getDeathCase()
{
	String res1 =driver.findElement(By.xpath("//h1[text()='Deaths:']/../div/span")).getText();
	return res1;
}

public String getRecoveredCase()
{
	String res2 =driver.findElement(By.xpath("//h1[text()='Recovered:']/../div/span")).getText();
	return res2;
}
}

