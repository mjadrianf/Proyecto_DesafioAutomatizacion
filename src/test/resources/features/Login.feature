@smokeTest
Feature: Test cases del Contact Us Page
  Scenario: Validar login exitoso
    Given Yo ingreso al login de webdriver
    When Ingreso el nombre de usuario "webdriver"
    And Ingreso la contraseña "webdriver123"
    And Hago click en el boton login
    Then Yo espero que se prensente la validacion



