package com.Api.TestCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC005_GET_Validating_JSONResponse {
	@Test
	public void getDetails()
	{
		RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";//specift Base URI
		
		//Request object
		RequestSpecification httpRequest=RestAssured.given();
		//Response object
		Response response=httpRequest.request(Method.GET,"/Git Pocket Guide");
		
		String responsebody=response.getBody().asString();
		System.out.println("Status code is :"+responsebody);
		//Assert.assertEquals(responsebody.contains("Git Pocket Guide"), true);
		
	}

}
