Feature: Validaciones en pago en linea
  Scenario: Validacion del texto correcto en el boton ingresar
    Given Ingreso a la pagina de pago en linea
    When Ingreso el numero de cliente correcto "12002990"
    Then Validar texto boton "Ingresar"

  Scenario: Validacion de texto no correcto en boton submit
    Given Ingreso a la pagina de pago en linea
    When Ingreso el numero de cliente correcto "12002990"
    Then Validar texto incorrecto "Buscar informacion"

  Scenario: Validar informacion correcta del listado de pagos
    Given Ingreso a la pagina de pago en linea
    When Ingreso el numero de cliente correcto "12002990"
    And Hacer click en el boton "Ingresar"
    Then Validar el correcto despliegue del listado de pago

  Scenario: Validar informacion correcta del listado sin deudas
    Given Ingreso a la pagina de pago en linea
    When Ingreso el numero de cliente correcto "87878744"
    And Hacer click en el boton "Ingresar"
    Then Validar mensaje de cliente sin deudas