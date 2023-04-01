package com.Api.TestCases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC004_GET_PrintAllHeader {
	@Test
	
	void PrintAll_Header_Value()
	{
		RestAssured.baseURI="https://reqres.in/api/users?page=2";//specify URI 
		
		RequestSpecification httpsResponse=RestAssured.given();//Request object
		
		Response response=httpsResponse.request(Method.GET, "/");//response object
		
		String responsebody=response.getBody().asString();
		System.out.println("Status code is :"+responsebody);//print response
		
		Headers allHeaders =response.headers();
		
		for(Header header:allHeaders)
		{
			System.out.println(header.getName() +"   :-  "+header.getValue());
		}
	}

}
