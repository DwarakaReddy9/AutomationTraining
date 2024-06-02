package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;




public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Browser Drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		String ActualTitle = driver.findElement(By.xpath("//a[@data-test=\"item-4-title-link\"]")).getText();
		//System.out.println(ActualTitle);
		String ExpectedTitle = "Sauce Labs Backpack";
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("The Title is Verified");
		}
		else
		{
			System.out.println("The Title is not Verified");
		}
		String ActualPrice = driver.findElement(By.xpath("//div[@class='inventory_item_price'][1]")).getText();
		String ExpectedPrice = "$29.99";
		if(ActualPrice.equals(ExpectedPrice))
		{
			System.out.println("The Price is Verified");
		}
		else
		{
			System.out.println("The Price is not Verified");
		}
		boolean AddToCart =! driver.findElements(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).isEmpty();
        if (AddToCart) {
            System.out.println("Add to cart button for Sauce Labs Backpack is present.");
        } else {
            System.out.println("Add to cart button for Sauce Labs Backpack is not present.");
        }
        driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        Thread.sleep(2000);
        boolean Remove =! driver.findElements(By.xpath("//button[@id=\"remove-sauce-labs-backpack\"]")).isEmpty();
        if (Remove) {
            System.out.println("Remove button for Sauce Labs Backpack is present.");
        } else {
            System.out.println("Remove button for Sauce Labs Backpack is not present.");
        }
        driver.findElement(By.xpath("//button[@id=\"remove-sauce-labs-backpack\"]")).click();
        
        driver.findElement(By.className("product_sort_container")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//option[@value=\"az\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("product_sort_container")).click();
        driver.findElement(By.xpath("//option[@value=\"za\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("product_sort_container")).click();
        driver.findElement(By.xpath("//option[@value=\"lohi\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("product_sort_container")).click();
        driver.findElement(By.xpath("//option[@value=\"hilo\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("react-burger-menu-btn")).click();
		String Title = driver.getTitle();
		System.out.println(Title);
        Thread.sleep(2000);
		driver.close();
	}
}

