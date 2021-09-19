package activities.todoClean;

import control.Button;
import control.CheckBox;
import control.TextBox;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class CreateEventoScreen {
    public Map<String,TextBox> textBoxMap = new HashMap<>();
    public Map<String,Button> buttonMap = new HashMap<>();

    public CheckBox realizadoChkBox=new CheckBox(By.id("com.vrproductiveapps.whendo:id/home_list_item_marked"));

    public CreateEventoScreen(){
        textBoxMap.put("tituloEvento",new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")));
        textBoxMap.put("notasEvento",new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes")));
        buttonMap.put("recordatorio", new Button(By.id("com.vrproductiveapps.whendo:id/note_item_reminder")));
        buttonMap.put("fijarFechaLimite",new Button(By.id("com.vrproductiveapps.whendo:id/due_date")));
        buttonMap.put("seleccFecha",new Button(By.xpath("//android.view.View[@content-desc=\"20 septiembre 2021\"]")));
        buttonMap.put("fechaAceptar",new Button(By.id("android:id/button1")));
        buttonMap.put("fijarHora",new Button(By.id("com.vrproductiveapps.whendo:id/time")));
        buttonMap.put("seleccHora",new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"8\"]")));
        buttonMap.put("seleccMinuto",new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"40\"]")));
        buttonMap.put("seleccTiempo",new Button(By.id("android:id/pm_label")));
        buttonMap.put("horaAceptar",new Button(By.id("android:id/button1")));
        buttonMap.put("agregarRecordatorio",new Button(By.id("com.vrproductiveapps.whendo:id/reminder")));
        buttonMap.put("recordar",new Button(By.xpath("//android.widget.RadioButton[@index=4]")));
        buttonMap.put("saveEvento",new Button(By.id("com.vrproductiveapps.whendo:id/saveItem")));
    }

}
