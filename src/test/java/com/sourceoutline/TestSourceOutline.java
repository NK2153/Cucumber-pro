package com.sourceoutline;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ELCOT\\eclipse-workspace\\CucumberScenarioOutline\\src\\test\\resources\\Feature\\adactionfeature.feature",glue="com.sourceoutline1",monochrome=true)
public class TestSourceOutline {
	/*@Given("User is on the Adactin Url or Webpage")
	public void user_is_on_the_adactin_url_or_webpage() {
		browserLaunch();
		getBrowser("https://adactinhotelapp.com/");

	}

	@When("user should enters the {string} and {string}")
	public void UP(String user, String pass) throws InterruptedException {
		findId("username").sendKeys(user);
		Thread.sleep(1000);
		findId("lastname").sendKeys(pass);

	}

	@When("User should Clicks the login button")
	public void clic() {
		findId("login").click();

	}

	@When("User should Select the location {string}")
	public void user_should_select_the_location(String loca) {
		WebElement findId = findId("location");
		selectOptions3(findId, loca);
	}

	@When("User should Select the hotel {string}")
	public void user_should_select_the_hotel(String hotel) {
		WebElement findName = findName("hotels");
		selectOptions3(findName, hotel);
	}

	@When("User Should Select the roomtype\"Super Deluxe\"")
	public void user_should_select_the_roomtype_super_deluxe(String type) {
		WebElement findName = findName("room_type");
		selectOptions3(findName, type);
	}

	@When("User should Select the roomnos\"{int}\"")
	public void user_should_select_the_roomnos(Integer room) {
		WebElement findId = findId("room_nos");
		selectOptions(findId, room);

	}

	@When("User should Enter the Check in Date {string}")
	public void user_should_enter_the_check_in_date(String pickin) {
		WebElement findId = findId("datepick_in");
		findId.clear();
		findId.sendKeys(pickin);
	}

	@When("User should Enter the Check out Date {string}")
	public void user_should_enter_the_check_out_date(String pickout) {
		WebElement findId = findId("datepick_out");
		findId.clear();
		findId.sendKeys(pickout);
	}

	@When("User should Select the Adults per Room {string}")
	public void user_should_select_the_adults_per_room(Integer adult) {
		WebElement findId = findId("adult_room");
		selectOptions(findId, adult);

	}

	@When("User should Select the Childrens per Room {string}")
	public void user_should_select_the_childrens_per_room(Integer child) {
		WebElement findId = findId("child_room ");
		selectOptions(findId, child);

	}

	@When("User should Click the Search button")
	public void user_should_click_the_search_button() {
		findName("Submit").click();

	}

	@When("User should verify the Details and Click Continue button")
	public void user_should_verify_the_details_and_click_continue_button() {
		findName("radiobutton_0").click();
		findId("continue").click();

	}

	@When("User should Enter the First Name {string}")
	public void user_should_enter_the_first_name(String fname) {
		findId("first_name").sendKeys(fname);

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
		findName("cc_num").sendKeys(ccnum);

	}

	@When("User should Select the Card Type {string}")
	public void user_should_select_the_card_type(String cc) {
		WebElement findName = findName("cc_type");
		selectOptions3(findName, cc);

	}

	@When("User should Select the Card Expiry Month {string}")
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

	}*/

}
