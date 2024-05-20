package ru.atlasOk.desktop.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;
import ru.atlasOk.desktop.elements.NavigationBar;
import ru.atlasOk.desktop.elements.VKServicePopup;

public interface MainPage extends WebPage {
    @Name("Name of current user")
    @FindBy(".//*[@data-l='t,userPage']")
    AtlasWebElement userName();

    @Name("User page navigator")
    @FindBy(".//*[@data-l= 't,userPage' ]//div")
    AtlasWebElement userPageNavigator();

    @Name("Navigation toolbar")
    @FindBy("//div[@data-l='t,navigationToolbar']")
    NavigationBar navigationBar();

    @Name("VK services popup")
    @FindBy("//div[@class='vk_ecosystem_cnt']")
    VKServicePopup vkServicesPopup();
}
