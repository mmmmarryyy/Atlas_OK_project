package ru.atlasOk.desktop.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;

public interface MainPage extends WebPage {
    @Name("Name of current user")
    @FindBy(".//*[@data-l='t,userPage']")
    AtlasWebElement userName();
}
