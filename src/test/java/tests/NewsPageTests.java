package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

import static io.qameta.allure.Allure.step;

@Tag("WEB")
public class NewsPageTests extends BaseTest {

    MainPage mainPage = new MainPage();
    NewsPage newsPage = new NewsPage();

    @BeforeEach
    public void openPage() {
        step("Открываем главную страницу", () -> mainPage.openPage());
        step("Переходим в раздел 'Новости' ", () -> mainPage.clickNewsSection());
    }

    @Test
    @Tag("SMOKE")
    @Story("Позитивный тест")
    @Owner("@Azkeww")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка открытия страницы 'Новости'")
    void newsPageTest() {
        newsPage.checkNewsHeaderText("Новости");
        step("Проверяем заголовок 'Кейсы' ", () -> newsPage.checkNewsHeaderText("Новости"));
    }

    @Test
    @Tag("REGRESSION")
    @Story("Позитивный тест")
    @Owner("@Azkeww")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверяем, что список новостей не пустой")
    void newsListShouldNotEmptyTest() {
        newsPage.checkNewsHeaderText("Новости");
        step("Проверяем заголовок 'Кейсы' ", () -> newsPage.checkNewsListNotEmpty());
    }
}
