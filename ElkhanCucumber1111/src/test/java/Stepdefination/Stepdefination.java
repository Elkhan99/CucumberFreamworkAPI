package Stepdefination;
import static io.restassured.RestAssured.given;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import java.io.IOException;

import org.json.JSONException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utility.HelperUtility;

public class Stepdefination {

	String API_Key, base_URL, endPoint;
	String AddNewPet_Req;
	String PutPetInfo_Req;
	Response AddNewPet_Resp, GetPet_Resp, PutPet_Resp, DeletePet_Resp;
	SoftAssert softAssert=new SoftAssert();

@Given("API is provided")
public void api_is_provided() {
	API_Key = "1234";
}

@When("user add a new Pet information using AddnewPet API")
public void user_add_a_new_pet_information_using_addnew_pet_api() throws JSONException, IOException {
	base_URL = "https://petstore3.swagger.io/api/v3";
	endPoint = base_URL + "/pet";
	AddNewPet_Req = HelperUtility.parseJSONFile(
			"C:\\Users\\Elkha\\OneDrive\\Desktop\\Elkhan\\ElkhanCucumber1111\\src\\test\\java\\resources\\PetData.json")
			.getJSONObject("Add-PET").toString();
	AddNewPet_Resp = given().contentType("application/json").header("api_key", API_Key).body(AddNewPet_Req).log()
			.all().when().post(endPoint).then().log().all().extract().response();
}

@Then("the response code of AddnewPet API is {int}")
public void the_response_code_of_addnew_pet_api_is (Integer expectedResponseCode) {
	Assert.assertEquals(AddNewPet_Resp.getStatusCode(), expectedResponseCode);
   
}

@Then("response body of AddnewPet API is matching with swagger")
public void response_body_of_addnew_pet_api_is_matching_with_swagger() {
	JsonPath jp = new JsonPath(AddNewPet_Resp.asString());
	softAssert.assertEquals(jp.getString("id"), "155");
	softAssert.assertEquals(jp.getString("category.name"), "Peagon");
	softAssert.assertAll();
    throw new io.cucumber.java.PendingException();
}

@When("user search the Pet information using FindByPETID API")
public void user_search_the_pet_information_using_find_by_petid_api() {
	base_URL = "https://petstore3.swagger.io/api/v3";
	endPoint = base_URL + "/pet/155";
	GetPet_Resp = given().header("api_key", API_Key).get(endPoint).then().log().all().extract().response();
    throw new io.cucumber.java.PendingException();
}

@Then("the response code of FindByPETID API is {int}")
public void the_response_code_of_find_by_petid_api_is(Integer expectedResponseCode) {
	Assert.assertEquals(GetPet_Resp.getStatusCode(), expectedResponseCode);
    throw new io.cucumber.java.PendingException();
}

@Then("response body of FindByPETID API is matching with swagger")
public void response_body_of_find_by_petid_api_is_matching_with_swagger() {
	System.out.println("Implementation Pending");
    throw new io.cucumber.java.PendingException();
}

@When("user change the Pet information using UpdatedPETID API")
public void user_change_the_pet_information_using_updated_petid_api() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the response code of UpdatedPETID API is {int}")
public void the_response_code_of_updated_petid_api_is(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("response body of UpdatedPETID API is matching with swagger")
public void response_body_of_updated_petid_api_is_matching_with_swagger() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user delete the Pet information using DeletePETID API")
public void user_delete_the_pet_information_using_delete_petid_api() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the response code of DeletePETID API is {int}")
public void the_response_code_of_delete_petid_api_is(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("response body of DeletePETID API is matching with swagger")
public void response_body_of_delete_petid_api_is_matching_with_swagger() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

	
	
}
