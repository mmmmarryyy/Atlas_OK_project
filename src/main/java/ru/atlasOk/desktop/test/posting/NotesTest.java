package ru.atlasOk.desktop.test.posting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.atlasOk.desktop.test.baseInstances.BaseTest;
import ru.atlasOk.desktop.test.baseInstances.BaseTestWithLogin;

import static ru.atlasOk.consts.Consts.*;
import static ru.atlasOk.desktop.pages.NotesPage.EMPTY_POSTS_TEXT;
import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;
import static ru.yandex.qatools.matchers.webdriver.TextMatcher.text;

@DisplayName("Notes in profile")
public class NotesTest extends BaseTestWithLogin {

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
    }

    @DisplayName("Creating and deleting posts")
    @Test
    public void manageTextPosts() {
        site.onNotesPage().open(BASE_URL + PROFILE_URL + ID_URL + STATUSES_URL);
        site.onNotesPage().posting().waitUntil(displayed()).click();
        site.onNotesPage().postingMenu().textBox().waitUntil(displayed()).sendKeys(USERNAME);
        site.onNotesPage().postingMenu().submitPost().click();
        site.onNotesPage().posts().get(FIRST).text().should(text(USERNAME));
        deletePost();
    }

    private void deletePost(){
        site.onNotesPage().open(BASE_URL + PROFILE_URL + ID_URL + STATUSES_URL);
        site.onNotesPage().actions().waitUntil(displayed()).click();
        site.onNotesPage().delete().waitUntil(displayed()).click();
        site.onNotesPage().open(BASE_URL + PROFILE_URL + ID_URL + STATUSES_URL);
        site.onNotesPage().divText(EMPTY_POSTS_TEXT).should(displayed());
    }
}