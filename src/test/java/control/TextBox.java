package control;

import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class TextBox extends ControlDevice{
    public TextBox(By locator) {
        super(locator);
    }

    public void setText(String value) throws MalformedURLException {
        this.findControl();
        this.controlAppium.sendKeys(value);
    }
}
