Feature: Yo como QA
    Quiero probar el funcionamiento signin
    para validar el buen funcionamiento

  Background:
    Given El usuario ya registrado está en la página de destino

  Scenario Outline:Inicio de sesion exitoso
    When el navega hasta el formulario de login
    And el digita usuario y contraseña y da click en Signin
        |username|<username>|
        |password|<password>|
    Then el usuario verá una información de inicio de sesion
    Examples:
      |username               |password|
      |extraduke0000@gmail.com|123456  |

   Scenario Outline:Inicio de sesion fallido por contraseña incorrecta
     When el navega hasta el formulario
     And el digita usuario,contraseña incorrecta y da click en Signin
       |username|<username>|
       |password|<password>|
     Then el usuario vera mensaje de contraseña invalida
     Examples:
        |username               |password|
        |extraduke0000@gmail.com|12345  |
