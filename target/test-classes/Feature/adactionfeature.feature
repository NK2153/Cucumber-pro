Feature: Verify Adaction Booking Web page

  Scenario Outline: Verifying the Hotel booking with valid login and Booking credential
    Given User is on the Adactin Url or Webpage
    When user should enters the "<user>" and "<pass>"
    And User should Clicks the login button
    And User should Select the location "<loca>"
    And User should Select the hotel "<hotel>"
    And User Should Select the roomtype"<type>"
    And User should Select the roomnos"<room>"
    And User should Enter the Check in Date "<pickin>"
    And User should Enter the Check out Date "<pickout>"
    And User should Select the Adults per Room "<adult>"
    And User should Select the Childrens per Room "<child>"
    And User should Click the  Search button
    And User should verify the Details and Click Continue button
    And User should Enter the First Name "<fname>"
    And User should Enter the Last Name "<lname>"
    And User should Enter the Address "<add>"
    And User Should Enter the Card No "<ccnum>"
    And User should Select the Card Type "<cc>"
    And User should Select the Card Expiry Month "<ccmonth>"
    And User should Select the card Expiry Year "<ccyear>"
    And User should Enter the Cvv Number "<cvv>"
    And User should the Book Now button
    And User should Check the Booking order
    Then verify the Login and Booking details

    Examples: 
      | user         | pass          | loca  | hotel         | type         | room | pickin     | pickout    | adult | child | fname  | lname  | add                                                   | ccnum            | cc   | ccmonth | ccyear | cvv |
      | mersalnk2153 | nk1456027ndhu | Paris | Hotel Cornice | Super Deluxe |    2 | 22/10/2022 | 27/10/2022 |     2 |     2 | Mersal | Nandhu | 139/Anaikattu Road-4th Cross,Surampatti Valasu,Erode. | 7685940321019274 | VISA |      12 |   2022 | 143 |
