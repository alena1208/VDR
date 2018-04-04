package site;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import site.pages.DashboardPage;
import site.sections.LoginForm;

@JSite("")
public class VDRSite extends WebSite {
    public static LoginForm loginForm;

    @JPage(urlTemplate = "/Dashboard")
    public static DashboardPage dashboard;


}
