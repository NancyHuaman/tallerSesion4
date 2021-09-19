package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

import java.net.MalformedURLException;

public class ControlDevice {
    protected WebElement controlAppium;
    protected By locator;

    public ControlDevice (By locator){
        this.locator=locator;
    }

    protected void findControl() throws MalformedURLException {
        this.controlAppium= Session.getInstance().getDriver().findElement(this.locator);
    }

    public void click() throws MalformedURLException {
        this.findControl();
        this.controlAppium.click();
    }

    public String getText() throws MalformedURLException {
        this.findControl();
        return this.controlAppium.getText();
    }

    public boolean isDisplayed() {
        try {
            this.findControl();
            return this.controlAppium.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

}
