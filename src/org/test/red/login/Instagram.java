package org.test.red.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
//		String title=driver.getTitle();
//		System.out.println(title);
//		String currenturl=driver.getCurrentUrl();
//		System.out.println(currenturl);
		Thread.sleep(3000);
		WebElement txtname=driver.findElement(By.xpath("//input[@name='username']"));
		txtname.sendKeys("vasanthramesh30@gmail.com");
		WebElement txtpass=driver.findElement(By.name("password"));
		txtpass.sendKeys("vasanth30");
		
		
	}
	

}
