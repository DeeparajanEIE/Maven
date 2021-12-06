package com.API;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass1;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Rest_Assured_Test extends BaseClass1 {
	@Test
	private void demo() throws IOException {
		String base_uri = testDataExcel("C:\\Users\\dell\\Desktop\\Postman.xlsx", 0, 1, 1);
		System.out.println(base_uri);
		RestAssured.baseURI=base_uri;
		RequestSpecification given = RestAssured.given();
		String url = testDataExcel("C:\\Users\\dell\\Desktop\\Postman.xlsx", 0, 1, 2);
		System.out.println(url);
		Response response = given.get("/index.php");
		String string = response.asString();
		int statusCode = response.getStatusCode();
		System.out.println("Status code :"+statusCode);
		String code = testDataExcel("C:\\Users\\dell\\Desktop\\Postman.xlsx", 0, 1, 4);
		Assert.assertEquals(statusCode, code);
		ResponseBody body = response.getBody();
		System.out.println("Body :"+body);
		Headers headers = response.getHeaders();
		System.out.println("Headers :"+headers);
		String sessionId = response.getSessionId();
		System.out.println("Session ID :"+sessionId);
		String statusLine = response.getStatusLine();
		System.out.println("Statusline :"+statusLine);
		long time = response.getTime();
		System.out.println("Time :"+time);
	}
}
