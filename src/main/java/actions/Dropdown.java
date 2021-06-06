package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void select(WebDriver driver, By element,String valor){
        Select dropdown= new Select(driver.findElement(element));
        dropdown.selectByValue(valor);
    }
    public static WebElement getSelected(WebDriver driver, By element) {
        Select dropdown= new Select(driver.findElement(element));
        return dropdown.getFirstSelectedOption();
    }
}
