package ru.atlasOk.desktop.test.posting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.atlasOk.desktop.test.baseInstances.BaseTestWithLogin;

import static ru.atlasOk.consts.Consts.BASE_URL;
import static ru.atlasOk.consts.Consts.PROFILE_URL;
import static ru.atlasOk.consts.Consts.ID_URL;
import static ru.atlasOk.consts.Consts.STATUSES_URL;
import static ru.atlasOk.consts.Consts.USERNAME;

import static ru.atlasOk.desktop.pages.NotesPage.EMPTY_POSTS_TEXT;
import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;
import static ru.yandex.qatools.matchers.webdriver.TextMatcher.text;

@DisplayName("Notes in profile")
public class NotesTest extends BaseTestWithLogin {

    @DisplayName("Creating post")
    @Test
    public void manageTextPosts() {
        site.onNotesPage().open(BASE_URL + PROFILE_URL + ID_URL + STATUSES_URL);
        site.onNotesPage().posting().waitUntil(displayed()).click();
        site.onNotesPage().postingMenu().textBox().waitUntil(displayed()).sendKeys(USERNAME);
        site.onNotesPage().postingMenu().submitPost().click();

        site.onNotesPage().posts().get(0).text().should(text(USERNAME));
    }

    @Override
    @AfterEach
    public void tearDown() {
        site.onNotesPage().open(BASE_URL + PROFILE_URL + ID_URL + STATUSES_URL);
        site.onNotesPage().actions().waitUntil(displayed()).click();
        site.onNotesPage().delete().waitUntil(displayed()).click();
        site.onNotesPage().open(BASE_URL + PROFILE_URL + ID_URL + STATUSES_URL);

        site.onNotesPage().divText(EMPTY_POSTS_TEXT).should(displayed());

        super.tearDown();
    }
}
