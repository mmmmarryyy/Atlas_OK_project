package ru.atlasOk.desktop.pages.baseInstances;

import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;
import ru.atlasOk.desktop.pages.*;

public interface BaseSite extends WebSite {
    @Page
    LoginPage onLoginPage();

    @Page
    MainPage onMainPage();

    @Page
    FriendsPage onFriendsPage();

    @Page
    UserPage onUserPage();

    @Page
    GroupsPage onGroupsPage();

    @Page
    GroupPage onGroupPage();

}
