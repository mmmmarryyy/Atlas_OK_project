package ru.atlasOk.desktop.test.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.atlasOk.desktop.test.baseInstances.BaseTest;

import static ru.atlasOk.consts.Consts.PASSWORD;
import static ru.atlasOk.consts.Consts.USERNAME;
import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;
import static ru.yandex.qatools.matchers.webdriver.TextMatcher.text;

@DisplayName("Authorization")
public class LoginTest extends BaseTest {
    public static final String EXPECTED_USERNAME = USERNAME + " " + USERNAME;

    @DisplayName("Authorization check")
    @Test
    public void testCheckLogin() {
        site.onLoginPage().usernameField().waitUntil(displayed()).sendKeys(USERNAME);
        site.onLoginPage().passwordField().waitUntil(displayed()).sendKeys(PASSWORD);
        site.onLoginPage().loginButton().waitUntil(displayed()).click();

        site.onMainPage().userName().should(text(EXPECTED_USERNAME));
    }
}
