package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	public static void performLogin()
	{
		//Opening the browser
		try {
			WebDriver driver = new FirefoxDriver();
			Thread.sleep(2000);
			//get the talent screen website
			driver.get("https://dev.talentscreen.io/#/website-pages/home");
			//click on longin button
			WebElement element = driver.findElement(By.xpath(".//*[@id='main-nav']/div/a[1]"));
			System.out.println(element.getLocation());
			System.out.println(element.isDisplayed());
			System.out.println(element.getTagName());
			System.out.println("Attribute "+ element.getAttribute("class"));
			System.out.println(element.getSize());
			
			//element.click();
			//Click on subject
			//WebElement elementSubject = driver.findElement(By.xpath(".//*[@id='main-nav']/ul/li[1]/a"));
			//elementSubject.click();
			//List <WebElement> elements = driver.findElements(By.xpath(".//*[@id='main-nav']/ul/li"));
			//System.out.println(elements.size());
			//System.out.println("url is"+driver.getCurrentUrl());
			//System.out.println("title is"+driver.getTitle());
			
			driver.close();
						
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigateSample()
	{
		try{
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(1000);
		driver.get("https://dev.talentscreen.io/#/website-pages/home");
		WebElement element = driver.findElement(By.xpath(".//*[@id='main-nav']/ul/li[1]/a"));
		element.click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void waitEx()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://dev.talentscreen.io/#/website-pages/home");
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='main-nav']/ul/li[1]/a")));
		
		//Fluent Wait
		/*FluentWait w = new FluentWait(driver)
				.withTimeout(100, TimeUnit.SECONDS)
				.pollingEvery(10, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);*/
		//WebElement element = driver.findElement(By.xpath(".//*[@id='main-nav']/ul/li[1]/a"));
		element.click();
	}
	
	public static void main(String[] args)
	{
		//LoginPage.performLogin();
		LoginPage.navigateSample();
		//LoginPage.waitEx();
	}
}