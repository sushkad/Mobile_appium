package com.finacus.MavenProject;

import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sec2pay {
	
	public static WebDriver d;
	
	@BeforeSuite	
	public void Setup() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","E://Finacus Mobile Application Testing//chromedriver_win32//chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://192.168.4.138/Sec2Pay/Login");
		//d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		String Actual=d.getTitle();
		String Expected= "Login-Finacus.Sec2Pay";
		
					if(Actual.equals(Expected))
					{
					System.out.println("Valid Url");
					}
					else
					{
					System.out.println("Invalid Url");
		}
	
	}
	//@Test(enabled=true) 
	//public void VerifyContent() throws InterruptedException
	//{
		
	/*	
		try
		{
		d.get("http://192.168.4.138/Sec2Pay/Login");
		Thread.sleep(5000);
		System.out.println("Content");
		d.findElement(By.xpath("//a[@class='nav-link'][contains(text(),'About Us')]")).click();
		Thread.sleep(5000);
		System.out.println("Click on About us");
		d.findElement(By.xpath("/html/body/form/div[4]/nav/div/div/ul/li[2]/a")).click();
		Thread.sleep(5000);
		System.out.println("Click on Services");
		d.findElement(By.xpath("//a[@class='nav-link'][contains(text(),'Join Our Network')]")).click();
		Thread.sleep(5000);
		System.out.println("Click on Join Our Network");
		d.findElement(By.xpath("//a[@class='nav-link'][contains(text(),'Contact')]")).click();
		Thread.sleep(5000);
		System.out.println("Click on Contact");
		d.findElement(By.xpath("//a[contains(text(),'Log In')]")).click();
		Thread.sleep(5000);
		System.out.println("Click on Log In");
	}
		catch(NullPointerException e) 
        { 
            System.out.print("Caught NullPointerException"); 
        } */
	
							@Test(enabled=true) 
							public void TestCase1() throws InterruptedException
							{
								d.get("http://192.168.4.138/Sec2Pay/Login");
								System.out.println("Login URL");
								
									d.findElement(By.id("LoginPanel0_Username")).sendKeys("9137788062");
									d.findElement(By.id("LoginPanel0_Password")).sendKeys("Pass@123");
									d.findElement(By.id("LoginButton")).click();
									Thread.sleep(3000);
									System.out.println("Login");
							}
							
										@AfterSuite
										public void CloseApp()
										{
											d.quit();
											System.out.println("Application Close");		
											}
}