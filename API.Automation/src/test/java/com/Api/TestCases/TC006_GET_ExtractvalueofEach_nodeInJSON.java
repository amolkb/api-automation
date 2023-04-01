package com.Api.TestCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC006_GET_ExtractvalueofEach_nodeInJSON {
	@Test
	public void EtractValue_InJSON()
	{
		//specify URI
		RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
		
		//request object
		RequestSpecification httpResponse=RestAssured.given();
		//response object
		Response response=httpResponse.request(Method.GET,"/books");
		
		JsonPath jsonpath=response.jsonPath();
		
		System.out.println(jsonpath.get("isbn"));
		System.out.println(jsonpath.get("title"));
		System.out.println(jsonpath.get("subTitle"));
		System.out.println(jsonpath.get("author"));
		System.out.println(jsonpath.get("publish_date"));
		System.out.println(jsonpath.get("publisher"));
		System.out.println(jsonpath.get("pages"));
		System.out.println(jsonpath.get("description"));
		System.out.println(jsonpath.get("website"));
		
		
		//Assert.assertEquals(jsonpath.get("title"), "Git Pocket Guide");
		
		
		
	}

}
