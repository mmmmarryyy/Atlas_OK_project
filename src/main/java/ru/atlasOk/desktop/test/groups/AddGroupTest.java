package ru.atlasOk.desktop.test.groups;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import ru.atlasOk.desktop.test.baseInstances.BaseTestWithLogin;

import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;
import static ru.yandex.qatools.matchers.webdriver.TextMatcher.text;

@DisplayName("Groups")
public class AddGroupTest extends BaseTestWithLogin {
    public static final String EXPECTED_CONFIRMATION_MESSAGE = "Вы в группе";

    @Test
    @DisplayName("Check can add group")
    public void testAddGroup() {
        site.onMainPage().groupsButton().waitUntil(displayed()).click();
        site.onGroupsPage().searchField().waitUntil(displayed()).sendKeys("Классные котики", Keys.RETURN);
        site.onGroupsPage().groupsCount().waitUntil(displayed());
        site.onGroupsPage().groups().get(0).findElement(By.xpath(".//*[@role='button']")).isDisplayed();
        site.onGroupsPage().groups().get(0).findElement(By.xpath(".//*[@role='button']")).click();

        site.onGroupsPage().confirmationMessage().should(text(EXPECTED_CONFIRMATION_MESSAGE));
    }

    @AfterEach
    @Override
    public void tearDown() {
        site.onGroupsPage().groups().get(0).findElement(By.xpath(".//*[@data-l='t,visit']")).click();
        site.onGroupPage().leaveDropdown().waitUntil(displayed()).click();
        site.onGroupPage().leaveButton().waitUntil(displayed()).click();
        site.onGroupPage().leaveConfirmButton().waitUntil(displayed()).click();
        super.tearDown();
    }
}
