import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A 
{
	WebDriver driver;
	
	public boolean findElement(By by) {
	    WebElement elem = driver.findElement(by);
	    // draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	        return true;
	    }
	    else
	    	return false;
	   
	}
	
	
	@Test
	public void m1() throws Throwable
	{
		driver=new FirefoxDriver();
		driver.get("http://www.adobe.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='globalnav__menu-bar']/ul/li[4]/button")).click();
		Thread.sleep(3000);
		String s2=driver.findElement(By.xpath(".//*[@id='adobeid_username']")).getAttribute("background-color");
		System.out.println("--------"+s2);
		//System.out.println(findElement(By.xpath(".//*[@id='adobeid_username']")));
		driver.findElement(By.xpath(".//*[@id='adobeid_username']")).sendKeys("matt@");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='adobeid_password']")).sendKeys("not");
		driver.findElement(By.xpath(".//*[@id='sign_in']")).click();
		Thread.sleep(3000);
		//System.out.println(findElement(By.xpath(".//*[@id='adobeid_username']")));
		String s3=driver.findElement(By.xpath(".//*[@id='adobeid_username']")).getCssValue("background-color");
		System.out.println("--------"+s3);
	WebElement error_user_Name=driver.findElement(By.xpath(".//*[@id='adobeid_signin']/fieldset[1]/span/label"));
	
System.out.println("Error message is : "+error_user_Name.getText()+" and font color of "+error_user_Name.getCssValue("color"));
	WebElement error_Password=driver.findElement(By.xpath(".//*[@id='adobeid_signin']/fieldset[2]/span/label"));
	
	
	System.out.println("Error message is : "+error_Password.getText() +" and font color of "+error_Password.getCssValue("color"));
	driver.findElement(By.xpath(".//*[@id='adobeid_username']")).sendKeys("matt@adobe");
	driver.findElement(By.xpath(".//*[@id='adobeid_password']")).sendKeys("notnotnot");
	System.out.println("Enter a valid user name is exists "+error_user_Name.isDisplayed());
	System.out.println("The password is too short is exists "+error_Password.isDisplayed());
	
		
		
	}
	
	
		
	

}
