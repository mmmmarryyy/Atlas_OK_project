package ru.atlasOk.desktop.test.authorization;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.atlasOk.desktop.test.baseInstances.BaseTest;

import static ru.atlasOk.consts.Consts.PASSWORD;
import static ru.atlasOk.consts.Consts.USERNAME;

public class LoginTest extends BaseTest {
    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        site.onLoginPage().open();
    }

    @Test
    public void testCheckLogin() {
        site.onLoginPage().usernameField().sendKeys(USERNAME);
        site.onLoginPage().passwordField().sendKeys(PASSWORD);
        site.onLoginPage().loginButton().click();
    }
}
