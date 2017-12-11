package apiTesting.com.test.apiTest;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class WeatherGetRequest {

	@Test
	public void Test_01() {
		
		Response resp1 = when().
						get("http://samples.openweathermap.org/data/2.5/weather?q=London&appid=4417e95814ce6fed700344534efbf944");
		
		System.out.println(resp1.statusCode());
	}
	
	@Test
	public void Test_02() {
		
		Response resp2 = when().
						get("http://samples.openweathermap.org/data/2.5/weather?q=London&appid=4417e95814ce6fed700344534efbf944");
		
		System.out.println(resp2.statusCode());
	}
	
	@Test
	public void Test_03() {
		
		Response resp2 = given().
						param("q", "London").
						param("appid","4417e95814ce6fed700344534efbf944").	
						when().
						get("http://samples.openweathermap.org/data/2.5/weather");
		
		System.out.println(resp2.statusCode());
	}
}
