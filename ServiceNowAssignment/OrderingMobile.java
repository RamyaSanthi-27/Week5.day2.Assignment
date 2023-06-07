package week5.day2.ServiceNowAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class OrderingMobile {
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
		//Using Shadow Root
				Shadow shadow=new Shadow(driver);
				shadow.setImplicitWait(10);
				shadow.findElementByXPath("//div[contains(@class,'sn-polaris-navigation polaris-header-menu')]/div[text()='All']").click();
		//Click-AllEnter Service catalog in filter navigator and press enter 
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Service catalog");
		shadow.findElementByXPath("//mark[text()='Service Catalog']").click();
		shadow.findElementByXPath("(//div[@class=' drag_section_part glide-grid-block']//following::td[@class='homepage_category_only_description_cell'])[8]").click();      
			

	}

}
/*Assignment 1:Ordering mobile
"1. Launch ServiceNow application
2. Login with valid credentials username as admin and password as India@123
3. Click-AllEnter Service catalog in filter navigator and press enter 
4. Click on  mobiles
5.Select Apple iphone6s
6.Update color field to rose gold and storage field to 128GB
7.Select  Order now option
8.Verify order is placed and copy the request number"*/