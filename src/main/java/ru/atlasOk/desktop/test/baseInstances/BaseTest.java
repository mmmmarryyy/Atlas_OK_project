package ru.atlasOk.desktop.test.baseInstances;

import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.atlasOk.desktop.pages.baseInstances.BaseSite;

import static ru.atlasOk.consts.Consts.BASE_URL;

public class BaseTest {
    public ChromeDriver driver;
    public BaseSite site;

    @BeforeEach
    public void setUp() {
        System.out.println("driver open");
        driver = new ChromeDriver();
        Atlas atlas = new Atlas(new WebDriverConfiguration(driver, BASE_URL));
        site = atlas.create(driver, BaseSite.class);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
        System.out.println("driver close");
    }
}
