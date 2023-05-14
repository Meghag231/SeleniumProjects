package projectname.genericcode;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class commonutility
{
	public int getRandomNum()
	{
		Random r = new Random();
		int num=r.nextInt(1000);
		return num;
	}
	public String getmsgfromalert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		String msg = alt.getText();
		return msg;
	}
	public void getclose(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
	public void getAccept(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
    public String sendkeys(WebDriver driver, String XYZ)
	{
		Alert alt = driver.switchTo().alert();
		alt.sendKeys(XYZ);
		return XYZ;
	}
	public String textToBePresentInElementLocated(WebDriver driver,By locator,String name)
	{
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.textToBePresentInElementLocated(locator,name));
	return name;
     
	}
	public int getSelectByIndex(WebElement dropdown,int value)
	{  
		Select s= new Select(dropdown);
		s.selectByIndex(4);
		return value;
		
	}
	public void getMovetoelement(WebDriver driver,String id)
	{
		
	    WebElement web = driver.findElement(By.id(id));
		 Actions s = new Actions(driver);
		 s.moveToElement(web).perform();
	
	}
}





