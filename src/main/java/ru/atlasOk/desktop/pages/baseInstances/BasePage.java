package ru.atlasOk.desktop.pages.baseInstances;

import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;
import ru.atlasOk.desktop.pages.LoginPage;
import ru.atlasOk.desktop.pages.MainPage;

public interface BasePage extends WebSite {
    @Page
    LoginPage onLoginPage();

    @Page
    MainPage onMainPage();
}
