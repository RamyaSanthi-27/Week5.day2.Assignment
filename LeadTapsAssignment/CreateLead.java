package week5.day2.LeadTapsAssignment;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import week5.day1.ProjectSpecificMethod;

public class CreateLead extends ProjectSpecificMethod {
@Test(dataProvider="testData")
	public  void testCreateLead(String cname,String fname,String lname,String pnum) {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pnum);
		driver.findElement(By.name("submitButton")).click();
		//driver.close();
		
}
  

        @DataProvider
        public String[][] testData() {
        	String[][] data=new String[2][4];
        	//1st set of date
        	data[0][0]="TestLeaf";
        	data[0][1]="Princila";
        	data[0][2]="Edward";
        	data[0][3]="8056";
        	
        	//2st set of date
        	data[1][0]="QEagle";
        	data[1][1]="Hari";
        	data[1][2]="R";
        	data[1][3]="99";
        	
        	return data;
        }
}






