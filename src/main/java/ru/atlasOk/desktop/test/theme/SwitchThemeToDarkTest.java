package ru.atlasOk.desktop.test.theme;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.atlasOk.desktop.test.baseInstances.BaseTestWithLogin;

import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;

@DisplayName("Theme")
public class SwitchThemeToDarkTest extends BaseTestWithLogin {
    public static final String EXPECTED_THEME = "Тема: Тёмная";

    @Test
    @DisplayName("Check can switch theme to dark")
    public void testSwitchToDarkTheme() {
        site.onMainPage().userCard().waitUntil(displayed()).click();
        site.onMainPage().themeSwitcherButton().waitUntil(displayed()).click();
        site.onMainPage().darkThemeButton().waitUntil(displayed()).click();
        site.onMainPage().userCard().waitUntil(displayed()).click();

        site.onMainPage().theme().waitUntil(displayed()).getText().equals(EXPECTED_THEME);
    }

    @AfterEach
    @Override
    public void tearDown() {
        site.onMainPage().userCard().waitUntil(displayed()).click();
        site.onMainPage().themeSwitcherButton().waitUntil(displayed()).click();
        site.onMainPage().lightThemeButton().waitUntil(displayed()).click();
        super.tearDown();
    }
}
