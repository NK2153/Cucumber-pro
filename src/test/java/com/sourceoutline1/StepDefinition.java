package com.sourceoutline1;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass {


	@Given("User is on the Adactin Url or Webpage")
	public void user_is_on_the_adactin_url_or_webpage() {
		browserLaunch();
		getBrowser("https://adactinhotelapp.com/");
	
	}
	
	@When("user should enters the {string} and {string}")
	public void user_should_enters_the_and(String user, String pass) {
		findId("username").sendKeys(user);
		findId("password").sendKeys(pass);
	}
	@When("User should Clicks the login button")
	public void user_should_clicks_the_login_button() {
		findId("login").click();
	
	}
	@When("User should Select the location {string}")
	public void user_should_select_the_location(String loca) {
		WebElement findName = findName("location");
		selectOptions3(findName, loca);
	}
	@When("User should Select the hotel {string}")
	public void user_should_select_the_hotel(String hotel) {
		WebElement findName = findName("hotels");
		selectOptions3(findName, hotel);
	}
	@When("User Should Select the roomtype {string}")
	public void user_should_select_the_roomtype_super_deluxe(String type) {
		WebElement findId = findId("room_type");
		selectOptions3(findId, type);
	}
	@When("User should Select the roomnos {int}")
	public void user_should_select_the_roomnos(Integer room) {
		WebElement findId = findId("room_nos");
		selectOptions(findId, room);
	}
	@When("User should Enter the Check in Date {string}")
	public void user_should_enter_the_check_in_date(String pickin) {
		WebElement findName = findName("datepick_in");
		findName.clear();
		findName.sendKeys("22/10/2022");
	}
	@When("User should Enter the Check out Date {string}")
	public void user_should_enter_the_check_out_date(String pickout) {
		WebElement findId = findId("datepick_out");
		findId.clear();
		findId.sendKeys("27/10/2022");
	}
	@When("User should Select the Adults per Room {string}")
	public void user_should_select_the_adults_per_room(Integer adult) {
		WebElement findId = findId("adult_room");
		selectOptions(findId, adult);
	}
	@When("User should Select the Childrens per Room {string}")
	public void user_should_select_the_childrens_per_room(Integer child) {
		WebElement findId = findId("child_room");
		selectOptions(findId, child);
	}
	@When("User should Click the  Search button")
	public void user_should_click_the_search_button() {
		findId("Submit").click();
	
	}
	@When("User should verify the Details and Click Continue button")
	public void user_should_verify_the_details_and_click_continue_button() {
		findId("radiobutton_0").click();  
		findId("continue").click();
	
	}
	@When("User should Enter the First Name {string}")
	public void user_should_enter_the_first_name(String fname) {
		findName("first_name").sendKeys(fname);
	
	}
	@When("User should Enter the Last Name {string}")
	public void user_should_enter_the_last_name(String lname) {
	findId("last_name").sendKeys(lname);	
	
	}
	@When("User should Enter the Address {string}")
	public void user_should_enter_the_address(String add) {
		findId("address").sendKeys(add);
	
	}
	@When("User Should Enter the Card No {string}")
	public void user_should_enter_the_card_no(String ccnum) {
		findId("cc_num").sendKeys(ccnum);
	
	}
	@When("User should Select the Card Type {string}")
	public void user_should_select_the_card_type(String cc) {
		WebElement findId = findId("cc_type");
		selectOptions3(findId, cc);
	}
	@When("User should Select the Card Expiry Month {int}")
	public void user_should_select_the_card_expiry_month(Integer ccmonth) {
		WebElement findId = findId("cc_exp_month");
		selectOptions(findId, ccmonth);
	}
	@When("User should Select the card Expiry Year {string}")
	public void user_should_select_the_card_expiry_year(String ccyear) {
		WebElement findId = findId("cc_exp_year");
		selectOptions3(findId, ccyear);
	}
	@When("User should Enter the Cvv Number {string}")
	public void user_should_enter_the_cvv_number(String cvv) {
		findId("cc_cvv").sendKeys(cvv);
	
	}
	@When("User should the Book Now button")
	public void user_should_the_book_now_button() {
		findId("book_now").click();
	
	}
	@When("User should Check the Booking order")
	public void user_should_check_the_booking_order() throws InterruptedException {
		Thread.sleep(6000);
		findId("my_itinerary").click();
	
	}
	@Then("verify the Login and Booking details")
	public void verify_the_login_and_booking_details() {
		String attribute = findxpath("(//input[@name='ids[]'])[3]").getAttribute("value");
		System.out.println(attribute);
	}



}
