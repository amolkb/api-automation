package com.Api.TestCases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC002_POST_Request {
	
	@Test
	void Test2()
	{
		
	//specify base uri
		RestAssured.baseURI="https://reqres.in/api/users";
		
		//Request object 
		RequestSpecification httpRequest=RestAssured.given();
		
		//Request payload sending along with post request
		
		JSONObject requestParams=new JSONObject();
		
		requestParams.put("name", "Amol");
		requestParams.put("Job", "BE");
		
		
		httpRequest.header("Content-Type", "application/json; charset=utf-8");
		
		httpRequest.body(requestParams.toJSONString());//attach above data to the request
		
		//response object 
		Response response=httpRequest.request(Method.POST,"/resister");
		
		//print response in console window
		
		String responseBody=response.getBody().asString();
		System.out.println("Response Body is :"+responseBody);
		
		//status code validation 
		
		int statuscode =response.getStatusCode();
		System.out.println("Status code is : "+statuscode);
		Assert.assertEquals(statuscode,  201 );
		
		//sucess code validation 
//		String successCode =response.jsonPath().get("successCode");
//		Assert.assertEquals(successCode, "OPERATION_SUCCESS ");
		
		
	}
	

}
