package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SupermanTest {

    @Test
    void testSaveTheWorld() {
        Superman superman = new Superman("Clark Kent");

        assertNotNull(superman);

        assertEquals(superman.getClass(), Superman.class);
    }

    @Test
    void testTeachAboutSolarPower() {
        Superman superman = new Superman("Clark Kent");assertNotNull(superman);

        superman.teachAboutSolarPower();
    }

    @Test
    void testSuperHeroReplacedWithSuperman() {
        SuperHero hero = new SuperHero("Generic Hero");

        assertThrows(ClassCastException.class, () -> {
            ((Superman)hero).teachAboutSolarPower();
        });
    }
}
