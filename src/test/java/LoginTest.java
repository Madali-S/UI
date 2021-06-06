import org.testng.Assert;
import org.testng.annotations.Test;
import task.IsEmployeePageDisplayed;
import task.Login;

public class LoginTest extends Base {

    @Test
    public void testLogin() {
        Login.as(webDriver, "admin", "admin123");
        Assert.assertTrue(IsEmployeePageDisplayed.form(webDriver));
    }

}
