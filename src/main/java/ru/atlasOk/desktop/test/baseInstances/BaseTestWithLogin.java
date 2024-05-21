package ru.atlasOk.desktop.test.baseInstances;

import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.atlasOk.desktop.pages.baseInstances.BaseSite;

import static ru.atlasOk.consts.Consts.BASE_URL;
import static ru.atlasOk.consts.Consts.USERNAME;
import static ru.atlasOk.consts.Consts.PASSWORD;
import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;

public class BaseTestWithLogin {
    ChromeDriver driver;
    public BaseSite site;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        Atlas atlas = new Atlas(new WebDriverConfiguration(driver, BASE_URL));
        site = atlas.create(driver, BaseSite.class);
        site.onLoginPage().open();
        site.onLoginPage().usernameField().waitUntil(displayed()).sendKeys(USERNAME);
        site.onLoginPage().passwordField().waitUntil(displayed()).sendKeys(PASSWORD);
        site.onLoginPage().loginButton().waitUntil(displayed()).click();
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }
}
