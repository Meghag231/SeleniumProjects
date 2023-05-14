
package projectname1.testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import projectname.genericcode.Baseclass;
@Listeners(projectname.genericcode.listenerImplementation.class)
public class createcustomer extends Baseclass {

    @Test
    @Parameters({"customername"})
    public void customercreation(String customername) throws IOException {
        int num = cu.getRandomNum();
        customername = customername + num;

        driver.findElement(By.id("container_tasks")).click();
        driver.findElement(By.xpath("//div[@class='addNewButton']")).click();

        // Assuming the following lines are correctly implemented
        driver.findElement(By.xpath("//div[@class='dropdownContainer addNewMenu']/div[1]")).click();
        driver.findElement(By.cssSelector("[class='inputFieldWithPlaceholder newNameField inputNameField']"))
                .sendKeys(customername);
        driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']"))
                .sendKeys(customername);

        driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
        // Assuming the following line is correctly implemented
        cu.textToBePresentInElementLocated(driver, By.cssSelector(".titleEditButtonContainer"), customername);

        String expCustomername = driver.findElement(By.cssSelector(".titleEditButtonContainer")).getText();
        System.out.println(expCustomername);

        // Assuming the following line is intentional recursion or meant for further test steps
        customercreation(customername);
    }
}

