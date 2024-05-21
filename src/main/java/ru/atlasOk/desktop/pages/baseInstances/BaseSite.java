package ru.atlasOk.desktop.pages.baseInstances;

import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;
import ru.atlasOk.desktop.pages.LoginPage;
import ru.atlasOk.desktop.pages.MainPage;
import ru.atlasOk.desktop.pages.NotesPage;
import ru.atlasOk.desktop.pages.UserPage;

public interface BaseSite extends WebSite {
    @Page
    LoginPage onLoginPage();

    @Page
    MainPage onMainPage();

    @Page
    UserPage onUserPage();

    @Page
    NotesPage onNotesPage();
}
