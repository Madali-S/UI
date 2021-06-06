import actions.Click;
import actions.Dropdown;
import actions.IsDisplayed;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.DropdownUI;
import ui.DynamicUI;
import ui.InternetUI;
import ui.WindowNew;

public class PruebasAutomationUI extends Base {

    @Test
    public void DynamicLoading() {
        Click.on(webDriver,InternetUI.dynamicLink);
        Click.on(webDriver,DynamicUI.Example1);
        Click.on(webDriver,DynamicUI.ButtonStart);
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Boolean Verify= IsDisplayed.element(webDriver,DynamicUI.Message);
        Assert.assertTrue(Verify);
    }
    @Test
    public void Dropdown() {
        Click.on(webDriver,InternetUI.dropdownLink);
        Dropdown.select(webDriver,DropdownUI.SelectOption, "2");
        WebElement selected = Dropdown.getSelected(webDriver,DropdownUI.SelectOption);
        System.out.println(selected.getText());
        Assert.assertEquals(selected.getText(),"Option 2");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void MultipleWindows(){
        Click.on(webDriver,InternetUI.multipleWindowLink);
        Click.on(webDriver,WindowNew.ClickHere);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
