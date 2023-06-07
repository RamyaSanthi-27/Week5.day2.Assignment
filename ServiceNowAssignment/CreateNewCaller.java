package week5.day2.ServiceNowAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class CreateNewCaller {
	public static ChromeDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//1. Launch ServiceNow application
		driver.get("https://dev82316.service-now.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//2. Login with valid credentials (refer the document to create the instance)
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Sanghamitra@07");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		//3. Enter Incident in filter navigator and press enter"
		//Using Shadow Root
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//div[contains(@class,'sn-polaris-navigation polaris-header-menu')]/div[text()='All']").click();

	}

}
/*Assignment 3:Create New Caller
"1. Launch ServiceNow application
2. Login with valid credential
3. Click-All and Enter Callers in filter navigator and press enter 
4. Create new Caller by filling all the fields and click 'Submit'.
5. Search and verify the newly created Caller"
*/