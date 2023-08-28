package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LeafGroundDropDown {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		

WebElement tools= driver.findElement(By.className("ui-selectonemenu"));
Select drop1=new Select(tools);
drop1.selectByVisibleText("Selenium");
	    
	  driver.findElement(By.xpath("//label[text()='Select Country']")).click();
	  driver.findElement(By.xpath("//li[text()='Brazil']")).click();
	  
	  driver.findElement(By.xpath("//label[text()='Select City']")).click();
	  
	 driver.findElement(By.xpath("//li[text()='Rio de Janerio']")).click();
	 //driver.findElement(By.className("ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only")).click();
	 
	 driver.findElement(By.xpath("//label[text()='Select Language']")).click();
	 driver.findElement(By.xpath("//li[text()='English']")).click();
	}

}
