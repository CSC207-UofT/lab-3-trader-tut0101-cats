/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ReindeerTest {
    Reindeer r;

    @Before
    public void setUp() throws Exception {
        r = new Reindeer();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Reindeer noise!", r.sound());
    }
    
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(3, r.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        r.upgradeSpeed();
        assertEquals(4, r.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        r.downgradeSpeed();
        assertEquals(2, r.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(30, r.getPrice());
    }

}