package projectname1.testscript;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class flipkart 
{
    
    @Test(dataProvider="datasupplier")
	public void filpkartlogin(String all)
	{
		 ChromeOptions co=new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
         WebDriver driver=new ChromeDriver(co);
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement( By.xpath("//input[@type='text']")).sendKeys(all);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		String str=driver.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
		System.out.println(str);
		driver.close();
		
	}
       @DataProvider
       public Object[][] datasupplier()
     {
    	Object[][] objarr=new Object[4][1];
    	objarr[0][0]="mobiles";
    	objarr[1][0]="Tv";
    	objarr[2][0]="camera";
    	objarr[3][0]="Furniture";
    	return objarr;
     }
} 