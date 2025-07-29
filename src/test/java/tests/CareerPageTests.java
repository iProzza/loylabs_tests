package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

import static io.qameta.allure.Allure.step;

@Tag("WEB")
@DisplayName("Тесты для страницы 'Карьера'")
public class CareerPageTests extends BaseTest {

    MainPage mainPage = new MainPage();
    CareerPage careerPage = new CareerPage();

    @BeforeEach
    public void openPage() {
        step("Открываем главную страницу", () -> mainPage.openPage());
        step("Переходим в раздел 'Карьера' ", () -> mainPage.clickCareerSection());
    }

    @Test
    @Tag("SMOKE")
    @Story("Позитивный тест")
    @Owner("@Azkeww")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка открытия страницы 'Карьера'")
    void careerPageTest() {
        step("Проверяем наличия блока 'Что вас ждет'", () -> careerPage.whatAwaitsYouBlockIsVisible());
        step("Проверяем наличия блока 'Бонусы для сотрудников'", () -> careerPage.employeeBonusesBlockIsVisible());
        step("Проверяем наличия блока 'Вакансии'", () -> careerPage.vacancyBlockIsVisible());
    }

    @Test
    @Tag("REGRESSION")
    @Story("Позитивный тест")
    @Owner("@Azkeww")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверяем наличие формы 'Не нашли вакансию?' на странице")
    void sendVacancyFormShouldBeExistTest() {
        step("Нажимаем на кнопку 'Отправить резюме'", () -> careerPage.clickSendResumeBtn());
        step("Проверяем, что форма 'Не нашли вакансию?' отображается", () -> careerPage.sendResumeFormIsVisible());
    }
}
