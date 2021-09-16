package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("firstNameField")).sendKeys("kishore");
		driver.findElement(By.id("lastNameField")).sendKeys("J");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Krish");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("J");
		driver.findElement(By.id("createContactForm_personalTitle")).sendKeys("MR");
		
		driver.findElement(By.id("createContactForm_birthDate")).sendKeys("06/28/00");
		driver.findElement(By.id("createContactForm_generalProfTitle")).sendKeys("welcome");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		WebElement dropdown1=driver.findElement(By.name("preferredCurrencyUomId"));
		Select drop1=new Select(dropdown1);
		drop1.selectByVisibleText("INR - Indian Rupee");
		
		driver.findElement(By.name("description")).sendKeys("good");
		
		driver.findElement(By.name("importantNote")).sendKeys("nothing");
		
		driver.findElement(By.id("createContactForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createContactForm_primaryPhoneCountryCode")).sendKeys("15");
		driver.findElement(By.id("createContactForm_primaryPhoneAreaCode")).sendKeys("25");
		driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("9865548221");
		driver.findElement(By.id("createContactForm_primaryPhoneExtension")).sendKeys("+91");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kishore2862000@gmail.com");
		driver.findElement(By.id("createContactForm_primaryPhoneAskForName")).sendKeys("me");
		
		
		driver.findElement(By.id("createContactForm_generalAddress1")).sendKeys("me");

		driver.findElement(By.id("createContactForm_generalAddress2")).sendKeys("me");

		driver.findElement(By.id("createContactForm_generalCity")).sendKeys("me");
		
		driver.findElement(By.id("createContactForm_generalAttnName")).sendKeys("nil");
		driver.findElement(By.name("generalPostalCode")).sendKeys("601204");
		driver.findElement(By.id("createContactForm_generalPostalCodeExt")).sendKeys("65");
		
		WebElement dropdown2=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select drop2=new Select(dropdown2);
		drop2.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("hello welcome");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String str=driver.getTitle();
		System.out.println(str);
		driver.close();
	}

}