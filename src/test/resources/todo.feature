Feature:

  Scenario: Como usuario admin
  quiero guardar mis eventos
  para usarlos cuando los necesite

    Given tengo TodoApp abierto
    When hago click en el boton AddEvent
    And lleno el formulario de nuevo evento
      | control        | valor             |
      | tituloEvento | Titulo1     |
      | notasEvento   | Notas1           |

    And hago click en opcion recordatorio
    And hago click en opcion FechaLimite
    And hago click selecciono FechaLimite
    And hago click en boton FechaAceptar
    And hago click en opcion Hora
    And hago click seleccionar Hora
    And hago click seleccionar Minuto
    And hago click en selector Tiempo
    And hago click en boton HoraAceptar
    And hago click en opcion AgregarRecordatorio
    And hago click seleccionar Recordatorio
    And hago click en el boton saveEvento
    And hago click en el check realizado
    Then el evento "Titulo1" deberia ser creado