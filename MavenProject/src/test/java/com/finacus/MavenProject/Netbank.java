package com.finacus.MavenProject;


import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import java.util.Set;
import org.openqa.selenium.Alert;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
//import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class Netbank {


	//private static final WebElement INICIO = null;
	public static WebDriver d;
	String alt;
				
	public static int brokenLinks;
    public static int validLinks;
	
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		System.setProperty("webdriver.gecko.driver","E://Finacus Mobile Application Testing//chromedriver_win32//chromedriver.exe");
		WebDriver d = new ChromeDriver();
		//WebDriver d = new FirefoxDriver();
		
		d.get("http://192.168.4.59/AllBankNetBanking/Screens/Login.aspx");
		
		d.manage().window().maximize();
		
		Thread.sleep(3000);
		String Actual=d.getTitle();
		String Expected= "http://192.168.4.59/AllBankNetBanking/Screens/Login.aspx";
		
		if(Actual.equals(Expected))
				{
			System.out.println("Valid Url");
				}
		else
		{
			System.out.println("Invalid Url");
	
		}
		
		d.findElement(By.xpath("//input[@id='TXT_UsrNme']")).sendKeys("amc");	
		d.findElement(By.xpath("//input[@id='TXT_Passwd']")).sendKeys("fincore@123");
		
		System.out.println("Enter verification Code");
		
		Thread.sleep(40000);
	
		d.findElement(By.xpath("//input[@id='ImageButton1']")).click();
		Thread.sleep(40000);
		
		
		System.out.println("Admin Logged in Successfully");
		
		
		//d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		d.navigate().refresh();
		System.out.println("Home page gets Refresh");
		

		d.findElement(By.xpath("//span[contains(text(),'Home')]")).click();
		System.out.println("Home Page");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//span[@class='MenuInnerImage'][contains(text(),'Operative Accounts')]")).click();
		System.out.println("OPERATIVE ACCOUNTS");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//span[contains(text(),'Deposits Accounts')]")).click();
		System.out.println("DEPOSITS ACCOUNTS");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//span[contains(text(),'Loan Accounts')]")).click();
		System.out.println("LOAN ACCOUNTS");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//span[contains(text(),'Change Password')]")).click();
		System.out.println("CHNAGE PASSWORD");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//span[contains(text(),'Customer Services')]")).click();
		System.out.println("CUSTOMER SRVICES");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//span[contains(text(),'Rates and Charges')]")).click();
		System.out.println("RATES AND CHARGES");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//span[contains(text(),'Help')]")).click();
		System.out.println("HELP");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//span[contains(text(),'Home')]")).click();
		System.out.println("Home");
		Thread.sleep(2000);
		
		
		
		List<WebElement> links=d.findElements(By.tagName("a"));
		System.out.println("Total links are "+links.size());
		
					for(int i=0;i<links.size();i++)
					{
							WebElement ele= links.get(i);
							String url=ele.getAttribute("href");
							verifyLink(url);
					}
	}	
			//--------------------------Valid or Active Links--------------------------//
			
			public static void verifyLink(String urlLink) throws IOException, InterruptedException 
			{
				try
				{
					URL link = new URL(urlLink);
					HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
					httpConn.setConnectTimeout(2000);
					httpConn.connect();
					
								if(httpConn.getResponseCode()== 200) 
								{ 
									System.out.println(urlLink+" - "+httpConn.getResponseMessage());
										{
											if(httpConn.getResponseCode()== 404) 
											{
												System.out.println(urlLink+" - "+httpConn.getResponseMessage());
											}
										}
								}
				}
									catch (IOException e)
								{
						            e.printStackTrace(); 
								}
					
			}	
			
			public static void Logout()
			{
				d.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
				System.out.println("Logout Successfully");
				d.quit();
			}
	}

