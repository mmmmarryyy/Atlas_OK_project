package ru.atlasOk.desktop.test.profile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.atlasOk.desktop.test.baseInstances.BaseTestWithLogin;

import static ru.atlasOk.consts.Consts.BASE_URL;
import static ru.atlasOk.consts.Consts.PROFILE_URL;
import static ru.atlasOk.consts.Consts.ID_URL;
import static ru.atlasOk.consts.Consts.FIRST;
import static ru.atlasOk.consts.Consts.SECOND;
import static ru.atlasOk.consts.Consts.THIRD;
import static ru.yandex.qatools.matchers.webdriver.TextMatcher.text;

@DisplayName("User page info")
public class BirthInfoTest extends BaseTestWithLogin {

    @DisplayName("Birth info")
    @Test
    public void checkBirthInfo() {
        site.onMainPage().open(BASE_URL + PROFILE_URL + ID_URL);

        site.onUserPage().selfInfo().textInstances().get(FIRST).span().should(text("Родилась"));
        site.onUserPage().selfInfo().textInstances().get(SECOND).span().should(text("Живет в"));
        site.onUserPage().selfInfo().textInstances().get(THIRD).should(text("Вся информация"));
    }
}
