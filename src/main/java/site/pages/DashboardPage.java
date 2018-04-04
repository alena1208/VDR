package site.pages;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.complex.table.Table;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import org.openqa.selenium.support.FindBy;

/**
 * Список комнат: Доступные для просмотра, Доступные для управления
 */
public class DashboardPage extends WebPage {
    //Выбор списка комнат через меню-?
    @FindBy(className = "ul.k-tabstrip-items")
    public Menu menu;

    //Выбор списка комнат по кнопкам-?
    @JFindBy(text = "Доступные для просмотра", group = "ru")
    @JFindBy(text = "Available for reviewing", group = "en")
    public Button reviewRooms;

    @JFindBy(text = "Доступные для управления", group = "ru")
    @JFindBy(text = "Available for management", group = "en")
    public Button manageRooms;

    //Хэдер таблицы
    @FindBy()
    public Table header;
    //Таблица
    @FindBy
    public Table roomsTable;

}
