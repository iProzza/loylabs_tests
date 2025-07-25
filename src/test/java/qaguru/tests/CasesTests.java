package qaguru.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import qaguru.pages.*;

import static io.qameta.allure.Allure.step;

@Tag("WEB")
public class CasesTests extends TestBase {

    MainPage mainPage = new MainPage();
    CasesPage casesPage = new CasesPage();

    @BeforeEach
    public void openPage() {
        step("Открываем главную страницу", () -> mainPage.openPage());
        step("Переходим в раздел 'Кейсы' ", () -> mainPage.clickCasesSection());
    }

    @Test
    @Tag("SMOKE")
    @DisplayName("Проверка открытия страницы 'Кейсы'")
    void casesPageTest() {
        step("Проверяем заголовок 'Кейсы' ", () -> casesPage.checkCasesHeaderText("Кейсы"));
    }

    @Test
    @Tag("REGRESSION")
    @DisplayName("Проверка фильтрации баннеров")
    void filtrationBannersTest() {
        step("Выбираем фильтр 'Программа лояльности' ", () -> casesPage.clickLoyaltyProgramToggleBtn());
        step("Проверяем фильтрацию 'Программа лояльности' ", () -> casesPage.checkBannersFiltration("Программа лояльности"));
    }
}
