
package com.section1;

import java.time.Duration;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class p2drop 
{
	

	public static void main(String[]args)
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// get the url
				driver.get("http://demo.actitime.com/login.do");
				
				// login
				driver.findElement(By.id("username")).sendKeys("admin");
				driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);
				
				// settings
				driver.findElement(By.xpath("//div[@class='menuTable']//div[@class='popup_menu_button popup_menu_button_settings ']")).click();
				driver.findElement(By.id("popup_menu_item_6")).click();
				//select
				WebElement w = driver.findElement(By.name("userGroupNamingCode"));		
				Select s = new Select(w);
				List<WebElement> sugg = s.getOptions();
				
				ArrayList a=new ArrayList();
				Collections.sort(a);
				for(WebElement select:sugg)
				{
					System.out.println(select.getText());
					
					
				}
				
				
			//System.out.println(a);
				
				
	}
}


