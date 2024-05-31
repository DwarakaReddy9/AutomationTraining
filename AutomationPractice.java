package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationPractice {
public WebDriver driver;
	
	@Test
	public void case1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Browser Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ultimateqa.com/automation/");
	}
	@Test
	public void case2() {
		driver.findElement(By.xpath("//ul/li/a[@href=\"../complicated-page\"]")).click();
	}
	@Test
	public void case3() {
		driver.findElement(By.xpath("//nav/ul/li[@id=\"menu-item-218392\"]")).click();
	}
 
	@Test
	public void case4() {	
		driver.findElement(By.xpath("//nav/ul/li[@id=\"menu-item-218104\"]")).click();
	}
	
	@Test
	public void case5() {	
		driver.findElement(By.xpath("//a[@href=\"/courses/coding-and-testing-an-authentication-api-nodejs-cypress\"]")).click();
	}
	
	@Test
	public void case6() {
		driver.findElement(By.xpath("//a[@href=\"/enroll/1194817?et=free\"]")).click();
	}
	
//	@Test
//	public void case7() {
//		driver.findElement(By.linkText("Education")).click();
//		driver.findElement(By.linkText("Free Courses")).click();
//	}

}
