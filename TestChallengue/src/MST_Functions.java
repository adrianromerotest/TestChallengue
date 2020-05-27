import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import junit.framework.Assert;

public class MST_Functions {
	

	
	public  void click_signinbutton(WebDriver driver) throws InterruptedException
	{
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		String expected_myaccountURL ="http://automationpractice.com/index.php?controller=authentication&back=my-account";
		Thread.sleep(2000);
		String actualURL = driver.getCurrentUrl();
		
		if (actualURL.equalsIgnoreCase(expected_myaccountURL))
		{
				System.out.println("We are in the my account page");
		}
			else
			{
				System.out.println("The current url is not equals than expected url, the redirection to the my account page is not working");
		}
	}
	
	public void generate_email (WebDriver driver) throws InterruptedException
	{
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
		String email = "test_email" + randomInt + "@gmail.com";
		System.out.println("This is your email:"+ "test_email" + randomInt + "@gmail.com");
		driver.findElement(By.id("email_create")).sendKeys(email);
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(2000);
		String expected_createaccountURL ="http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
		Thread.sleep(2000);
		String actualURL = driver.getCurrentUrl();
		
		if (actualURL.equalsIgnoreCase(expected_createaccountURL))
		{
				System.out.println("We are in the create an account page");
		}
			else
			{
				System.out.println("The current url is not equals than expected url, the redirection to create an account is not working");
		}
	}
	
	public void fill_fields (WebDriver driver)
	{
		
		
		//username
		Random randomGenerator = new Random();  
		driver.findElement(By.id("customer_firstname")).sendKeys("username");
		
		//lastname 
		driver.findElement(By.id("customer_lastname")).sendKeys("lastname");
		
		//Password
		int random_password = randomGenerator.nextInt(1000);  
		String password = "P@ss" + random_password;
		System.out.println(password);
		driver.findElement(By.id("passwd")).sendKeys(password);
		
		//Address - Address section
		int random_address = randomGenerator.nextInt(1000);  
		String address = "Canyon Stress " + "#"+random_address;
		System.out.println(address);
		driver.findElement(By.id("address1")).sendKeys(address);
		
		//City - Address section
		driver.findElement(By.id("city")).sendKeys("Dallas");
		
		//State
		Select states = new Select(driver.findElement(By.id("id_state")));
		states.selectByValue("3");
		
		//Zipcode 
		driver.findElement(By.id("postcode")).sendKeys("75001");
		
		//Country
		Select country = new Select(driver.findElement(By.id("id_country")));
		states.selectByValue("21");
		
		//Mobile Number
		Random rnd = new Random();
		int random_mobile = rnd.nextInt(99999);
		String phone = "79250" +random_mobile;
		System.out.println(phone);
		driver.findElement(By.id("phone_mobile")).sendKeys(phone);
		
		//Future Reference
		driver.findElement(By.id("alias")).sendKeys("Test Reference");
		
		//Click on Register
		driver.findElement(By.id("submitAccount")).click();
		
}
	
	public void validation_account (WebDriver driver)
	{
		//Validate Text
				boolean object_displayed= driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).isDisplayed();
				
					
					if (object_displayed = true)
					{
							System.out.println("Your account is created sucessfully");
					}
						else
						{
							System.out.println("Is not possible to create your account");
					}
	}



	public  void logout(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
		Thread.sleep(3000);
		
		String expectedURL ="http://automationpractice.com/index.php?controller=authentication&back=my-account";
		String actualURL = driver.getCurrentUrl();
		
		if (actualURL.equalsIgnoreCase(expectedURL))
		{
				System.out.println("Logout Sucessfully");
		}
			else
			{
				System.out.println("Logout Failed");
		}
	
	}
	
		
	}

