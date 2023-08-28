package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Mugesh");
		driver.findElement(By.name("lastname")).sendKeys("GS");
		driver.findElement(By.name("reg_email__")).sendKeys("123456");
		driver.findElement(By.id("password_step_input")).sendKeys("Testleaf");
		
		
		WebElement tools=driver.findElement(By.name("birthday_day"));
		
		Select date=new Select(tools);
		
		date.selectByVisibleText("3");
		
		
	WebElement tools1=driver.findElement(By.name("birthday_month"));
		
		Select month=new Select(tools1);
		
		month.selectByVisibleText("Jan");
		
		
WebElement tools2=driver.findElement(By.name("birthday_year"));
		
		Select year=new Select(tools2);
		
		year.selectByVisibleText("1990");
		
		driver.findElement(By.className("_58mt")).click();

		
		
		
		
	}

}
