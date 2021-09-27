/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DogTest {
    Dog d;

    @Before
    public void setUp() throws Exception {
        d = new Dog();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Woof!", d.sound());
    }


    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(15, d.getPrice());
    }

}