package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SuperHeroTest {

    @Test
    void testSaveTheWorld() {
        SuperHero batman = new SuperHero("Batman");
        assertNotNull(batman);
        assertEquals(batman.getClass(), SuperHero.class);
    }
}
