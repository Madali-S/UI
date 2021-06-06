package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Click {
    public static void on (WebDriver webDriver, By locator)
    {
        webDriver.findElement(locator).click();

    }
}

