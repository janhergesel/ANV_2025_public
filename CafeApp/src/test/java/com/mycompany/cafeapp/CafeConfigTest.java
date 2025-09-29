package com.mycompany.cafeapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CafeConfigTest {

    @Test
    void testGetInstanceNotNull() {
        CafeConfig config = CafeConfig.getInstance();
        assertNotNull(config, "Instance should not be null");
    }

    @Test
    void testGetInstanceAlwaysSame() {
        CafeConfig config1 = CafeConfig.getInstance();
        CafeConfig config2 = CafeConfig.getInstance();
        assertSame(config1, config2, "Both calls should return the same instance");
    }

    @Test
    void testCafeNameIsCorrect() {
        CafeConfig config = CafeConfig.getInstance();
        assertEquals("Smart Café", config.getCafeName(), "Cafe name should match the expected value");
    }
}
