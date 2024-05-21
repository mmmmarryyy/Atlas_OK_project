package ru.atlasOk.desktop.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;
import ru.atlasOk.desktop.elements.MusicPopup;
import ru.atlasOk.desktop.elements.NavigationBar;
import ru.atlasOk.desktop.elements.UserCardPopup;
import ru.atlasOk.desktop.elements.VKServicePopup;

public interface MainPage extends WebPage {
    @Name("Name of current user")
    @FindBy(".//*[@data-l='t,userPage']")
    AtlasWebElement userName();

    @Name("Navigation toolbar")
    @FindBy("//div[@data-l='t,navigationToolbar']")
    NavigationBar navigationBar();

    @Name("VK services popup")
    @FindBy("//div[@class='vk_ecosystem_cnt']")
    VKServicePopup vkServicesPopup();

    @Name("User card button")
    @FindBy(".//*[contains(@class, 'toolbar_ucard')]")
    AtlasWebElement userCardButton();

    @Name("User card")
    @FindBy(".//*[@id='user-dropdown-menu']")
    UserCardPopup userCard();

    @Name("Groups page button")
    @FindBy(".//*[@data-l='t,userAltGroup']")
    AtlasWebElement groupsButton();

    @Name("Friends page button")
    @FindBy(".//*[@data-l='t,userFriend']")
    AtlasWebElement friendsButton();

    @Name("Music popup")
    @FindBy("//*[@id='music_layer']")
    MusicPopup musicPopup();
}
