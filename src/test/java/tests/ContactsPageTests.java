package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Tag("WEB")
@Owner("@Azkeww")
@DisplayName("Тесты для страницы 'Контакты'")
public class ContactsPageTests extends BaseTest {

    MainPage mainPage = new MainPage();
    ContactsPage contactsPage = new ContactsPage();

    @BeforeEach
    public void openPage() {
        mainPage.openMainPage();
        mainPage.clickContactsSection();
    }

    @Test
    @Tag("SMOKE")
    @Story("Позитивный тест")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка открытия страницы 'Контакты'")
    void contactsPageTest() {
        contactsPage.checkContactsHeaderText("Контакты");
    }

    @Test
    @Tag("REGRESSION")
    @Story("Позитивный тест")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверяем наличие контактов на странице")
    void contactsNamesInListTest() {
        contactsPage.checkContactNameInList("По вопросам сотрудничества");
        contactsPage.checkContactNameInList("Устройство на работу");
        contactsPage.checkContactNameInList("О нас и жизни компании");
        contactsPage.checkContactNameInList("Наши вакансии");
        contactsPage.checkContactNameInList("Офис");
    }
}
