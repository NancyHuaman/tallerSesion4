import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MyStepTodo {
    private AppiumDriver driver;

    @Given("tengo TodoApp abierto")
    public void tengoTodoAppAbierto() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Galaxy J4+");
        capabilities.setCapability("platformVersion","9");
        capabilities.setCapability("appPackage","com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity",".ui.HomeActivity");
        capabilities.setCapability("platformName","Android");

        driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        // implicit wait - para todos los controles
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @When("hago click en el boton AddEvent")
    public void hagoClickEnElBotonAddEvent() {
        driver.findElement(By.xpath("//android.widget.ImageButton[@index=2]")).click();
    }

    @And("lleno el formulario de nuevo evento")
    public void llenoElFormularioDeNuevoEvento(Map<String, String> information) {
        for (String control : information.keySet()
        ) {
            switch (control) {
                case "tituloEvento":
                    driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")).sendKeys("Titulo1");
                    break;
                case "notasEvento":
                    driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextNotes")).sendKeys("Notas1");
                    break;
            }
        }
    }

    @And("hago click en opcion recordatorio")
    public void hagoClickEnOpcionRecordatorio() {
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/note_item_reminder")).click();
    }

    @And("hago click en opcion FechaLimite")
    public void hagoClickEnOpcionFechaLimite() {
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/due_date")).click();
    }

    @And("hago click selecciono FechaLimite")
    public void hagoClickSeleccionoFechaLimite() {
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"20 septiembre 2021\"]")).click();
    }

    @And("hago click en boton FechaAceptar")
    public void hagoClickEnBotonFechaAceptar() {
        driver.findElement(By.id("android:id/button1")).click();
    }

    @And("hago click en opcion Hora")
    public void hagoClickEnOpcionHora() {
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/time")).click();
    }

    @And("hago click seleccionar Hora")
    public void hagoClickSeleccionarHora() {
        driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"8\"]")).click();
    }

    @And("hago click seleccionar Minuto")
    public void hagoClickSeleccionarMinuto() {
        driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"40\"]")).click();
    }

    @And("hago click en selector Tiempo")
    public void hagoClickEnSelectorTiempo() {
        driver.findElement(By.id("android:id/pm_label")).click();
    }

    @And("hago click en boton HoraAceptar")
    public void hagoClickEnBotonHoraAceptar() {
        driver.findElement(By.id("android:id/button1")).click();
    }

    @And("hago click en opcion AgregarRecordatorio")
    public void hagoClickEnOpcionAgregarRecordatorio() {
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/reminder")).click();
    }

    @And("hago click seleccionar Recordatorio")
    public void hagoClickSeleccionarRecordatorio() {
        driver.findElement(By.xpath("//android.widget.RadioButton[@index=4]")).click();
    }

    @And("hago click en el boton saveEvento")
    public void hagoClickEnElBotonSaveEvento() {
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/saveItem")).click();
    }

    @And("hago click en el check realizado")
    public void hagoClickEnElCheckRealizado() {
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/home_list_item_marked")).click();
    }

    @Then("el evento {string} deberia ser creado")
    public void elEventoDeberiaSerCreado(String expectedResult) {
        String actualResult=driver.findElement(By.xpath("//android.widget.TextView[@text='Titulo1']")).getText();
        Assertions.assertEquals(expectedResult,actualResult, "Error no se registro");
    }
}
