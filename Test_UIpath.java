package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_UIpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.name("remember")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();
		
	}

}
//*[@id="bs-example-navbar-collapse-1"]/ul/li[3]/a
