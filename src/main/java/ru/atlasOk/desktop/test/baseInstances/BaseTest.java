package ru.atlasOk.desktop.test.baseInstances;

import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.atlasOk.desktop.pages.baseInstances.BasePage;

import static ru.atlasOk.consts.Consts.BASE_URL;

public class BaseTest {
    ChromeDriver driver;

    @BeforeEach
    public void setUp() {
        System.out.println("driver open");
        driver = new ChromeDriver();
        Atlas atlas = new Atlas(new WebDriverConfiguration(driver, BASE_URL));
        BasePage site = atlas.create(driver, BasePage.class);
        site.mainPage().open();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("driver close");
        driver.close();
    }
}
