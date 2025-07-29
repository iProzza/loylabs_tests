package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import pages.*;

import static io.qameta.allure.Allure.step;

@Tag("WEB")
@DisplayName("Тесты для главной страницы")
public class MainPageTests extends BaseTest {

    MainPage mainPage = new MainPage();

    @BeforeEach
    public void openPage() {
        step("Открываем главную страницу", () -> mainPage.openPage());
    }

    @Test
    @Tag("SMOKE")
    @Story("Позитивный тест")
    @Owner("@Azkeww")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка открытия главной страницы")
    void mainPageTest() {
        step("Проверяем видимость логотипа компании", () -> mainPage.checkLogoIsVisible());
        step("Проверяем наличия блока 'Новости'", () -> mainPage.checkNewsBlockIsVisible());
    }

    @Test
    @Tag("NEGATIVE")
    @Story("Негативный тест")
    @Owner("@Azkeww")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка отправки формы 'Расскажите нам о своей задаче' без заполнения полей")
    void unSuccessfulFormSendTest() {
        step("Нажимаем на кнопку 'Пригласить в тендер'", () -> mainPage.clickTenderBtn());
        step("Нажимаем на кнопку 'Отправить'", () -> mainPage.clickSubmitFormBtn());
        step("Проверяем сообщения об ошибках для обязательных полей", () -> {
                    mainPage.checkErrorMessagesForFields("Не оставляйте описание пустым");
                    mainPage.checkErrorMessagesForFields("Как к Вам обращаться?");
                    mainPage.checkErrorMessagesForFields("Оставьте свой номер телефона");
                    mainPage.checkErrorMessagesForFields("Введите корректный E-mail");
                }
        );
    }

}
