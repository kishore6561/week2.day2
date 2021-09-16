package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("kishore");
		driver.findElement(By.name("lastname")).sendKeys("jayakumar");
		driver.findElement(By.name("reg_email__")).sendKeys("kishore2862000@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("1234567890");
		WebElement dropdown1=driver.findElement(By.id("day"));
		Select drop1=new Select(dropdown1);
		drop1.selectByValue("28");
		
		WebElement dropdown2=driver.findElement(By.id("month"));
		Select drop2=new Select(dropdown2);
		drop2.selectByValue("6");

		WebElement dropdown3=driver.findElement(By.id("year"));
		Select drop3=new Select(dropdown3);
		drop3.selectByValue("2000");
		
		driver.findElement(By.name("sex")).click();
		
		System.out.println("facebook completed");
		
	}

}
//"" 