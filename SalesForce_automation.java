package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce_automation {

	public static void main(String[] args) 
	{

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("kishore");
		driver.findElement(By.name("UserLastName")).sendKeys("J");
		driver.findElement(By.name("UserEmail")).sendKeys("kishore2862000@gmail.com");
		
		WebElement dropdown1 =driver.findElement(By.name("UserTitle"));
		Select drop1=new Select(dropdown1);
		drop1.selectByVisibleText("Developer / Software Engineer / Analyst");
		
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		
		WebElement dropdown2 =driver.findElement(By.name("CompanyEmployees"));
		Select drop2=new Select(dropdown2);
		drop2.selectByValue("9");
		
		driver.findElement(By.name("UserPhone")).sendKeys("9865548221");
		

		WebElement dropdown3 =driver.findElement(By.name("CompanyCountry"));
		Select drop3=new Select(dropdown3);
		drop3.selectByValue("CV");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		//driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]")).click();
		//driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div")).click();
		
	}

}
//