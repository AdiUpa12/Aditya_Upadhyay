package seleniumStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Crome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("30");
		driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("40");
		driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();
		
	}
}
