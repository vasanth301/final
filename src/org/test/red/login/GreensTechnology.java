package org.test.red.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnology {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		String title=driver.getTitle();
		System.out.println("google");
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		WebElement txtq=driver.findElement(By.name("q"));
		txtq.sendKeys("Greens Technology");
	}

}
