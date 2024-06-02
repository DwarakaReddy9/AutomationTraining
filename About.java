package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class About {
	@Test

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Browser Drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://saucelabs.com/");
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		String ActualTitle = driver.findElement(By.className("app_logo")).getText();
		if(ActualTitle.equals("Swag Labs")){
			System.out.println("Login Is Successfull");
		}
		else {
			System.out.println("Log is Failed");
		}
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("about_sidebar_link")).click();
		
		//mousehover on products
		
		WebElement elementToHover = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));

        // Create an instance of Actions class
        Actions actions = new Actions(driver);

        // Perform hover over the element
        actions.moveToElement(elementToHover).perform();
        String Products = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span")).getText();
        //System.out.println(Products);
        if(Products.equals("Platform for Test")){
			System.out.println("Products are displayed");
		}
		else {
			System.out.println("Products are not displayed");
		}
        //click Platform for Test
        driver.findElement(By.xpath("//a[@href=\"/products\"]/div[1]/div[1]/div[1]/div[2]/span")).click();
        //driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a/div[1]/div[1]/div[1]/div[2]/span")).click();
        //click Sauce Cross Browser Testing       
        //driver.findElement(By.xpath("//a[@href=\"/products/cross-browser-testing\"]/div[1]/div[1]/div[1]/div[2]/span")).click();        
        
        
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //mousehover on solutions
//        WebElement solutionsToHover = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]"));
//
//        // Create an instance of Actions class
//        Actions solutionaction = new Actions(driver);
//
//        // Perform hover over the element
//        solutionaction.moveToElement(solutionsToHover).perform();
//        String Solutions= driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/span")).getText();
//        if(Solutions.equals("Solutions for")){
//			System.out.println("Solutions is working");
//		}
//		else {
//			System.out.println("Solutions is working");
//		}
//        
        
        
        
        
        
        
        
        //driver.close();
	}

}
