#Autor: Elias Sierra
  #language: en
@success
Feature: Create user

  Background:
    Given the user is on the demoblaze page


  Scenario Outline: user creation test
    When enter credenciales
      | user   | pass   |
      | <user> | <pass> |
    Examples:
      | user  | pass   |
      | PRUEBAS_AUTOQA21  | PRUEBAS_AUTOQA21 |


@Login
  Scenario Outline: Login test

    When user enters credentials
      | user   | pass  |
      | <user> | <pass> |
    Then user should see a message "<welcome>"

    Examples:
        | user             | pass            | welcome                                   |
        | PRUEBAS_AUTOQA7  | PRUEBAS_AUTOQA7 | Welcome PRUEBAS_AUTOQA7 |

  @Cart
  Scenario: Add an item to the shopping cart

    Then the user searches for specific product
    And the user clicks dd to Cart
    And Enter the shopping cart option
    Then the product should be in the shopping cart "product"

