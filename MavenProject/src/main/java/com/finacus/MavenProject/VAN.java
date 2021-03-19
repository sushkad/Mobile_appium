package com.finacus.MavenProject;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.xml.datatype.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.collections.Lists;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class VAN 
{
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
		//capabilities.setCapability(MobileCapabilityType.APP, "E:\\QA\\com.rde.vannew-Signed.apk");
		//capabilities.setCapability(MobileCapabilityType.APP_PACKAGE,"com.rde.van");
		//capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY,"md57de442b4e0edf333d2add86a3d27bbee.SplashActivity");
		capabilities.setCapability("APP_PACKAGE","com.finacus.positivepay");
		capabilities.setCapability("APP_ACTIVITY","crc645eda2270212ad276.SplashActivity");

		d = new AndroidDriver<MobileElement>(url,capabilities);
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("End Before Method");
	}

	/*	///////////////// App Permission /////////////////

				@Test (enabled=true) 
				public void AppPermission() throws InterruptedException 
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



		@Test (enabled=true) 
			public void TestCase1() throws InterruptedException
		{

			System.out.println("Start TestCase1");

			d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText\r\n" + 
					"" + "")).sendKeys("1144778855");	

			d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button\r\n" 
						+ "")).click();
			System.out.println("Click on Submit button");
			Thread.sleep(50000);

			d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button\r\n" + 
					"" + "")).click();
			System.out.println("Tap on OK button");
			Thread.sleep(5000);

			d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText\r\n" + 
					"" + "")).click();		
			System.out.println("Enter OTP");
			Thread.sleep(5000);

			d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button\r\n" + 
					"" + "")).click();
			System.out.println("End TestCase1");			
		}
	 */
	/*
			@Test (enabled=true) 
			public void TestCase2() throws InterruptedException
			{
				System.out.println("Start TestCase2"); 

				d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText\r\n" + 
						"")).sendKeys("1111");
				Thread.sleep(5000);

				d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.Button\r\n" + 
						"")).click();
				Thread.sleep(5000);
				System.out.println("Navigate On Home screen");	

				System.out.println("End TestCase2");
			}
	 */
	/*
			@Test (enabled=true) 
			public void TestCase3() throws InterruptedException
			{
				System.out.println("Start TestCase3");

				d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup\r\n" + 
						"")).click();
				Thread.sleep(5000);

				d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup\r\n" + 
						"")).click();
				Thread.sleep(5000);

				d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText\r\n" + 
						"")).click();
				Thread.sleep(5000);
				d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView\r\n" + 
						"")).click();
				Thread.sleep(5000);
				d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.Button\r\n" + 
						"")).click();
				Thread.sleep(5000);

				d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v7.widget.LinearLayoutCompat/android.widget.TextView\r\n" + 
						"")).click();
				System.out.println("Navigate on home screen");
				Thread.sleep(200);
				System.out.println("End TestCase3");
			}

			@Test (enabled=true)	
			public void TestCase4() throws InterruptedException
			{
				System.out.println("End TestCase4");
				try
				{
				d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup\r\n" + 
						"")).click();
				Thread.sleep(5000);

				d.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView\r\n" + 
						"")).click();
				Thread.sleep(2000);


				int oldpin = 0,newpin = 0,confirmpin=0;

				if(oldpin==4)
				{
					System.out.println("valid old pin");
				}
				else
				{
					System.out.println("Invalid old pin");
				}	
						if(newpin==4)
						{
							System.out.println("Valid new pin");
						}
							else
							{
								System.out.println("Invalid new pin");
							}

						if(confirmpin==4)
						{
							System.out.println("Valid confirm Mpin");
						}
						else
						{
							System.out.println("Invalid confirm Mpin");
						}
				}

						catch (Exception ex)
						{
							ex.toString();
						}
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
		//d.removeApp("com.rde.van");
		System.out.println("App Close Successfully");
	}					
}



