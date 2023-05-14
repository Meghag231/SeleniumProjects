package projectname.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Timetrack
{
	public Timetrack(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath="//div[@class='menuTable']//div[@class='popup_menu_button popup_menu_button_settings ']")
		private WebElement settings;
		
		@FindBy(id="popup_menu_item_6")
		private WebElement generalsettings;
		public WebElement getsettings()
		{
			return settings;
					
		}
		public WebElement getgeneralsettings()
		{
			return settings;
					
		}
		public void clickSettings()
		{
			getsettings().click();
		}
		public void clickgeneralettings()
		{
			getgeneralsettings().click();
		}
		
			
		
		
	}


