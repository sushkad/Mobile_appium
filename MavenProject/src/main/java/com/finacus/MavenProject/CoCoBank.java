package com.finacus.MavenProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.xml.datatype.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.collections.Lists;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CoCoBank  {

	//private static final WebElement MPIN = null;
	public static URL url;
	public static DesiredCapabilities capabilities;
	public static AndroidDriver<MobileElement> d;


	@BeforeSuite
	public void setupAppium() throws MalformedURLException, InterruptedException 
	{
		final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
		url = new URL(URL_STRING);

		capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "V2025");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		//capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		//capabilities.setCapability(MobileCapabilityType.APP, "E:\\QA\\cocobank_UAT.apk");
		capabilities.setCapability("APP_PACKAGE","com.finacus.positivepay");
		capabilities.setCapability("APP_ACTIVITY","crc645eda2270212ad276.SplashActivity");

		d = new AndroidDriver<MobileElement>(url,capabilities);
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Set Up Completed");
	}

	
	/*
	@Test(enabled=true)
	public void DeviceBinding() throws InterruptedException 
	{
		d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[1]/android.widget.Button\r\n" + 
				"")).click();
		System.out.println("ACCEPT");
		Thread.sleep(3000);

		System.out.println("Terms and Conditions");

		d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]\r\n" + 
				"")).click();
		System.out.println("ALLOW Phone Call Permission");

		d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]\r\n" + 
				"")).click();
		System.out.println("ALLOW Photo,Media,& Files Permission");

		d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]\r\n" + 
				"")).click();
		System.out.println("ALLOW Picture & record");

		d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView\r\n" + 
				"")).click();
		System.out.println("Privacy Policy");

		d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[2]/android.widget.Button" +
			"")).click();
		System.out.println("DECLINE");

		///////////////////Application gets Crash////////////////////////

	  //d.scrollTo("DECLINE");
		d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.widget.Button\r\n" + 
						"")).click();
		System.out.println("Scroll upto Decline");

		d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.widget.Button\r\n" + 
				"")).click();
		System.out.println("Tap on DECLINE BUTTON");
		//////// Scroll up and down code here /////////
	    //////// Click on Privacy policy link & navigate on Bank page which is on Chrome browser then again navigate on Application page/////
	    //////// Using device back button ////////
	    //////// d.findElement(By.id("android:id/navigationBarBackground"); //////////
		//////// d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.Button\r\n" + 
		//////// "")).click();
		////////  System.out.println("Click on ACCEPT button"); 

	}

	@Test(enabled=true)
    public void testCase1() 
    { 
         System.out.println("Test Cases 1");       
    }

	@Test(enabled=true)
	public void Registration() throws InterruptedException
	{
		d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\r\n" + 
				"")).click();

		Thread.sleep(2000);

		d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.EditText\r\n" + 
				"")).sendKeys("9408214525");

		d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\r\n" + 
				"")).click();

		//d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button\r\n" + 
		//		"")).click();
		Thread.sleep(2000);

		//File scrFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	    //FileUtils.copyFile(scrFile, new File("E:\\Finacus Mobile Application Testing\\Screenshots\\google.png"));
		//System.out.println("Internal Server error");

		Thread.sleep(2000);
		System.out.println("......Enter REG. Mobile Number......");

		Thread.sleep(3000);
	}
			@Test(enabled=true)
			public void ResetMPIN() throws InterruptedException
			{
		 		WebElement MPIN = null;

				d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText\r\n" + 
						"" + 
						"")).sendKeys("7777");
				d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText\r\n" + 
						"" + 
						"")).sendKeys("2222");
				d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText\r\n" + 
						"" + 
						"\r\n")).sendKeys("2222");
				d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.Button\r\n" + 
						"")).click();


				 WebDriverWait explicitWait = new WebDriverWait(d, 10);
				 explicitWait.until(ExpectedConditions.visibilityOf(MPIN));

				  Assert.assertTrue(MPIN.isDisplayed(), "MPIN>>>");
				  System.out.println(MPIN.getText());

				Thread.sleep(2000);
				System.out.println("MPIN Change Successfully");
			 }

			@Test(enabled=true)
			public void ResetTPIN() throws InterruptedException
			{
			// obj rpin = new rpin  
			WebElement TPIN = null;
			d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText\r\n" + 
				"")).sendKeys("1234");
			d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText\r\n" + 
				"")).sendKeys("4321");
			d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText\r\n" + 
				"\r\n")).sendKeys("4321");

		  WebDriverWait explicitWait = new WebDriverWait(d, 10);
		  explicitWait.until(ExpectedConditions.visibilityOf(TPIN));
		  Assert.assertTrue(TPIN.isDisplayed(), "TPIN>>>");
		  System.out.println(TPIN.getText());
		  d.findElement(By.id("Button1")).click();
	}	
	 */

	/*	
				WebDriverWait explicitWait=new WebDriverWait(d,10);
				explicitWait.until(ExpectedConditions.visibilityOf(MPIN));
				Assert.assertTrue(MPIN.isDisplayed(), "MPIN>>>");
				System.out.println(MPIN.getText());
	 */


	@AfterSuite								
	public void uninstallApp() throws InterruptedException 
	{  
		d.closeApp();
		d.removeApp("com.finacus.positivepay");
		System.out.println("App Close Successfully");	
	}				
}
