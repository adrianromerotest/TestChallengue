import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Cases extends CaseBase {
	
	MST_Functions test = new MST_Functions ();
	
	public Test_Cases ()	
	{

	}

	public void click_signinbutton() throws InterruptedException 
	{
		test.click_signinbutton(driver);
	}
	
	public void generate_email () throws InterruptedException
	{
		test.generate_email(driver);
	}
	
	public void fill_fields ()
	{
		test.fill_fields(driver);
	}
	
	public void validation()
	{
		test.validation_account(driver);
	}

	public void logout() throws InterruptedException
	{
		test.logout(driver);
	}

	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Test_Cases test = new Test_Cases();
			
		test.MST_Browser();
		test.click_signinbutton();
		test.generate_email();
		Thread.sleep(3000);
		test.fill_fields();
		Thread.sleep(3000);
		test.validation();
		Thread.sleep(2000);
		test.logout();
		test.closebrowser();
		
	}
}