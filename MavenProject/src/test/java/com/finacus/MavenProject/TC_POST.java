package com.finacus.MavenProject;


import static io.restassured.RestAssured.post;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class TC_POST {

	
	@Test(priority = 0)
	void test01() throws InterruptedException
	{
		Response response = post("http://localhost:62342/api/Login/ValidateLogin");
		//Response response = post("http://103.78.168.227:5000/FinConnect.WhatsAppComm/FinConnectWa/WA?To=919820403049&from=9892978931&content_type=$ContentType&media_type=text&text=hi&latitude=$Latitude&longitude=$Longitude");
		
		System.out.println("Hi");
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());

		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());

		//response.getBody();
		//response.getStatusCode();

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		Thread.sleep(20000);
	}
}
