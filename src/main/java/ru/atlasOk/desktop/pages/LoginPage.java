package ru.atlasOk.desktop.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;

public interface LoginPage extends WebPage {
    @Name("Field to enter login")
    @FindBy(".//*[@id='field_email']")
    AtlasWebElement usernameField();

    @Name("Field to enter username")
    @FindBy(".//*[@id='field_password']")
    AtlasWebElement passwordField();

    @Name("Login button")
    @FindBy(".//input[@type='submit']")
    AtlasWebElement loginButton();

    @Name("Error message displayed when can't login")
    @FindBy(".//*[contains(@class,'login_error')]")
    AtlasWebElement errorMessage();
}
