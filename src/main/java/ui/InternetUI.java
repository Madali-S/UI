package ui;

import org.openqa.selenium.By;

public class InternetUI {
    public static By dynamicLink = By.xpath("//a[contains(text(),\"Dynamic Loading\")]");
    public static By dropdownLink = By.xpath("//a[contains(text(),\"Dropdown\")]");
    public static By multipleWindowLink = By.xpath("//a[contains(text(),\"Multiple Windows\")]");
}
