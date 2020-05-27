import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public abstract class CaseBase {
	
	WebDriver driver;
	
	public void MST_Browser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Temporal\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		String expectedURL ="http://automationpractice.com/index.php";
		
		String actualURL = driver.getCurrentUrl();
		
		if (actualURL.equalsIgnoreCase(expectedURL))
		{
				System.out.println("We are in the home page");
		}
			else
			{
				System.out.println("The current url is not equals than expected url");
		}
	}
	
	
	public void closebrowser()
	{
		driver.close();
	}
	

}