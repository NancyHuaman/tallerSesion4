package testClean;

import activities.todo.CreateEventoScreen;
import activities.todo.ListaEventoScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.net.MalformedURLException;

public class TodoTest {
    private ListaEventoScreen listaEventoScreen= new ListaEventoScreen();
    private CreateEventoScreen createEventoScreen= new CreateEventoScreen();

    @Test //escoger jupiter por usar junit5
    public void createContact() throws MalformedURLException {
        String titulo="Titulo1";
        String notas="Notas1";

        listaEventoScreen.addEventButton.click();

        createEventoScreen.tituloEventoTxtBox.setText(titulo);
        createEventoScreen.notasEventoTxtBox.setText(notas);
        createEventoScreen.recordatorioButton.click();
        createEventoScreen.fijarFechaLimiteButton.click();
        createEventoScreen.seleccFechaButton.click();
        createEventoScreen.fechaAceptarButton.click();
        createEventoScreen.fijarHoraButton.click();
        createEventoScreen.seleccHoraButton.click();
        createEventoScreen.seleccMinutoButton.click();
        createEventoScreen.seleccTiempoButton.click();
        createEventoScreen.horaAceptaButton.click();
        createEventoScreen.agregarRecordatorioButton.click();
        createEventoScreen.recordarButton.click();
        createEventoScreen.saveEventoButton.click();
        createEventoScreen.realizadoChkBox.click();

        Assertions.assertTrue(listaEventoScreen.isEventCreated(titulo),"Evento NO CREADO!!");
    }

    @AfterEach
    public void close() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
