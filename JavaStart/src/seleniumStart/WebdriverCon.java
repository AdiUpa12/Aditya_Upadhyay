package seleniumStart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverCon {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Crome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.google.com");
		String Title =driver.getTitle();
		System.out.println(Title);
		
		if(Title.equals("Google")) {
			System.out.println("Title is Correct");
		}else {
			System.out.println("Title is Incorrect");
		}
			System.out.println(driver.getCurrentUrl());
			driver.quit();
		}
	}


