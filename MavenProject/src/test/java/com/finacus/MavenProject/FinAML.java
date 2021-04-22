package com.finacus.MavenProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;

public class FinAML extends Finacus_PageObject  
{
	public static WebDriver d;
	JavascriptExecutor js = (JavascriptExecutor) d;

	@BeforeSuite
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E://FIN_MobiConnect//chromedriver_win32//chromedriver.exe");
		d= new ChromeDriver();
		//String nodeurl;
		d.manage().window().maximize();
		d.manage().deleteAllCookies(); 
		d.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//d.get("http://192.168.4.138/finaml_internal/");
		d.get("http://103.78.168.227:9550/finaml_internalstatic/");
		//nodeurl="http://192.168.4.62/wd/hub";
		//d=new RemoteWebDriver(new URL(nodeurl),capability);		
		System.out.println("Open Static url"); 
		/*
		 * if(loginurl == "http://192.168.4.138/finaml_internalstatic/") { d.close(); }
		 * 
		 * else { String title = d.getTitle(); System.out.println(title);
		 * Assert.assertEquals(title, "FinAML","FinAML"); Thread.sleep(1000); }
		 */
		
		String url = "http://103.78.168.227:9550/finaml_internalstatic/";
		StringBuffer sb = new StringBuffer(url);
		System.out.println(sb.reverse());
		System.out.println(sb.length());
	
	}

	@Test (priority=1)	
	public void Login() throws InterruptedException, IOException
	{
		
		try
		{
			
		
		//d.get("http://103.78.168.227:9550/FinAML_InternalStatic/");
		System.out.println("User is on Login Page");
		d.findElement(By.id(Email)).sendKeys("testho");
		System.out.println("Enter Username");
		d.findElement(By.id(Password)).sendKeys("Ho@123");
		System.out.println("Enter Password");
		d.findElement(By.xpath(Login)).click();
		Thread.sleep(200);
		}
		
		catch(Exception e)
		{
			
		Thread.sleep(3000);
		System.out.println("Get the Screenshot");

		TakesScreenshot scrShot1 =((TakesScreenshot)d);
		File SrcFile1=scrShot1.getScreenshotAs(OutputType.FILE);
		File DestFile1=new File("E://FIN_MobiConnect//Login.png");
		FileUtils.copyFile(SrcFile1, DestFile1);
	}
}

	@Test (priority=2)	
	public void hrefLinks() throws InterruptedException
	{
		List<WebElement> links=d.findElements(By.tagName("a"));
		System.out.println("Total links are "+links.size());

		for(int i=0;i<links.size();i++)
		{
			WebElement element= links.get(i);
			String url1=element.getAttribute("href");
			String url2=element.getAttribute("rel");
			System.out.println(url1);
			System.out.println(url2);
		}
		
		Thread.sleep(2000);
		
		String[] AgentReason = { "Agent not willing to print receipt", 
				"Agent misbehaved", "Agent outlet closed", 
				"Agent denying registration of complaint",
                "Agent not accepting certain bills", 
                "Agent overcharging" };
	
		System.out.println(AgentReason);
	}

	@Test (priority=3)	
	public void Logout()
	{
		d.findElement(By.xpath(Logout)).click();
		System.out.println("Click on Logout button");

		if(logouturl == "http://103.78.168.227:9550/finaml_internalstatic/")
		{
			d.findElement(By.id(Email)).sendKeys("testho");
			System.out.println("Enter Username");
			d.findElement(By.id(Password)).sendKeys("Ho@123");
			System.out.println("Enter Password");
			d.findElement(By.xpath(Login)).click();
			System.out.println("User is on Home Page or Dashboard");

		}
		
		else
		{
			System.out.println("User should be land on Login Page");
		}

		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test (priority=4)	
	public void Menus() throws InterruptedException
	{
		d.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		System.out.println("User is on Dashboard page");

		d.findElement(By.xpath(Usermgm)).click();
		System.out.println("Click on User Management Menu");

		d.findElement(By.xpath(coreparameters)).click();
		System.out.println("Click on Core Parameters Menu");

		d.findElement(By.xpath(Masters)).click();
		System.out.println("Click on Masters Menu");

		d.findElement(By.xpath(SDNAssesment)).click();
		System.out.println("Click on SDNAssesment Menu");

		d.findElement(By.xpath(RiskAssesments)).click();
		System.out.println("Click on Risk Assesments Menu");

		d.findElement(By.xpath(STRMonitoring)).click();
		System.out.println("Click on STRMonitoring Menu");

		JavascriptExecutor jse = (JavascriptExecutor)d;
		jse.executeScript("window.scrollBy(0,250)");
		System.out.println("Scroll Successfully");

		d.findElement(By.xpath(MiscellaneousReport)).click();
		System.out.println("Click on Miscellaneous Report Menu");

		Thread.sleep(2000);
	}


	@Test(priority=5)
	public void UserManagement() throws InterruptedException
	{
		d.findElement(By.xpath(Usermgm)).click();
		System.out.println("Click on  User Management menu");

		d.findElement(By.xpath(Rolemaster)).click();
		System.out.println("Click on Role Master");

		d.findElement(By.xpath(AddRolemaster)).click();
		System.out.println("Click on AddRolemaster radio button");

		d.findElement(By.id(RolemasterName)).sendKeys("QA");
		System.out.println("Enter Role Name");

		Thread.sleep(200);
		d.findElement(By.id(RolemasterDescription)).sendKeys("QA Mobile appium");
		System.out.println("Enter Role Description");

		d.findElement(By.xpath(RolemasterClear)).click();
		System.out.println("Click on Role Save button");

		//d.switchTo().alert().accept();
		Thread.sleep(200);

		///// Block Unblock
		d.findElement(By.xpath(Usermgm)).click();
		System.out.println("Click on User Management Menu");

		d.findElement(By.xpath(Blockunblock)).click();
		System.out.println("Click on Blockunblock ");

		d.findElement(By.id(Blockuserid)).click();
		System.out.println("Click on Blockuserid ");
		Thread.sleep(200);

		//d.findElement(By.id(Blockuserid)).sendKeys(Keys.CONTROL);
		//Thread.sleep(200);

		d.findElement(By.id(Blockuserid)).sendKeys(Keys.DOWN);
		System.out.println("Down list Blockuserid"); 
		Thread.sleep(200);

		d.findElement(By.id(Blockuserid)).sendKeys(Keys.ENTER);
		System.out.println("Blockuserid Select menu");
		Thread.sleep(200);

		//d.findElement(By.xpath(Searchblockunblock)).sendKeys(Keys.CONTROL);
		//Thread.sleep(200);

		d.findElement(By.xpath(Searchblockunblock)).sendKeys(Keys.DOWN);
		System.out.println("Searchblockunblock Down list");
		Thread.sleep(200);

		d.findElement(By.xpath(Searchblockunblock)).sendKeys(Keys.ENTER);
		System.out.println("Select menuBlock Unblock");
		Thread.sleep(200);

		//d.findElement(By.xpath("//input[@value='0']")).click();
		//System.out.println("Click on Check Box");
		//Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor)d;
		jse.executeScript("window.scrollBy(0,250)");
		System.out.println("Scroll Successfully");

		d.findElement(By.xpath("//span[normalize-space()='Block']")).click();
		System.out.println("Click onBlock button");
		Thread.sleep(200);

		//d.switchTo().alert().accept();
		//Thread.sleep(200);

		String blockalert = "no such alert";

		if(blockalert == null)
		{
			d.get("http://103.78.168.227:9550/finaml_internalstatic/");
			d.findElement(By.xpath("//span[@class='icon-logout-01']"));
			System.out.println("Click on Logout button");
		}

		else 

		{
			d.close();

		}

	}

	@Test(priority=6)
	public void Coreparameters() throws InterruptedException
	{
		d.findElement(By.xpath(coreparameters)).click();
		System.out.println("Click on Core Parameter");
		d.findElement(By.xpath(Locationmaster)).click();
		System.out.println("Click on Location Master");
		d.findElement(By.xpath(LookupMaster)).click();
		System.out.println("Click on Lookup Master");
		d.findElement(By.xpath(OrganizationMaster)).click();
		System.out.println("Click on Organization Master");
		d.findElement(By.xpath(SystemParameter)).click();
		System.out.println("Click on System Parameter Master");

		d.findElement(By.xpath(Addspm)).click();
		System.out.println("Click on Add radio button");
		Thread.sleep(200);

		d.findElement(By.xpath(ParameterId)).sendKeys("QA");
		System.out.println("Click on Parameter Id");

		d.findElement(By.xpath(Description)).sendKeys("QA Manual");
		System.out.println("Select Option first");
		Thread.sleep(200);

		d.findElement(By.xpath(ParameterType)).sendKeys(Keys.DOWN);
		System.out.println("Down list");
		Thread.sleep(200);

		d.findElement(By.xpath(ParameterType)).sendKeys(Keys.ENTER);
		System.out.println("Select menu");
		Thread.sleep(200);

		d.findElement(By.xpath(ParameterValue)).sendKeys("27");
		System.out.println("Click on Parameter Value");

		d.findElement(By.xpath(SAVEspmbutton)).click();
		System.out.println("Click on SAVE spmbutton");
		Thread.sleep(3000);
		d.switchTo().alert().accept();

	}

	@Test(priority=7)
	public void Masters() throws InterruptedException, IOException
	{
		d.findElement(By.xpath(Masters)).click();
		System.out.println("Click on Masters menu");
		Thread.sleep(2000);

		d.findElement(By.xpath(CustomerInformation)).click();
		System.out.println("Click on Customer Information menu");
		Thread.sleep(2000);

		d.findElement(By.xpath(Principleofficemaster)).click();
		System.out.println("Click on Principle office master menu");
		Thread.sleep(2000);

		d.findElement(By.xpath(SDN)).click();
		System.out.println("Click on SDN Master menu");
		Thread.sleep(2000);

		d.findElement(By.xpath(Sdnmanual)).click();
		System.out.println("Click on SDN Manual Entry menu");
		Thread.sleep(2000);

		d.findElement(By.xpath(SDN)).click();
		System.out.println("Click on SDN menu");
		Thread.sleep(2000);

		d.findElement(By.xpath(Savesdn)).click();
		System.out.println("Click on Save button");
		File screenshot = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new

				File("E:\\FIN_MobiConnect\\screenshots\\1.jpg"));
		System.out.println("Screenshot Captured Successfully"); 

		d.switchTo().alert().accept();

		d.findElement(By.xpath(ListNamesdn)).sendKeys("qa27");
		System.out.println("Enter List Name");
		Thread.sleep(200);

		d.findElement(By.xpath(Clearsdn)).click();
		System.out.println("Click On Clear button");
		Thread.sleep(200);

	}

	@Test(priority=8)
	public void SDNAssesment0() throws InterruptedException
	{
		d.findElement(By.xpath(SDNAssesment)).click();
		System.out.println("Click on SDN Assesment");

		d.findElement(By.xpath(SearchFromSDN)).click();
		System.out.println("Click on Search From SDN");
		Thread.sleep(2000);

		d.findElement(By.xpath(Dropdownlist)).click();
		System.out.println("Click on Drop Down list");
		Thread.sleep(200);

		d.findElement(By.xpath(Dropdownlist)).sendKeys(Keys.DOWN);
		System.out.println("Down list");
		Thread.sleep(200);

		d.findElement(By.xpath(Dropdownlist)).sendKeys(Keys.DOWN);
		System.out.println("Down list");
		Thread.sleep(200);

		d.findElement(By.xpath(Dropdownlist)).sendKeys(Keys.ENTER);
		System.out.println("Select menu");
		Thread.sleep(200);


		d.findElement(By.id(searchEnterName)).sendKeys("QA");
		System.out.println("Enter Name");
		Thread.sleep(2000); 

		d.findElement(By.id(searchsdnid)).click();
		System.out.println("Click on Search button");

		//	d.switchTo().alert().accept();
		Thread.sleep(10000);

	}

	@Test(priority=9)
	public void SDNAssesmentTC1() throws InterruptedException
	{

		d.findElement(By.xpath(Downloadbutton)).click();
		System.out.println("Download file Successfully");
		Thread.sleep(1000);

		d.findElement(By.xpath(EXportasPDF)).click();
		Thread.sleep(2000);

	}

	@Test(priority=10)
	public void SDNAssesmentTC2() throws InterruptedException, IOException
	{
		d.findElement(By.id(Clearsdnid)).click();
		System.out.println("Click on Clear button");

		d.findElement(By.id(searchsdnid)).click();
		System.out.println("Click on Search button");
		d.switchTo().alert().accept();
		Thread.sleep(2000);
		File screenshot = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		Thread.sleep(200);
		FileUtils.copyFile(screenshot, new File("E:\\FIN_MobiConnect\\screenshots\\1.jpg"));
		System.out.println("Screenshot Captured Successfully");
		Thread.sleep(2000);
	}


	@Test(priority=11)
	public void RiskAssessment() throws InterruptedException
	{
		d.findElement(By.xpath(RiskAssesments)).click();
		System.out.println("Click on Risk Assessment menu");

		d.findElement(By.xpath(RiskCategory)).click();
		System.out.println("Click On Risk Category menu");

		d.findElement(By.xpath(ModifyRiskCategory)).click();
		System.out.println("Click On Add Risk Category radio button");

		d.findElement(By.xpath(Category)).click();
		System.out.println("Click on Category sub menu");

		d.findElement(By.xpath(Category)).sendKeys(Keys.DOWN);
		System.out.println("Click On Category");
		Thread.sleep(200);

		d.findElement(By.xpath(Category)).sendKeys(Keys.ENTER);
		System.out.println("Select Catrgory from the list");
		Thread.sleep(200);

		//d.switchTo().alert().accept();
		//Thread.sleep(200);

		d.findElement(By.xpath(MinimumRating)).clear();
		d.findElement(By.xpath(MinimumRating)).sendKeys("2");
		System.out.println("Select Minimum Rating*");
		Thread.sleep(200);

		d.findElement(By.xpath(MaximumRating)).clear();
		d.findElement(By.xpath(MaximumRating)).sendKeys("3");
		System.out.println("Select Maximum Rating*");
		Thread.sleep(200);

		d.findElement(By.xpath(Riskweighted)).clear();
		d.findElement(By.xpath(Riskweighted)).sendKeys("4");
		System.out.println("Select Risk weighted*");
		Thread.sleep(200);

		d.findElement(By.xpath(OverridingCriteria)).sendKeys(Keys.DOWN);
		System.out.println("Click On Category");
		Thread.sleep(200);

		d.findElement(By.xpath(OverridingCriteria)).sendKeys(Keys.ENTER);
		System.out.println("Select Catrgory from the list");
		Thread.sleep(200);

	}

	@Test(priority =12)
	public void STRMonitoring () throws InterruptedException, AWTException
	{

		d.findElement(By.xpath(STRMonitoring)).click();
		System.out.println("Click on STR Monitoring Menu ");

		d.findElement(By.xpath(PoliciewiseSummery)).click();
		System.out.println("Click on Policiewise Summery sub menu");

		d.findElement(By.xpath(Transactiondate)).click();
		System.out.println("Click on Transaction date");
		Thread.sleep(200);

		WebElement dateBox = d.findElement(By.xpath(FromDate));
		//Fill date as mm/dd/yyyy as 09/25/2013
		dateBox.sendKeys("21012020");
		Thread.sleep(2000);
		//Press tab to shift focus to to date field
		Thread.sleep(2000);
		//dateBox.sendKeys(Keys.TAB);
		//Robot robot = new Robot();

		WebElement dateBox1 = d.findElement(By.xpath(ToDate));
		dateBox1.sendKeys("16032021");
		dateBox1.sendKeys(Keys.TAB);

		d.findElement(By.xpath(View)).click();
		System.out.println("Click on View button");

	}

	@Test(priority =13)
	public void STRMonitoringdates() throws InterruptedException, AWTException, IOException
	{
		WebElement dateBox = d.findElement(By.xpath(FromDate));        
		dateBox.sendKeys("16032021");
		Thread.sleep(2000);

		WebElement dateBox1 = d.findElement(By.xpath(ToDate));
		dateBox1.sendKeys("08032021");
		dateBox1.sendKeys(Keys.TAB);

		d.findElement(By.xpath(View)).click();
		Thread.sleep(2000);
		System.out.println("Click on View button with invalid dates");
		//Thread.sleep(10000);
		d.switchTo().alert().accept();
		System.out.println("Alert Accept");
		Thread.sleep(10000);

		//	d.findElement(By.xpath(Clear)).click();
		System.out.println("Click on Clear button");
	}


	@Test(priority=14)
	public void MiscellaneousReport1() throws InterruptedException, AWTException
	{
		d.findElement(By.xpath(MiscellaneousReport)).click();
		System.out.println("Click on MiscellaneousReport ");
		Thread.sleep(300);

		d.findElement(By.xpath(CustomerClaimRequest)).click();
		System.out.println("Click on Customer Claim Request ");
		Thread.sleep(200);
		//d.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		d.findElement(By.xpath(ClientCode)).sendKeys(Keys.DOWN);
		Thread.sleep(200);
		d.findElement(By.xpath(ClientCode)).sendKeys("keys.ENTER");
		System.out.println("Click on Client Id");
		Thread.sleep(200);

		d.findElement(By.xpath(ViewCustomerInfo)).click();
		System.out.println("Click on Search button");
		Thread.sleep(200);
	}

	@Test(priority=15)
	public void MiscellaneousReport2() throws InterruptedException
	{
		d.findElement(By.xpath(MiscellaneousReport)).click();
		System.out.println("Click on Miscellaneous Report menu");
		Thread.sleep(1000);

		d.findElement(By.xpath(CustomerClaimRequest)).click();
		System.out.println("Click on CustomerClaimRequest menu");
		Thread.sleep(1000);

		d.findElement(By.xpath(CustomerDetailsReport)).click();
		System.out.println("Click on Customer Details Report");
		Thread.sleep(1000);

		d.findElement(By.xpath(CustomerpolicyListing)).click();
		System.out.println("Click on Customer policy Listing");
		Thread.sleep(1000);

		d.findElement(By.xpath(CustomerStatusSTR)).click();
		System.out.println("Click on Customer Status STR");
		Thread.sleep(1000);

		d.findElement(By.xpath(PaymentApprovalList)).click();
		System.out.println("Click on PaymentApprovalList");
		Thread.sleep(1000);

		d.findElement(By.xpath(FalsePositiveCustomers)).click();
		System.out.println("Click on False Positive Customers");
		Thread.sleep(1000);

		d.findElement(By.xpath(RejectedCustomer)).click();
		System.out.println("Click on Rejected Customer");
		Thread.sleep(1000);

	}
	
	@AfterSuite
	public void CloseApp()
	{
		d.quit();
		System.out.println("Application Close");		
	}
}
