package at.fhj.msd;

import java.util.ArrayList;

import static at.fhj.msd.App.max;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    int a = 1;
    int b = 2;
    String first = "aal";
    String last = "zebra";
    List<String> TextTest;
    List<Integer> NumTest;

    @BeforeEach
    public void setup()
    {
        TextTest = new ArrayList<>();
        NumTest = new ArrayList<>();
        TextTest.add(last);
        TextTest.add(first);
        NumTest.add(a);
        NumTest.add(b);
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    @DisplayName(" main Method test")
    void mainTest()
    {
        String[] args = null;
        App.main(args);
    }

    @Test
    @DisplayName("max method Test with 2 Parameters")
    void maxTest(){
        assertEquals(2, max(a,b));
        assertEquals(2, max (b,a));
        assertEquals("zebra", max(first, last));
        assertEquals(null, max(a,a));
    }

    @Test
    @DisplayName()
}
