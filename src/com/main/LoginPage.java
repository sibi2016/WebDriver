package com.main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LoginPage {
	
	public static void performLogin()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		//WebElement element = driver.findElement(By.(id));
		//element.click();
	}
	public static void main(String[] args) {
		performLogin();
	}
}
