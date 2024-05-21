package ru.atlasOk.desktop.pages.baseInstances;

import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;
import ru.atlasOk.desktop.pages.LoginPage;
import ru.atlasOk.desktop.pages.MainPage;
import ru.atlasOk.desktop.pages.NotesPage;
import ru.atlasOk.desktop.pages.UserPage;
import ru.atlasOk.desktop.pages.FriendsPage;
import ru.atlasOk.desktop.pages.GroupsPage;
import ru.atlasOk.desktop.pages.GroupPage;
import ru.atlasOk.desktop.pages.AboutPage;


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
    NotesPage onNotesPage();

    @Page
    GroupsPage onGroupsPage();

    @Page
    GroupPage onGroupPage();

    @Page
    AboutPage onAboutPage();

    default String getUrl() {
       return getWrappedDriver().getCurrentUrl();
    }
}
