package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.partialLinkText("Create Account")).click();
		
	driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit or Credit Limited Account");	
	//driver.findElement(By.className("inputBox")).sendKeys("Selenium Automation Tester");
	
	driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Automation");
	driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Testleaf");
	
	//driver.findElement(By.xpath("(//input[contains(@class,'inputBox')]/parent :: td)[5]")).sendKeys("3000");
	
	WebElement tool=driver.findElement(By.name("industryEnumId"));
	Select drop1=new Select(tool);
	drop1.selectByVisibleText("Computer Software");
	
	WebElement tool1=driver.findElement(By.name("ownershipEnumId"));
	Select drop2= new Select(tool1);
	drop2.selectByVisibleText("S-Corporation");
	
	
	WebElement tool2=driver.findElement(By.id("dataSourceId"));
	Select drop3= new Select(tool2);
	drop3.selectByValue("LEAD_EMPLOYEE");
	
	WebElement tool3=driver.findElement(By.id("marketingCampaignId"));
	Select drop4=new Select(tool3);
	drop4.selectByIndex(6);
	
	WebElement tool4=driver.findElement(By.id("generalStateProvinceGeoId"));
	Select drop5=new Select(tool4);
	drop5.selectByValue("TX");
	
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	
	
	}

}
