package week5.day2.LeadTapsAssignment;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day1.ProjectSpecificMethod;
public class EditLead extends ProjectSpecificMethod {
	@Test(dataProvider="testData")
	public void testEditLead(String pnum, String cname) throws InterruptedException {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pnum);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.name("submitButton")).click();
		//driver.close();
}
	
	 @DataProvider
     public String[][] testData() {
     	String[][] data=new String[2][2];
     	//1st set of date
     	data[0][0]="99";
     	data[0][1]="TCS";
     	
     	
     	//2st set of date
     	data[1][0]="66";
     	data[1][1]="CTS";
     	
     	
     	return data;
	
}

}




