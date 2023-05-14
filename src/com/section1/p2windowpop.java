package com.section1;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class p2windowpop

{
	public static void main(String[]args)
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	    driver.findElement(By.name("q")).sendKeys("iphoneEx");
	    driver.findElement(By.cssSelector("[type='submit']")).click();
	    driver.findElement(By.xpath("//div[text()='APPLE iPhone XS (Space Grey, 512 GB)']")).click();
	    String mainid = driver.getWindowHandle();
	    Set< String> allid = driver.getWindowHandles();
	    
		for(String id:allid)
			
		{
			if(!(id.equals(mainid)))
			{
				driver.switchTo().window(id);
				
			}
			
		}
		System.out.println(driver.getTitle());
		
		     
		}

}

