package projectname1.testscript;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import projectname.genericcode.Baseclass;
public class Alertpopup extends Baseclass
{
	@Test
	public void handleAlert() throws IOException, InterruptedException 
	{
		driver.findElement(By.xpath("//div[@class='menuTable']//div[@class='popup_menu_button popup_menu_button_settings ']")).click();
	
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		driver.findElement(By.id("name")).sendKeys(du.getDatafromExcelSheet("Sheet1", 0, 0));
		driver.findElement(By.xpath("//input[@onclick='handleCancel();']")).click();
		String msg=cu.getmsgfromalert(driver);
		System.out.println(msg);
	}
		
}




