package projectname.genericcode;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class listenerImplementation implements ITestListener
{
  @Override
  public void onTestFailure(ITestResult result)
    {
	// to get the failed testcase name
	String tcName=result.getName();
    }
    //Takescreen shot
     TakesScreenshot ts = (TakesScreenshot)Baseclass.Listenerdriver;
     File src = ts.getScreenshotAs(OutputType.FILE);
	 File trg = new File("./screen/page.png");
	 {
	   try 
		{
			FileUtils.copyFile(src, trg);
		}
		catch(IOException e)
		{
			
		}
	 }
}
	

		
		




	
		