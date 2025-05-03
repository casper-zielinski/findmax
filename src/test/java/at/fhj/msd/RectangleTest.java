package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

}
