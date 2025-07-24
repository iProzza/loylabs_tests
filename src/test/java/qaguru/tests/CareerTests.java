package qaguru.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import qaguru.pages.*;

public class CareerTests extends TestBase {

    MainPage mainPage = new MainPage();
    CareerPage careerPage = new CareerPage();

    @Test
    @DisplayName("Открываем страницу Карьера и проверяем наличие вакансий")
    void careerPageTest() {
        mainPage.openPage();
        mainPage.clickCareerSection();
        careerPage.checkVacancyListNotEmpty();
    }

}
