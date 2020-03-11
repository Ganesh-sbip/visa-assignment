Feature: Amazon website Login Test

  @negative_scenario @Login_invalid_username @smoke_test
  Scenario: Amazon SG -  Login using invalid username
    Given I'm on amazon login page
    When I enter "invalid" username
    And I continue to the next page
      Then I verify if invalid "username" error message is displayed

  @negative_scenario @Login_invalid_password @smoke_test
  Scenario: Amazon SG - Login using invalid password
    Given I'm on amazon login page
    When I enter "valid" username
    And I continue to the next page
    And I enter "invalid" password
    And I submit the user credentials
      Then I verify if invalid "password" error message is displayed

  @positive_scenario @Login_valid_credentials @smoke_test
  Scenario: Amazon SG - Login using valid credentials
    Given I'm on amazon login page
    When I enter "valid" username
    And I continue to the next page
    And I enter "valid" password
    And I submit the user credentials
      Then I verify I am landed on Home screen