package ru.atlasOk.desktop.test.authorization;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import ru.atlasOk.desktop.test.baseInstances.BaseTest;


public class LoginTest extends BaseTest {
    @BeforeEach
    @Override
    public void setUp() {
        System.out.println("setup");
        super.setUp();
    }

    @Test
    public void testCheckLogin() {
        System.out.printf("hello");
    }

    @Test
    public void testCheckLogin2() {
        System.out.printf("hello2");
    }
}
