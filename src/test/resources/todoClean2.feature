Feature:
  @EC
  Scenario: create evento

    Given tengo acceso a TodoApp
    When click "addEvent" button in main screen
    And lleno "tituloEvento" textbox with "Titulo1"
    And lleno "notasEvento" textbox with "Notas1"
    And click "recordatorio" button
    And click "fijarFechaLimite" button
    And click "seleccFecha" button
    And click "fechaAceptar" button
    And click "fijarHora" button
    And click "seleccHora" button
    And click "seleccMinuto" button
    And click "seleccTiempo" button
    And click "horaAceptar" button
    And click "agregarRecordatorio" button
    And click "recordar" button
    And click "saveEvento" button
    And click "realizado" checkbox
    Then evento "Titulo1" deberia ser creado