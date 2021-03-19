package com.finacus.MavenProject;


import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.Test;

public class VanNew 
{
	public static URL url;
	public static DesiredCapabilities capabilities;
	public static AndroidDriver<MobileElement> d;


	/*public void allowAppPermission(){
	 while (d.findElements(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).size()>0) 

	 {  d.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click();
	 }
	}
	 */
	@SuppressWarnings({ "deprecation", "deprecation", "deprecation" })
	@BeforeSuite
	public void setupAppium() throws MalformedURLException, InterruptedException 
	{
		final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
		url = new URL(URL_STRING);

		capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "moto x4");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");

		capabilities.setCapability(MobileCapabilityType.APP, "E:\\QA\\VAN.apk");
		capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		//capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		//capabilities.setCapability(MobileCapabilityType.APP_PACKAGE,"com.rde.van");
		//capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY,"md57de442b4e0edf333d2add86a3d27bbee.SplashActivity");

		d = new AndroidDriver<MobileElement>(url,capabilities);
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("End Before Method");	
	}


	///////////////// App Permission /////////////////

	@Test (enabled=true) 
	public void TestCase1() throws InterruptedException 
	{
		System.out.println("Start TestCase1");

		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]"
				+ "")).click();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]"
				+ "")).click();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]"
				+ "")).click();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]"
				+ "")).click();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("End TestCase1");
	}

	///////////////// REGISTERED ///////////////// 

	@Test (enabled=true) 
	public void TestCase2() throws InterruptedException 
	{
		System.out.println("Start TestCase2");

		System.out.println("Enter Mobile Number");
		d.findElementByAccessibilityId("mobileEntry").sendKeys("9999999999");				

		d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button\r\n" + 
				"")).click();
		System.out.println("Click on Submit button");

		Thread.sleep(50000);


		d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button\r\n" + 
				""+ "")).click();

		System.out.println("Enter OTP Manually");

		//d.findElementByAccessibilityId("otpEntry").sendKeys("321654987");


		Thread.sleep(30000);
		//d.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button\r\n" + 
				"")).click();		

		System.out.println("Click On Submit button (OTP Screen)");
		Thread.sleep(50000);
		System.out.println("End TestCase2");
		d.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}


	/*	@Test (enabled=true) 
		public void TestCase3()
	{	
	}*/
	@AfterSuite								
	public void uninstallApp() throws InterruptedException 
	{
		// d.resetApp();
		d.closeApp();
		// d.removeApp("com.rde.vannew");
		System.out.println("App Close successfully");		
	}
}


