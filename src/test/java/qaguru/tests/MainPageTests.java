package qaguru.tests;

import org.junit.jupiter.api.*;
import qaguru.pages.*;

import static io.qameta.allure.Allure.step;

@Tag("WEB")
public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();

    @BeforeEach
    public void openPage() {
        step("Открываем главную страницу", () -> mainPage.openPage());
    }

    @Test
    @Tag("SMOKE")
    @DisplayName("Проверка открытия главной страницы")
    void mainPageTest() {
        step("Проверяем видимость логотипа компании", () -> mainPage.checkLogoIsVisible());
        step("Проверяем наличия блока 'Новости'", () -> mainPage.checkNewsBlockIsVisible());
    }

    @Test
    @Tag("NEGATIVE")
    @DisplayName("Проверка отправки формы 'Расскажите нам о своей задаче' без заполнения полей")
    void unSuccessfulFormSendTest() {
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
