Feature: Login feature

  @Smoke
  Scenario: User should login with valid credentials
    When when user click on whats new
    Then whats new page will be displayed

  @Regression
  Scenario: User should login with valid credentials
    When when user click on sale
    Then sale page will be displayed
