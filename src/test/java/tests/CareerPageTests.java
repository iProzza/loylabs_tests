package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Tag("WEB")
@Owner("@Azkeww")
@DisplayName("Тесты для страницы 'Карьера'")
public class CareerPageTests extends BaseTest {

    MainPage mainPage = new MainPage();
    CareerPage careerPage = new CareerPage();

    @BeforeEach
    public void openPage() {
        mainPage.openMainPage();
        mainPage.clickCareerSection();
    }

    @Test
    @Tag("SMOKE")
    @Story("Позитивный тест")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка открытия страницы 'Карьера'")
    void careerPageTest() {
        careerPage.whatAwaitsYouBlockIsVisible();
        careerPage.employeeBonusesBlockIsVisible();
        careerPage.vacancyBlockIsVisible();
    }

    @Test
    @Tag("REGRESSION")
    @Story("Позитивный тест")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверяем наличие формы 'Не нашли вакансию?' на странице")
    void sendVacancyFormShouldBeExistTest() {
        careerPage.clickSendResumeBtn();
        careerPage.sendResumeFormIsVisible();
    }
}
