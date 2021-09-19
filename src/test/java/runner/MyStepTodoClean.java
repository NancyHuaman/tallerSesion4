package runner;

import activities.todo.CreateEventoScreen;
import activities.todo.ListaEventoScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.net.MalformedURLException;

public class MyStepTodoClean {
    private ListaEventoScreen listaEventoScreen= new ListaEventoScreen();
    private CreateEventoScreen createEventoScreen= new CreateEventoScreen();

    @Given("yo tengo acceso a TodoApp")
    public void yoTengoAccesoATodoApp()  {
    }

    @When("hago click {string} button in main screen")
    public void hagoClickButtonInMainScreen(String nameButton) throws MalformedURLException {
        listaEventoScreen.addEventButton.click();
    }

    @And("yo lleno {string} textbox with {string}")
    public void yoLlenoTextboxWith(String nameControl, String value) throws MalformedURLException{
        if (nameControl.equals("tituloEvento"))
            createEventoScreen.tituloEventoTxtBox.setText(value);
        else
            createEventoScreen.notasEventoTxtBox.setText(value);
    }

    @And("hago click {string} button")
    public void hagoClickButton(String nameButton) throws MalformedURLException {
        switch (nameButton) {
            case "recordatorio":
                createEventoScreen.recordatorioButton.click();
                break;
            case "fijarFechaLimite":
                createEventoScreen.fijarFechaLimiteButton.click();
                break;
            case "seleccFecha":
                createEventoScreen.seleccFechaButton.click();
                break;
            case "fechaAceptar":
                createEventoScreen.fechaAceptarButton.click();
                break;
            case "fijarHora":
                createEventoScreen.fijarHoraButton.click();
                break;
            case "seleccHora":
                createEventoScreen.seleccHoraButton.click();
                break;
            case "seleccMinuto":
                createEventoScreen.seleccMinutoButton.click();
                break;
            case "seleccTiempo":
                createEventoScreen.seleccTiempoButton.click();
                break;
            case "horaAceptar":
                createEventoScreen.horaAceptaButton.click();
                break;
            case "agregarRecordatorio":
                createEventoScreen.agregarRecordatorioButton.click();
                break;
            case "recordar":
                createEventoScreen.recordarButton.click();
                break;
            default:
                createEventoScreen.saveEventoButton.click();
                break;
        }
    }

    @And("hago click {string} checkbox")
    public void hagoClickCheckbox(String realizado) throws MalformedURLException {
        createEventoScreen.realizadoChkBox.click();
    }

    @Then("hago evento {string} deberia ser creado")
    public void hagoEventoDeberiaSerCreado(String expectedResult)  {
        Assertions.assertTrue(listaEventoScreen.isEventCreated(expectedResult),"Evento NO CREADO!!");
    }
}
