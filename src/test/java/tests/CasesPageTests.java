package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Tag("WEB")
@Owner("@Azkeww")
@DisplayName("Тесты для страницы 'Кейсы'")
public class CasesPageTests extends BaseTest {

    MainPage mainPage = new MainPage();
    CasesPage casesPage = new CasesPage();

    @BeforeEach
    public void openPage() {
        mainPage.openMainPage();
        mainPage.clickCasesSection();
    }

    @Test
    @Tag("SMOKE")
    @Story("Позитивный тест")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка открытия страницы 'Кейсы'")
    void casesPageTest() {
        casesPage.checkCasesHeaderText("Кейсы");
    }

    @Test
    @Tag("REGRESSION")
    @Story("Позитивный тест")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка фильтрации баннеров")
    void filtrationBannersTest() {
        casesPage.clickLoyaltyProgramToggleBtn();
        casesPage.checkBannersFiltration("Программа лояльности");
    }
}
