package qaguru.tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import qaguru.pages.*;

@Tag("LoyLabs")
public class LoyLabsTests extends TestBase {

    private MainPage mainPage;
    private CasesPage casesPage;
    private NewsPage newsPage;
    private CareerPage careerPage;
    private ContactsPage contactsPage;

    @BeforeEach
    public void getPreconditions() {

        mainPage = new MainPage();
        casesPage = new CasesPage();
        newsPage = new NewsPage();
        careerPage = new CareerPage();
        contactsPage = new ContactsPage();

        //Создаём инстанс лиснера отдельно для каждого теста
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void tearDown() {
        Selenide.closeWebDriver();
    }

    @Test
    @DisplayName("Проверка отображения логотипа компании")
    void logoShouldBeVisibleTest() {
        mainPage.openPage()
                .checkLogoIsVisible();
    }

    @Test
    @DisplayName("Открываем страницу Кейсы и отображается заголовок 'Кейсы'")
    void casesPageTest() {
        mainPage.openPage().clickCasesSection();
        casesPage.checkCasesHeaderText("Кейсы");
    }

    @Test
    @DisplayName("Открываем страницу Новости и видим заголовок 'Новости'")
    void newsPageTest() {
        mainPage.openPage().clickNewsSection();
        newsPage.checkNewsHeaderText("Новости");
    }

    @Test
    @DisplayName("Открываем страницу Карьера и проверяем наличие кнопки 'Отправить резюме'")
    void careerPageTest() {
        mainPage.openPage().clickCareerSection();
        careerPage.resumeBtnIsVisible();
    }

    @Test
    @DisplayName("Открываем страницу Контакты и отображается заголовок 'Контакты'")
    void contactsPageTest() {
        mainPage.openPage().clickContactsSection();
        contactsPage.checkContactsHeaderText("Контакты");
    }

}
