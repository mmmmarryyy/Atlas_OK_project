package ru.atlasOk.desktop.test.VKServices;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.atlasOk.desktop.test.baseInstances.BaseTestWithLogin;

import static ru.atlasOk.desktop.elements.NavigationBar.VK_SERVICES;
import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;

@DisplayName("VK services popup")
public class VKServicesTest extends BaseTestWithLogin {

    @DisplayName("Check if service names are being displayed")
    @Test
    public void seeServiceNames() {
        site.onMainPage().navigationBar().buttonLabel(VK_SERVICES).waitUntil(displayed()).click();
        site.onMainPage().vkServicesPopup().services().forEach(service -> {
            service.name().should(displayed());
        });
    }
}
