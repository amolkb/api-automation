package com.Api.TestCases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC003_GET_Request {
	@Test
	
	void getDetailsHeader()
	{
		RestAssured.baseURI="https://reqres.in/api/users?page=2";//1.Specify base URI
		
		RequestSpecification httpRequest= RestAssured.given();//2.request object
		
		Response response=httpRequest.request(Method.GET ,"/");//3.response object
		
		String responsebody=response.getBody().asString();
		System.out.println("Status code is :"+responsebody);//4.print response
		
        String ContentType =response.header("Content-Type");//capture details headers Content-Type
        System.out.println("Content Type is :"+ContentType);
        Assert.assertEquals(ContentType,  "application/json; charset=utf-8");
        
        String ServerType=response.header("Server");//capture details headers server type
        System.out.println("ServerType is :"+ServerType);
        Assert.assertEquals(ServerType, "cloudflare");
		
       
		
		
		
		
		
	}

}
