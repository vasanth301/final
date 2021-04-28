package org.test.red.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://m.redbus.in");
		String title=driver.getTitle();
		System.out.println(title);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		WebElement txtsrc=driver.findElement(By.id("src"));
		txtsrc.sendKeys("koyembedu,chennai");
		WebElement txtdest=driver.findElement(By.id("dest"));
		txtdest.sendKeys("Coimbatore Airport");
		WebElement searchbtn=driver.findElement(By.id("search_btn"));
		searchbtn.click();

	}

}
