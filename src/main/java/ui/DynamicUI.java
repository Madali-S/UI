package ui;

import org.openqa.selenium.By;

public class DynamicUI {
    public static By Example1 = By.xpath("//a[contains(text(),\"Example 1: Element on page that is hidden\")]");
    public static By ButtonStart= By.xpath("//button[contains(text(),\"Start\")]");
    public static By Message= By.xpath("//h4[contains(text(),\"Hello World\")]");
}

