package activities.todo;

import control.Button;
import control.CheckBox;
import control.TextBox;
import org.openqa.selenium.By;

public class CreateEventoScreen {
    public TextBox tituloEventoTxtBox=new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox notasEventoTxtBox=new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button recordatorioButton=new Button(By.id("com.vrproductiveapps.whendo:id/note_item_reminder"));
    public Button fijarFechaLimiteButton=new Button(By.id("com.vrproductiveapps.whendo:id/due_date"));
    public TextBox seleccFechaButton=new TextBox(By.xpath("//android.view.View[@content-desc=\"20 septiembre 2021\"]"));
    public Button fechaAceptarButton=new Button(By.id("android:id/button1"));
    public Button fijarHoraButton=new Button(By.id("com.vrproductiveapps.whendo:id/time"));
    public Button seleccHoraButton=new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"8\"]"));
    public Button seleccMinutoButton=new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"40\"]"));
    public Button seleccTiempoButton=new Button(By.id("android:id/pm_label"));
    public Button horaAceptaButton=new Button(By.id("android:id/button1"));
    public Button agregarRecordatorioButton=new Button(By.id("com.vrproductiveapps.whendo:id/reminder"));
    public Button recordarButton=new Button(By.xpath("//android.widget.RadioButton[@index=4]"));
    public CheckBox realizadoChkBox=new CheckBox(By.id("com.vrproductiveapps.whendo:id/home_list_item_marked"));
    public Button saveEventoButton= new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));

}
