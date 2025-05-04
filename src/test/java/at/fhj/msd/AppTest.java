package at.fhj.msd;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static at.fhj.msd.App.max;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static at.fhj.msd.App.maxP;

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
    List<Person> PerTest;

    @BeforeEach
    public void setup()
    {
        TextTest = new ArrayList<>();
        NumTest = new ArrayList<>();
        PerTest = new ArrayList<>();
        TextTest.add(last);
        TextTest.add(first);
        NumTest.add(a);
        NumTest.add(b);
        PerTest.add(new Person(20, "Zack"));
        PerTest.add(new Person(33, "Aaron"));
        PerTest.add(new Person(25, "Zeke"));
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
    @DisplayName("Constructor Test")
    void AppConstructorTest()
    {
        App app = new App();
        assertEquals(app, app);
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
    @DisplayName("max method Test with List")
    void MaxListTest(){
        NumTest.add(10);
        NumTest.add(4);
        assertEquals(10, max(NumTest));
    }

    @Test
    @DisplayName("maxP method Test")
    void MaxPersonTest(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        System.out.println(maxP(PerTest));

        String printed = output.toString().trim();
        assertEquals("Aaron is 33 years old", printed);

    }

    @Test
    @DisplayName("maxP method Test with same Ages")
    void MaxsamePersonTest(){
        List<Person> same = new ArrayList<>();
        same.add(new Person(a, first));
        same.add(new Person(a, first));
        //Declraration of output
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        //The Output
        System.out.println(maxP(same));
        //Captures what is printed
        String content = output.toString().trim();

        assertEquals("aal is 1 years old", content);
    }
}
