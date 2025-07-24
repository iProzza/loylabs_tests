package qaguru.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import qaguru.pages.*;

public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @Tag("LoyLabs")
    @DisplayName("Проверка отображения логотипа компании")
    void logoShouldBeVisibleTest() {

        mainPage.openPage();

        mainPage.checkLogoIsVisible();
    }

    @Test
    @DisplayName("Проверка отправки формы 'Расскажите нам о своей задаче' без заполнения полей")
    void unSuccessfulFormSendTest(){

    }

}
