package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

ChromeDriver driver=new ChromeDriver();

//1	Launch the browser
//2	Enter the username
//3	Enter the password
//4	Click Login
//5	Click crm/sfa link
//6	Click Leads link
//7	Click Find leads
//8	Click on Phone
//9	Enter phone number
//10	Click find leads button
//11	Capture lead ID of First Resulting lead
//12	Click First Resulting lead
//13	Click Delete
//14	Click Find leads
//15	Enter captured lead ID
//16	Click find leads button
//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
//18	Close the browser (Do not log out)
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("100");
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).click();
	//Error throws here - Delete button
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		
		driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Name')]")).click();
		
	
		
		String verify=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).getText();
		
		driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen246']")).sendKeys(verify);
		
		

		
		
		
		
	}

}
