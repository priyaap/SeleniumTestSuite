@HerokuAppTest
Feature: UI Test Practice
  Background:
    Given I am on herokuApp
  Scenario: I want to practice all UI features on herokuApp


#    @AddDeleteElements
#    Scenario: Test adding web elements
#      When I click on AddRemove Elements link
#      And I navigate to AddRemove Elements Screen
#      When I Press Add Element Button 5 times
#      Then Element gets added 5 times
#      When I Press Delete Button 2 times
#      Then Only 3 Delete Button stays

    @BasicAuth
    Scenario: Test basic auth
    When I click on Basic Auth link
      And enter valid credentials user as "admin" and password as "admin"
      Then I land on Basic Auth page



