package ru.atlasOk.desktop.test.profile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.atlasOk.desktop.test.baseInstances.BaseTestWithLogin;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static ru.atlasOk.consts.Consts.BASE_URL;
import static ru.atlasOk.consts.Consts.PROFILE_URL;
import static ru.atlasOk.consts.Consts.ID_URL;
import static ru.atlasOk.consts.Consts.ABOUT_URL;
import static ru.atlasOk.desktop.pages.AboutPage.OTHER_PROFILES;
import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;

@DisplayName("Additional user info")
public class UserAboutUrlTest extends BaseTestWithLogin {

    @DisplayName("Check user about url")
    @Test
    public void checkUrlAbout() {
        site.onMainPage().open(BASE_URL + PROFILE_URL + ID_URL);
        site.onUserPage().selfInfo().textInstances().get(2).waitUntil(displayed()).click();
        site.onAboutPage().div(OTHER_PROFILES).waitUntil(displayed());

        assertThat(site.getUrl(), containsString(BASE_URL + PROFILE_URL + ID_URL + ABOUT_URL));
    }
}
