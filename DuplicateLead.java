package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
		driver.findElement(By.className("decorativeSubmit")).click();	
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.partialLinkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Microsoft");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Satya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nadella");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sathya");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description for Automation Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("automationtesting@gmail.com");
		
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.partialLinkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Microsoft Corp");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sathya");
		
		driver.findElement(By.className("smallSubmit")).click();

		String title1=driver.getTitle();
		System.out.println(title1);



		
		
		
		

	}

}
