// src/test/java/com/example/SupermanTest.java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SupermanTest {

    @Test
    void testSaveTheWorld() {
        Superman superman = new Superman("Clark Kent");
        assertNotNull(superman);
        assertEquals(superman.getClass(), Superman.class);
        superman.saveTheWorld();
    }

    @Test
    void testFly() {
        Superman superman = new Superman("Clark Kent");
        assertNotNull(superman);
        superman.fly();
    }
}
