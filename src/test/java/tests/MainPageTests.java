package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import pages.*;

@Tag("WEB")
@Owner("@Azkeww")
@DisplayName("Тесты для главной страницы")
public class MainPageTests extends BaseTest {

    MainPage mainPage = new MainPage();

    @BeforeEach
    public void openPage() {
        mainPage.openMainPage();
    }

    @Test
    @Tag("SMOKE")
    @Story("Позитивный тест")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка открытия главной страницы")
    void mainPageTest() {
        mainPage.checkLogoIsVisible();
        mainPage.checkNewsBlockIsVisible();
    }

    @Test
    @Tag("NEGATIVE")
    @Story("Негативный тест")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка отправки формы 'Расскажите нам о своей задаче' без заполнения полей")
    void unSuccessfulFormSendTest() {
        mainPage.clickTenderBtn();
        mainPage.clickSubmitFormBtn();
        mainPage.checkErrorMessagesForFields("Не оставляйте описание пустым");
        mainPage.checkErrorMessagesForFields("Как к Вам обращаться?");
        mainPage.checkErrorMessagesForFields("Оставьте свой номер телефона");
        mainPage.checkErrorMessagesForFields("Введите корректный E-mail");
    }
}
