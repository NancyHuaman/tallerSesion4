package runner;

import activities.todoClean.CreateEventoScreen;
import activities.todoClean.ListaEventoScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.net.MalformedURLException;

public class MyStepTodoClean2 {
    private ListaEventoScreen listaEventoScreen= new ListaEventoScreen();
    private CreateEventoScreen createEventoScreen= new CreateEventoScreen();

    @Given("tengo acceso a TodoApp")
    public void tengoAccesoATodoApp() {
    }

    @When("click {string} button in main screen")
    public void clickButtonInMainScreen(String button) throws MalformedURLException {
        listaEventoScreen.addEventButton.click();
    }

    @And("lleno {string} textbox with {string}")
    public void llenoTextboxWith(String nameControl, String value) throws MalformedURLException {
        createEventoScreen.textBoxMap.get(nameControl).setText(value);
    }

    @And("click {string} button")
    public void clickButton(String nameControl) throws MalformedURLException {
        createEventoScreen.buttonMap.get(nameControl).click();
    }

    @And("click {string} checkbox")
    public void clickCheckbox(String checkbox) throws MalformedURLException {
        createEventoScreen.realizadoChkBox.click();
    }

    @Then("evento {string} deberia ser creado")
    public void eventoDeberiaSerCreado(String expectedResult) {
        Assertions.assertTrue(listaEventoScreen.isEventCreated(expectedResult),"Contacto NO CREADO!!");
    }
}
