package app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {

    Ion ion1 = new IonInfo("H+", 1.00794, 1);
    Ion ion2 = new IonInfo("NO3-", 62.0049, -1);
    Compound compound = new CreateCompound(null, 0);
    
    @Test
    public void test1() {
        assertEquals("H+", ion1.getName());
    }

    @Test
    public void test2() {
        assertEquals(1.00794, ion1.getAtomicMass(), 0.01);
    }

    @Test
    public void test3() {
        assertEquals(1, ion1.getCharge());
    }

    @Test
    public void test4() {
        assertEquals("NO3-", ion2.getName());
    }

    @Test
    public void test5() {
        assertEquals(62.0049, ion2.getAtomicMass(), 0.01);
    }

    @Test
    public void test6() {
        assertEquals(-1, ion2.getCharge());
    }

    @Test
    public void test7() {
        assertEquals("H+NO3-", ion1.getName());
    }
}