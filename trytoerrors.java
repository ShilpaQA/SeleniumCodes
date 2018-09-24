package com.shein.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class trytoerrors {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://us.shein.com/");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Register/Sign In']")).click();
		
		driver.findElement(By.xpath("//span[@id='register']")).click();
		driver.findElement(By.xpath("//input[@id='sign-up-email']")).sendKeys("abc");
		String texterr = driver.findElement(By.xpath("//p[text()='The email you entered is invalid. Please check your email and try again.'")).getText();
		System.out.println("Error messsage "+texterr);	
		
		
	}

}
