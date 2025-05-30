package qaguru.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import qaguru.pages.*;

@Tag("LoyLabs")
public class LoyLabsTests extends TestBase {

    private mainPage mainPage;
    private CasesPage casesPage;
    private NewsPage newsPage;
    private CareerPage careerPage;
    private ContactsPage contactsPage;

    @BeforeEach
    public void getPreconditions() {

        mainPage = new mainPage();
        casesPage = new CasesPage();
        newsPage = new NewsPage();
        careerPage = new CareerPage();
        contactsPage = new ContactsPage();
    }

    @Test
    @DisplayName("Проверка отображения логотипа компании")
    void logoShouldBeVisibleTest() {
        mainPage.openPage()
                .checkLogoIsVisible();
    }

    @Test
    @DisplayName("Открываем страницу Кейсы и отображается заголовок Кейсы")
    void casesPageTest() {
        mainPage.openPage().clickCasesSection();
        casesPage.checkCasesHeaderText("Кейсы");
    }

    @Test
    @DisplayName("Открываем страницу Новости и видим заголовок Новости")
    void newsPageTest() {
        mainPage.openPage().clickNewsSection();
        newsPage.checkNewsHeaderText("Новости");
    }

    @Test
    @DisplayName("Открываем страницу Карьера и проверяем наличие вакансий")
    void careerPageTest() {
        mainPage.openPage().clickCareerSection();
        careerPage.checkVacancyListNotEmpty();
    }

    @Test
    @DisplayName("Открываем страницу Кейсы и отображается заголовок Кейсы")
    void contactsPageTest() {
        mainPage.openPage().clickContactsSection();
        contactsPage.checkContactsHeaderText("Контакты");
    }

}
