package com.finacus.MavenProject;
import java.util.List;
import org.openqa.selenium.support.ui.Select;
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
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
//import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
public class E3A {

	private static final WebElement INICIO = null;
	public static WebDriver d;
	String alt;
					
	
	//public static int brokenLinks;
	//public static int validLinks;
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		System.setProperty("webdriver.chrome.driver","E://Finacus Mobile Application Testing//chromedriver_win32//chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://testautomationpractice.blogspot.com/");
		

		d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		String Actual=d.getTitle();
		String Expected= "___________________________________";
		
		if(Actual.equals(Expected))
				{
					System.out.println("Valid Url");
				}
		else
		{
					System.out.println("Invalid Url");
		}
		
		d.findElement(By.id("txtUserId")).sendKeys("Agent1-999");	
		d.findElement(By.id("txtPassword")).sendKeys("Kenneth@123");
		d.findElement(By.name("btnLogin")).click();
		System.out.println("Agent Logged in Successfully");
		d.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//d.navigate().refresh();
		
		//System.out.println("Home page gets Refresh");
		
		
		//abs XPath: //
		d.findElement(By.xpath("/html[1]/body[1]/form[1]/header[1]/nav[1]/div[1]/a[1]/i[1]")).click();
		
		System.out.println("Click on Hamberger");
		
		//abs XPath: //
		//d.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/ul[1]/li[2]/ul[1]/li[3]/a[1]"));
		
		
		WebElement element = d.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/ul[1]/li[2]/ul[1]/li[3]/a[1]"));
		Actions actions = new Actions(d);
		actions.moveToElement(element).click().perform();
		
		System.out.println("Click on Agent menu");
		
		//abs XPath: //
		//d.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/ul[1]/li[2]/ul[1]/li[3]/div[1]/ul[1]/li[3]/a[1]")).click();
		
		WebElement element1 = d.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/ul[1]/li[2]/ul[1]/li[3]/div[1]/ul[1]/li[3]/a[1]"));
		Actions actions1 = new Actions(d);
		actions.moveToElement(element).click().perform();
		
		d.get("http://192.168.4.138/E3A/Source/Agent/BlockMobileNoAgent");
		System.out.println("Click on Block Agent");
		d.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
					
		    d.findElement(By.xpath("/html[1]/body[1]/form[1]/header[1]/nav[1]/div[1]/a[1]/i[1]")).click();
			System.out.println("Click on Hamberger menu again");
				
			
			WebElement Agent = d.findElement(By.xpath("//a[@class='collapsible-header waves-effect arrow-r'][contains(text(),'Agent')]"));
			new Actions(d).moveToElement(Agent).perform();
			WebElement userManagement = new WebDriverWait(d, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='collapsible-header waves-effect arrow-r'][contains(text(),'Agent')]")));
			new Actions(d).moveToElement(userManagement).perform();
			WebElement users = new WebDriverWait(d, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='collapsible-header waves-effect arrow-r'][contains(text(),'Agent')]")));
			users.click();
			System.out.println("Click On Agent menu");
			
			Thread.sleep(4000);
			
			Actions action = new Actions(d);
			action.moveToElement(d.findElement(By.linkText("View Sub Agents"))).build().perform();
			WebDriverWait wait = new WebDriverWait(d,30);
			System.out.println("Click On ViewSubAgent menu");
			
			
			System.out.println("User navigate on Registered AgentUsersList page successfully");
			
			Thread.sleep(2000);
			d.get("http://192.168.4.138/E3A/Source/Agent/RegisteredAgentUsersList");
			
			
			d.findElement(By.xpath("/html[1]/body[1]/form[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/input[1]")).click();
			Thread.sleep(1000);
			System.out.println("Add New SubAgent Page");
			d.get("http://192.168.4.138/E3A/Source/Distributor/CreateSubAgent");
			
			
			Thread.sleep(1000);
			d.findElement(By.xpath("//input[@id='MainContent_txtAgentfName']")).sendKeys("sush");
			d.findElement(By.xpath("//input[@id='MainContent_txtAgentlName']")).sendKeys("kad");
			d.findElement(By.xpath("//input[@id='MainContent_txtMobileNo']")).sendKeys("8521000008");
			d.findElement(By.xpath("//input[@id='MainContent_btnGenerateOtp']")).click();
			Thread.sleep(2000);

			System.out.println("Click On Generate OTP");
			System.out.println("OTP Generated Successfully");
			System.out.println("Please Enter OTP");
			
			Thread.sleep(20000);
			
			d.findElement(By.xpath("/html[1]/body[1]/form[1]/main[1]/div[1]/section[2]/div[1]/div[1]/div[3]/div[4]/input[1]")).click();
			
			System.out.println("OTP validate successfully");
			Thread.sleep(10000);
			
			d.findElement(By.xpath("/html[1]/body[1]/form[1]/main[1]/div[1]/section[2]/div[1]/div[1]/div[4]/div[2]/input[1]")).sendKeys("Andheri East");
			System.out.println("Address entered Successfully");
			
			Thread.sleep(10000);
			
			d.findElement(By.xpath("/html[1]/body[1]/form[1]/main[1]/div[1]/section[2]/div[1]/div[1]/div[7]/div[2]/input[1]")).sendKeys("sushant@gmail.com");
			System.out.println("Entered Email id successfully");
			Thread.sleep(10000);
			
			Select dropdown=new Select(d.findElement(By.id("MainContent_ddlAgentGender")));
			dropdown.selectByIndex(0);
			
			System.out.println("Select Male Option");
			Thread.sleep(1000);
			
			d.findElement(By.id("MainContent_txtDOB")).sendKeys("17-01-1996");
			System.out.println("Enter DOB");
			Thread.sleep(2000);
			
			d.findElement(By.id("MainContent_btnSave")).click();
			System.out.println("Click On Save button");
			Thread.sleep(30000);
			
			File screenshotFile1 = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile1, new File("E:/Finacus Mobile Application Testing/Screenshots/SubAgent Added success.jpg"));
			System.out.println("Agent List display Successfully");
			System.out.println("Record saved successfully");
			Thread.sleep(1000);
			
			d.get("http://192.168.4.138/E3A/Source/Customer/TopupPartner");
			
			//d.findElement(By.id("MainContent_btnTopup")).click();
			d.navigate().forward();
			
			System.out.println("Top Up Partner");

			d.findElement(By.id("MainContent_txtMobilenumber")).sendKeys("8529637410");
			d.findElement(By.id("MainContent_txtTrnxId")).sendKeys("12");
			d.findElement(By.id("MainContent_txtReloadAmount")).sendKeys("500");
			d.findElement(By.id("MainContent_txtReloadComment")).sendKeys("500");
			d.findElement(By.id("MainContent_txtTpin")).sendKeys("123456");
			d.findElement(By.id("MainContent_btnSave")).click();
			
			Thread.sleep(1000);
			d.quit();
	
			/*List<WebElement> links=d.findElements(By.tagName("a"));
			System.out.println("Total links are "+links.size());
						for(int i=0;i<links.size();i++)
						{
				
								WebElement ele= links.get(i);
								String url=ele.getAttribute("href");
								verifyLink(url);
						}*/
	}	
			/*//--------------------------Valid or Active Links--------------------------//
			
			public static void verifyLink(String urlLink) throws IOException 
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
			}*/
	private static void verifyLink(String url) {
		// TODO Auto-generated method stub
	}	
}	

