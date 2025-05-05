package at.fhj.msd;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


public class RectangleTest {
      Rectangle rect;

      @BeforeEach
      public void setup()
      {
            rect = new Rectangle(2, 2);
      }

      @Test
      @DisplayName("calc Area Test")
      void CalcAreaTest()
      {
            assertEquals(4, rect.calcArea());
      }

      @Test
      @DisplayName("toString Test")
      void toStringTest()
      {
            assertEquals("2,0 x 2,0", rect.toString());
      }

      @Test
      @DisplayName("compareTo Test")
      void compareToTest()
      {
            Rectangle r1 = new Rectangle(3, 4);
            Rectangle r2 = new Rectangle(2, 7);
            Rectangle r3 = new Rectangle(4, 7);
            Rectangle r4 = new Rectangle(20, 7);
            Rectangle r5 = new Rectangle(20, 7);
            List<Rectangle> list = new ArrayList<>();
            list.add(rect);
            list.add(r1);
            list.add(r2);
            list.add(r3);
            list.add(r4);
            list.add(r5);
            list.sort(new RectangleComparable());
            assertEquals(rect, list.get(0));
            Rectangle r6 = new Rectangle(1, 1);
            list.add(r6);
            list.sort(new RectangleComparable());
            assertEquals(r6, list.get(0));
      }

}
