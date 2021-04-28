package org.test.red.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	String title=driver.getTitle();
	System.out.println(title);
	String  currenturl=driver.getCurrentUrl();
	System.out.println(currenturl);
	WebElement name=driver.findElement(By.name("username"));
	name.sendKeys("vasanth.30");
	WebElement txtpass=driver.findElement(By.id("password"));
	txtpass.sendKeys("sdghgds");
	WebElement btnlogin=driver.findElement(By.id("login"));
	btnlogin.click();
	
	}

}
