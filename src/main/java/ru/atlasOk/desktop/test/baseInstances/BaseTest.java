package ru.atlasOk.desktop.test.baseInstances;

import io.qameta.allure.Step;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.atlasOk.desktop.pages.baseInstances.BaseSite;

import static ru.atlasOk.consts.Consts.*;
import static ru.yandex.qatools.matchers.webdriver.TextMatcher.text;

public class BaseTest {
    ChromeDriver driver;
    public BaseSite site;

    @Step("Opening driver...")
    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        Atlas atlas = new Atlas(new WebDriverConfiguration(driver, BASE_URL));
        site = atlas.create(driver, BaseSite.class);
        site.onLoginPage().open();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Closing Webdriver...");
        driver.close();
    }
}
