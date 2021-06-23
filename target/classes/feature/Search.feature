Feature: Fuctionality of The Star Wars API - SWAPI website


Scenario: Verify the SWAPI API should be able to return a list of all the Star Wars characters

Given User should launch the chrome browser and is able to open the Swapi.dev website
Then enter the valid request URL in the search box to get the list of all the Star Wars characters
And Click Request


Scenario: Verify the SWAPI API should be able to return a list of all the Star Wars characters

Given User should open the chrome and is able to open the Swapi.dev website
Then User should enter the invalid API request in search box
And Click on the Request button


Scenario: Verify the SWAPI API should be able to return the details of a specified Star Wars Character

Given User should launch the chrome browser and enter the URL of Swapi website
Then Enter the correct API URL for the specified Star Wars Character
And Click on Request bttn


Scenario: Verify the SWAPI API should be able to return the details of a specified Star Wars Character

Given User should open the chrome browser and enter the URL of Swapi website
Then Enter the invalid API URL for the specified Star Wars Character
And Click on the Request bttn


Scenario: Verify the users should be able to search for the details of a planet

Given User should launch the chrome browser and able to enter the Swapi website
Then Enter the valid SWAPI URL to search for the details of a planet
And Click the Request bttn

