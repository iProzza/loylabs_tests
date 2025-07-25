package qaguru.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import qaguru.pages.*;

import static io.qameta.allure.Allure.step;

@Tag("WEB")
public class ContactsTests extends TestBase {

    MainPage mainPage = new MainPage();
    ContactsPage contactsPage = new ContactsPage();

    @BeforeEach
    public void openPage() {
        step("Открываем главную страницу", () -> mainPage.openPage());
        step("Переходим в раздел 'Контакты' ", () -> mainPage.clickContactsSection());
    }

    @Test
    @Tag("SMOKE")
    @DisplayName("Проверка открытия страницы 'Контакты'")
    void contactsPageTest() {
        step("Проверяем заголовок 'Контакты' ", () -> contactsPage.checkContactsHeaderText("Контакты"));
    }

    @Test
    @Tag("REGRESSION")
    @DisplayName("Проверяем наличие контактов на странице")
    void contactsNamesInListTest() {
        step("Проверяем список контактов", () -> {
                    contactsPage.checkContactNameInList("По вопросам сотрудничества");
                    contactsPage.checkContactNameInList("Устройство на работу");
                    contactsPage.checkContactNameInList("О нас и жизни компании");
                    contactsPage.checkContactNameInList("Наши вакансии");
                    contactsPage.checkContactNameInList("Офис");
                }
        );
    }
}
