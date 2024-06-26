package ru.atlasOk.desktop.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;
import ru.atlasOk.desktop.elements.SelfInfoSection;

public interface UserPage extends WebPage {
    @Name("Button to remove friend request")
    @FindBy(".//*[contains(@class,'toggle-dropdown') and contains(@class,'button-clear')]")
    AtlasWebElement removeFriendRequestButton();

    @Name("Leave group confirm button")
    @FindBy(".//*[@aria-label='Отменить запрос']")
    AtlasWebElement removeFriendRequestConfirmButton();

    @Name("Self infromation section")
    @FindBy("//div[@id='hook_Block_AboutUserRB']")
    SelfInfoSection selfInfo();
}
