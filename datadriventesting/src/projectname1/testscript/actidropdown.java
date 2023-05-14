package projectname1.testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import projectname.genericcode.Baseclass;
public class actidropdown extends Baseclass
{
	@Test
	public void drop()
	{
	        driver.findElement(By.xpath("//div[@class='menuTable']//div[@class='popup_menu_button popup_menu_button_settings ']")).click();
			driver.findElement(By.id("popup_menu_item_6")).click();
			WebElement dropdown=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
	        driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
	        cu.getSelectByIndex(dropdown,4);
	        cu.getMovetoelement(driver,"container_users");
	 }
}



