#Author: Ana Milena Uribe

Feature: Consumir metodo GET employees

  Scenario Outline: Juan es un usuario activo para consumir metodo GET para consultar todos los empleados
    Given that Juan usa el servicio para TEST
    When El consume el servicio para consultar todos los empleados
    Then Se espera un status Code <statusCode>
    Then Se espera recibir en el body un <status>
    Examples:
      | statusCode | status  |
      | 200        | "success" |

  Scenario Outline: Juan es un usuario activo para consumir metodo POST creación
    Given that Juan usa el servicio para TEST
    When El Consume El Servicio Para La Creacion
    Then Se espera un status Code <statusCode>
    Then Se espera recibir en el body un <status>
    Examples:
      | statusCode | status  |
      | 200        | "success" |

  Scenario Outline: Juan es un usuario activo para consumir metodo GET para consultar un empleado
    Given that Juan usa el servicio para TEST
    Then El Consume el Servicio para consultar el empleado <empleado>
    Then Se espera un status Code <statusCode>
    Then Se espera recibir en el body un <status>
    Examples:
      | empleado | statusCode | status  |
      | 1        | 200        | "success" |


  Scenario Outline: Juan es un usuario activo para consumir metodo DELETE para borrar un empleado
    Given that Juan usa el servicio para TEST
    Then El Consume el Servicio para borrar el empleado <empleado>
    Then Se espera un status Code <statusCode>
    Then Se espera recibir en el body un <status>
    Examples:
      | empleado | statusCode | status  |
      | 5        | 200        | "success" |