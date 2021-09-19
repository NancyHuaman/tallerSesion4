Feature:
  #@EC
  Scenario: create evento

    Given yo tengo acceso a TodoApp
    When hago click "addEvent" button in main screen
    And yo lleno "tituloEvento" textbox with "Titulo1"
    And yo lleno "notasEvento" textbox with "Notas1"
    And hago click "recordatorio" button
    And hago click "fijarFechaLimite" button
    And hago click "seleccFecha" button
    And hago click "fechaAceptar" button
    And hago click "fijarHora" button
    And hago click "seleccHora" button
    And hago click "seleccMinuto" button
    And hago click "seleccTiempo" button
    And hago click "horaAceptar" button
    And hago click "agregarRecordatorio" button
    And hago click "recordar" button
    And hago click "saveEvento" button
    And hago click "realizado" checkbox
    Then hago evento "Titulo1" deberia ser creado