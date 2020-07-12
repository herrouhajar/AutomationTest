package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest1 {
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		System.out.println("Setting the browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\Katalon_Studio_Windows_64-7.3.1\\Katalon_Studio_Windows_64-7.3.1\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void getResult() {
		System.out.println("go to chrome");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		System.out.println("Search for All4Test");
		driver.findElement(By.name("q")).sendKeys("All4Test");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		System.out.println("Waiting 5 secondes");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(By.xpath("//span[text()='All4Test - La qualité de vos logiciels - Expert du test logiciel']")).click();
	    
	}
	
	@AfterTest
	public void closePage() {
		System.out.println("Closing Browser");
		driver.close();
	}
	

}
