package ru.atlasOk.desktop.test.authorization;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import ru.atlasOk.desktop.test.baseInstances.BaseTest;

import static ru.atlasOk.consts.Consts.PASSWORD;
import static ru.atlasOk.consts.Consts.USERNAME;
import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;
import static ru.yandex.qatools.matchers.webdriver.TextMatcher.text;

@DisplayName("Authorization")
public class LoginWithWrongParamsTest extends BaseTest {
    private static final String errorMessage = "Неправильно указан логин и/или пароль";
    private static final String usernameErrorMessage = "Введите логин";
    private static final String passwordErrorMessage = "Введите пароль";

    enum LoginWrongParams {
        WRONG_USERNAME_CORRECT_PASSWORD("1" + USERNAME, PASSWORD, errorMessage),
        CORRECT_USERNAME_WRONG_PASSWORD(USERNAME, "1" + PASSWORD, errorMessage),
        WRONG_USERNAME_WRONG_PASSWORD("1" + USERNAME, "1" + PASSWORD, errorMessage),
        EMPTY_USERNAME_CORRECT_PASSWORD("", PASSWORD, usernameErrorMessage),
        EMPTY_PASSWORD_CORRECT_PASSWORD(USERNAME, "", passwordErrorMessage);

        private final String usernameInput;
        private final String passwordInput;
        private final String expectedErrorMessage;

        LoginWrongParams(String usernameInput, String passwordInput, String expectedErrorMessage) {
            this.usernameInput = usernameInput;
            this.passwordInput = passwordInput;
            this.expectedErrorMessage = expectedErrorMessage;
        }

        public String getUsernameInput() {
            return usernameInput;
        }

        public String getPasswordInput() {
            return passwordInput;
        }

        public String getExpectedErrorMessage() {
            return expectedErrorMessage;
        }
    }

    @ParameterizedTest(name = "{index} - test case: {0}")
    @EnumSource(LoginWrongParams.class)
    @DisplayName("Check can't login with incorrect data")
    public void testCheckWrongLogin(LoginWrongParams params) {
        site.onLoginPage().usernameField().waitUntil(displayed()).sendKeys(params.getUsernameInput());
        site.onLoginPage().passwordField().waitUntil(displayed()).sendKeys(params.getPasswordInput());
        site.onLoginPage().loginButton().waitUntil(displayed()).click();

        site.onLoginPage().errorMessage().should(text(params.getExpectedErrorMessage()));
    }
}
