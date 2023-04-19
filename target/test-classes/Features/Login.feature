Feature: test the login Functionality



  Scenario: validate admin login
    Given the user navigates to the url
    When user enters a valid email and password
    And clicks on Login Button
    Then the user is logged in

  Scenario: validate login when user enters correct data
    Given the user navigates to the url
    When when user enters a valid email "Admin" and password "Hum@nhrm123"
    And clicks on Login Button
    Then the user is logged in

  Scenario: validate invalid login when user enters incorrect userName
    Given the user navigates to the url
    When when user enters a valid email "Admin2" and password "Hum@nhrm123"
    And clicks on Login Button
    Then the user is logged in

  Scenario: validate invalid admin login when user enters incorrect password
    Given the user navigates to the url
    When when user enters a valid email "Admin" and password "dummy"
    And clicks on Login Button
    Then the user is logged in

  Scenario: validate invalid admin login when user enters empty Data
    Given the user navigates to the url
    When when user enters a valid email "" and password ""
    And clicks on Login Button
    Then the user is logged in

  Scenario Outline: validate the wrong credentials error message
    When user enters the "<userName>" and "<password>"
    And clicks on Login Button
    Then user sees a message "<errorMsg>"
    Examples:
      | userName    | password    | errorMsg     |
      | admin       | Hum@nhrm123 | errorMessage |
     # |admin2      | abra         | invalidCredentials|
     # |admin3      | cadbra       | invalidCredentials|

