package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Tag("WEB")
@Owner("@Azkeww")
@DisplayName("Тесты для страницы 'Новости'")
public class NewsPageTests extends BaseTest {

    MainPage mainPage = new MainPage();
    NewsPage newsPage = new NewsPage();

    @BeforeEach
    public void openPage() {
        mainPage.openMainPage();
        mainPage.clickNewsSection();
    }

    @Test
    @Tag("SMOKE")
    @Story("Позитивный тест")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка открытия страницы 'Новости'")
    void newsPageTest() {
        newsPage.checkNewsHeaderText("Новости");
    }

    @Test
    @Tag("REGRESSION")
    @Story("Позитивный тест")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверяем, что список новостей не пустой")
    void newsListShouldNotEmptyTest() {
        newsPage.checkNewsListNotEmpty();
    }
}
