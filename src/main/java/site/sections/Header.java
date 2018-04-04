package site.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Link;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import org.openqa.selenium.support.FindBy;

/**
 * Класс, описывающий верхнюю сервисную панель: Кнопка "Домой", Ссылка на Рабочий стол,
 * кнопка "Вызов меню пользоавтеля", кнопка переключения языка, кнопка "Информация"
 */
public class Header {
    @JFindBy(css = "[data-original-title='Домой']", group = "ru")
    @JFindBy(css = "[data-original-title='Home']", group = "en")
    public Button home;

    @Css( "a[href='/Dashboard']")
    public Link dashboardLink;

    @Css("#WhoAmISpanTime")
    public Button info;

    @Css("#LanguageID")
    public Dropdown language;

    @Css("WhoAmISpan")
    public Menu userMenu;
}
