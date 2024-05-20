package ru.atlasOk.desktop.test.baseInstances;

import io.qameta.allure.Step;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.atlasOk.desktop.pages.baseInstances.BasePage;

import static ru.atlasOk.consts.Consts.*;
import static ru.atlasOk.desktop.test.authorization.LoginTest.EXPECTED_USERNAME;
import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;
import static ru.yandex.qatools.matchers.webdriver.TextMatcher.text;

public class BaseTest {
    ChromeDriver driver;
    public BasePage site;

    @Step("Opening driver...")
    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        Atlas atlas = new Atlas(new WebDriverConfiguration(driver, BASE_URL));
        site = atlas.create(driver, BasePage.class);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Closing Webdriver...");
        driver.close();
    }

    public void login(String login, String password) {
        site.onLoginPage().open();
        site.onLoginPage().usernameField().waitUntil(displayed()).sendKeys(login);
        site.onLoginPage().passwordField().waitUntil(displayed()).sendKeys(password);
        site.onLoginPage().loginButton().waitUntil(displayed()).click();
    }
}
