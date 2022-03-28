Feature: Yo como QA
    Quiero probar el funcionamiento de Contact Us
    para validar el buen funcionamiento de las PQRS

    Background:
        Given El usuario ya registrado está en la página de destino

    Scenario Outline: Solicitud exitosa
        When el navega hasta el formulario de Contac us
        And el ingresa los campos del formulario y confirma la accion
            |cabecera|<cabecera>|
            |email   |<email>   |
            |referencia|<referencia>|
            |mensaje   |<mensaje>   |
        Then el usuario verá un mensaje exitoso
        Examples:
        |cabecera |email                  |referencia      |mensaje                                 |
        |Webmaster|extraduke0000@gmail.com|referencia      |mensaje                                 |

    Scenario Outline: Solicitud exitosa con archivo adjunto
        When el usuario navega hasta el formulario de Contac us
        And el ingresa los campos del formulario, adjunta un archivo y confirma la accion
            |cabecera|<cabecera>|
            |email   |<email>   |
            |referencia|<referencia>|
            |nombreArchivo |<nombreArchivo> |
            |mensaje   |<mensaje>   |
        Then el usuario verá un mensaje exitoso en la pagina
        Examples:
            |cabecera |email                   |referencia    |nombreArchivo|mensaje                  |
            |Webmaster|extraduke0000@gmail.com|referencia     |sd.txt       |mensaje                   |



