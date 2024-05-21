package ru.atlasOk.desktop.test.friends;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import ru.atlasOk.desktop.test.baseInstances.BaseTestWithLogin;

import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;

@DisplayName("Friends")
public class AddFriendTest extends BaseTestWithLogin {
    public static final String FRIEND_USERNAME = "technopol70 technopol70";
    public static final String EXPECTED_CONFIRMATION_MESSAGE = "Запрос отправлен";

    @Test
    @DisplayName("Check can add group")
    public void testAddGroup() {
        site.onMainPage().friendsButton().waitUntil(displayed()).click();
        site.onFriendsPage().searchField().waitUntil(displayed()).sendKeys(FRIEND_USERNAME, Keys.RETURN);
        site.onFriendsPage().searchResultHeader().waitUntil(displayed());
        site.onFriendsPage().people().get(0).findElement(By.xpath(".//span[contains(., 'Добавить в друзья')]")).click();

        site.onFriendsPage().people().get(0).findElement(By.xpath(".//*[contains(@class,'lstp-t')]")).getText().equals(EXPECTED_CONFIRMATION_MESSAGE);
    }

    @AfterEach
    @Override
    public void tearDown() {
        site.onFriendsPage().people().get(0).findElement(By.xpath(".//*[contains(@class,'sult_i_t_name')]")).click();
        site.onUserPage().removeFriendRequestButton().waitUntil(displayed()).click();
        site.onUserPage().removeFriendRequestConfirmButton().waitUntil(displayed()).click();
        super.tearDown();
    }
}
