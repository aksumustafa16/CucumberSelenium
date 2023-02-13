Feature: Account types


  Scenario: Driver user
    Given the user logged in as "driver"
    When the user navigates to "Activities" "Calendar Events"
    Then the title contains "Calendar Events - Activities"


  Scenario: Sales manager user
    Given the user logged in as "sales manager"
    When the user navigates to "Customers" "Accounts"
    Then the title contains "Accounts - Customers"


  Scenario: Store manager user
    Given the user logged in as "store manager"
    When the user navigates to "Customers" "Contacts"
    Then the title contains "Contacts - Customers"

#  Scenario: Login with users
#    Given the user logged in as "driver"
#
#  Scenario: Login with users
#    Given the user logged in as "sales manager"
#
#  Scenario: Login with users
#    Given the user logged in as "store manager"

  @wip
  Scenario Outline: Login with different users
    Given the user logged in as "<userType>"
    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | admin         |
      | store manager |




