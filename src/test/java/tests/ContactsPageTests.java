package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

import static io.qameta.allure.Allure.step;

@Tag("WEB")
@DisplayName("Тесты для страницы 'Контакты'")
public class ContactsPageTests extends BaseTest {

    MainPage mainPage = new MainPage();
    ContactsPage contactsPage = new ContactsPage();

    @BeforeEach
    public void openPage() {
        step("Открываем главную страницу", () -> mainPage.openPage());
        step("Переходим в раздел 'Контакты' ", () -> mainPage.clickContactsSection());
    }

    @Test
    @Tag("SMOKE")
    @Story("Позитивный тест")
    @Owner("@Azkeww")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка открытия страницы 'Контакты'")
    void contactsPageTest() {
        step("Проверяем заголовок 'Контакты' ", () -> contactsPage.checkContactsHeaderText("Контакты"));
    }

    @Test
    @Tag("REGRESSION")
    @Story("Позитивный тест")
    @Owner("@Azkeww")
    @Severity(SeverityLevel.CRITICAL)
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
