package qaguru.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import qaguru.pages.*;

public class NewsTests extends TestBase {

    MainPage mainPage = new MainPage();
    NewsPage newsPage = new NewsPage();

    @Test
    @DisplayName("Открываем страницу Новости и видим заголовок Новости")
    void newsPageTest() {
        mainPage.openPage();
        mainPage.clickNewsSection();
        newsPage.checkNewsHeaderText("Новости");
    }
}
