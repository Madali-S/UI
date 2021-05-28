package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;

public class Click {
    public static void click (WebDriver webDriver, By locator){
        webDriver.findElement (locator).click();
    }
}
