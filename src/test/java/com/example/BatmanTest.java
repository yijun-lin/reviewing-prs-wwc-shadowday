// src/test/java/com/example/BatmanTest.java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BatmanTest {

    @Test
    void testSaveTheWorld() {
        Batman batman = new Batman("Bruce Wayne");
        assertNotNull(batman);
        assertEquals(batman.getClass(), Batman.class);
        batman.saveTheWorld();
    }

    @Test
    void testFly() {
        Batman batman = new Batman("Bruce Wayne");
        assertNotNull(batman);
        Exception exception = assertThrows(UnsupportedOperationException.class, batman::fly);
        assertEquals("Batman cannot fly.", exception.getMessage());
    }
}
