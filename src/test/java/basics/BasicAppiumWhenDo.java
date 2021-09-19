package basics;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasicAppiumWhenDo {
    private AppiumDriver driver;

    @BeforeEach
    public void before() throws MalformedURLException {
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


    @AfterEach
    public void after(){
        driver.quit();
    }

    @Test
    public void verifyTodoApp() throws InterruptedException {
        Thread.sleep(2000);

        //click en agregar
        driver.findElement(By.xpath("//android.widget.ImageButton[@index=2]")).click();

        //ingresar titulo
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")).sendKeys("Titulo1");

        //ingresar notas
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextNotes")).sendKeys("Notas1");

        //recordatorio
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/note_item_reminder")).click();

        //boton fecha limite
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/due_date")).click();

        //seleccionar fecha limite
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"20 septiembre 2021\"]")).click();

        //fecha aceptar
        driver.findElement(By.id("android:id/button1")).click();

        //hora
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/time")).click();

        //seleccionar hora
        driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"8\"]")).click();

        //seleccionar minuto
        driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"40\"]")).click();

        //selector
        driver.findElement(By.id("android:id/pm_label")).click();

        //hora aceptar
        driver.findElement(By.id("android:id/button1")).click();

        //agregar recordatorio
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/reminder")).click();

        //selecc recordar
        driver.findElement(By.xpath("//android.widget.RadioButton[@index=4]")).click();

        //repetir
        //driver.findElement(By.id("com.vrproductiveapps.whendo:id/repeat")).click();

        //selecc repetir
        //driver.findElement(By.id("//android.widget.RadioButton[@text=\"Diariamente\"]")).click();

        //guardar
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/saveItem")).click();

        //realizado
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/home_list_item_marked")).click();

        //verificación
        //recuperar control resulto el valor expected vs actual
        String expectedResult="Titulo1";
        String actualResult=driver.findElement(By.xpath("//android.widget.TextView[@text='Titulo1']")).getText();
        Assertions.assertEquals(expectedResult,actualResult, "Error no se registro");
    }

}

