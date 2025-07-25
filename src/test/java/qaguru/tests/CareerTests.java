package qaguru.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import qaguru.pages.*;

import static io.qameta.allure.Allure.step;

@Tag("WEB")
public class CareerTests extends TestBase {

    MainPage mainPage = new MainPage();
    CareerPage careerPage = new CareerPage();

    @BeforeEach
    public void openPage() {
        step("Открываем главную страницу", () -> mainPage.openPage());
        step("Переходим в раздел 'Карьера' ", () -> mainPage.clickCareerSection());
    }

    @Test
    @Tag("SMOKE")
    @DisplayName("Проверка открытия страницы 'Карьера'")
    void careerPageTest() {
        step("Проверяем наличия блока 'Что вас ждет'", () -> careerPage.checkWhatAwaitsYouBlockIsVisible());
        step("Проверяем наличия блока 'Бонусы для сотрудников'", () -> careerPage.checkEmployeeBonusesBlockIsVisible());
        step("Проверяем наличия блока 'Вакансии'", () -> careerPage.checkVacancyBlockIsVisible());
    }

    @Test
    @Tag("REGRESSION")
    @DisplayName("Проверяем, что список вакансий не пустой")
    void vacancyListShouldNoteBeEmptyTest() {
        step("Проверяем, что список вакансий не пустой ", () -> careerPage.checkVacancyListNotEmpty());
    }
}
