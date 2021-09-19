package activities.todo;

import control.Button;
import control.Label;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class ListaEventoScreen {
    public Button addEventButton= new Button(By.xpath("//android.widget.ImageButton[@index=2]"));

    public ListaEventoScreen(){}

    public boolean isEventCreated(String nombreEvento)  {
        Button eventoList = new Button(By.xpath("//android.widget.TextView[@text='"+ nombreEvento +"']"));
        return eventoList.isDisplayed();
    }


}
