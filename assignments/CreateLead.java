package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Zoho Corporation");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mugesh");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("GS");
		

		
		WebElement tools = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop1=new Select(tools);
		drop1.selectByVisibleText("Employee");
		

		
		WebElement tools1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop2=new Select(tools1);
		drop2.selectByValue("9001");
		
		
				
		WebElement tools2=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop3=new Select(tools2);
		drop3.selectByIndex(4);
		
		WebElement tools3=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drop4=new Select(tools3);
		drop4.selectByVisibleText("India");
		
		
		

		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title= driver.findElement(By.partialLinkText("My Home")).getText();
		System.out.println(title);
		
		 
	}

}
