
import entities.Kurator;
import entities.SimpleUser;
import org.testng.annotations.Test;


import static site.VDRSite.*;

public class LoginTests extends TestInit {

    @Test
    public void loginKuratorTest() {
        open();
        loginForm.loginAs(new Kurator());
        dashboard.shouldBeOpened();
    }

    @Test
    public void loginUserTest() {
        open();
        loginForm.loginAs(new SimpleUser());
        dashboard.shouldBeOpened();
    }
}
