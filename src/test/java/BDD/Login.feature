@LoginSuite
Feature: Login Suite
  As a user
  I want to login
  So that I can login my account

  @Login
  Scenario: Login
    Given Welcome page opened
    When I click masuk sekarang
    And I input username "maulanastg"
    And I input password "123456"
    And I click login
    Then Success to login

  @LoginWithVisiblePassword
  Scenario: Login With Visible Password
    Given Welcome page opened
    When I click masuk sekarang
    And I input username "maulanastg"
    And I click icon visible password
    And I input password "123456"
    And I click login
    Then Success to login

  @LoginAndLogout
  Scenario: Login And Logout
    Given Welcome page opened
    When I click masuk sekarang
    And I input username "maulanastg"
    And I input password "123456"
    And I click login
    Then Success to login
    And I click profile
    And I click keluar
    And I click konfirmasi keluar
    Then Success to logout


    # Negative Case

  @LoginWithEmptyUsernameAndPassword
  Scenario: Login With Empty Username And Password
    Given Welcome page opened
    When I click masuk sekarang
    And I click login
    Then Failed to login error message username password belum dimasukkan

  @LoginWithEmptyPassword
  Scenario: Login With Empty Password
    Given Welcome page opened
    When I click masuk sekarang
    And I input username "maulanastg"
    And I click login
    Then Failed to login error message username password belum dimasukkan

  @LoginWithEmptyUsername
  Scenario: Login With Empty Username
    Given Welcome page opened
    When I click masuk sekarang
    And I input password "123456"
    And I click login
    Then Failed to login error message username password belum dimasukkan

  @LoginWithInvalidUsernameAndPassword
  Scenario: Login With Invalid Username And Password
    Given Welcome page opened
    When I click masuk sekarang
    And I input username "invalidusername"
    And I input password "000000"
    And I click login
    Then Failed to login error message username dan password tidak ditemukan

  @LoginWithInvalidUsername
  Scenario: Login With Invalid Username
    Given Welcome page opened
    When I click masuk sekarang
    And I input username "invalidusername"
    And I input password "123456"
    And I click login
    Then Failed to login error message username dan password tidak ditemukan

  @LoginWithInvalidPassword
  Scenario: Login With Invalid Password
    Given Welcome page opened
    When I click masuk sekarang
    And I input username "maulanastg"
    And I input password "000000"
    And I click login
    Then Failed to login error message password tidak sesuai