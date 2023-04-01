package com.Api.TestCases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC001_GET_Request {
	
	@Test		
	public void getwetherDetails() {
		
		//Specify base URI
		RestAssured.baseURI="https://reqres.in/api/users?page=2" ;
		
		//Request object
		RequestSpecification httpRequest=RestAssured.given();
		
		//Response object
		Response response=httpRequest.request(Method.GET,"/");
		
		//print response
		String responseBody=response.getBody().asString();
		System.out.println("Response Body is :"+responseBody);
		
		
		//status code validation 
		int statuscode =response.getStatusCode();
		System.out.println("Status code is "+statuscode);
		Assert.assertEquals(statuscode,  200 );
		
		
	}
	

}
