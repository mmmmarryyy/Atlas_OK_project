package ru.atlasOk.desktop.test.theme;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.atlasOk.desktop.test.baseInstances.BaseTestWithLogin;

import static org.hamcrest.Matchers.not;
import static ru.atlasOk.desktop.elements.UserCardPopup.THEME_SPAN_TEXT;
import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;
import static ru.yandex.qatools.matchers.webdriver.TextMatcher.text;

@DisplayName("Theme")
public class SwitchThemeToDarkTest extends BaseTestWithLogin {
    public static final String EXPECTED_THEME = "Тема: Тёмная";

    @Test
    @DisplayName("Check can switch theme to dark")
    public void testSwitchToDarkTheme() {
        site.onMainPage().userCardButton().waitUntil(displayed()).click();
        site.onMainPage().userCard().themeSwitcherButton().waitUntil(displayed()).click();
        site.onMainPage().userCard().themesPopup().darkThemeButton().waitUntil(displayed()).click();
        site.onMainPage().userCard().waitUntil(not(displayed()));
        site.onMainPage().userCardButton().waitUntil(displayed()).click();

        site.onMainPage().userCard().spanButton(THEME_SPAN_TEXT).should(text(EXPECTED_THEME));
    }

    @AfterEach
    @Override
    public void tearDown() {
        site.onMainPage().userCardButton().waitUntil(displayed()).click();
        site.onMainPage().userCard().themeSwitcherButton().waitUntil(displayed()).click();
        site.onMainPage().userCard().themesPopup().lightThemeButton().waitUntil(displayed()).click();
        super.tearDown();
    }
}
