package ru.atlasOk.desktop.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface LoginPage extends WebPage {
    @FindBy(".//*[@id='field_email']")
    AtlasWebElement usernameField();

    @FindBy(".//*[@id='field_password']")
    AtlasWebElement passwordField();

    @FindBy(".//input[@type='submit']")
    AtlasWebElement loginButton();
}
