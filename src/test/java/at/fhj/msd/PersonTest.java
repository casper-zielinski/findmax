package at.fhj.msd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class PersonTest {
Person p = new Person(19, "Casper");
      
      @Test
      @DisplayName("getter and setter Methods")
      public void SetterGetterTest()
      {
            assertEquals(19, p.getAge());
            assertEquals("Casper", p.getName());
      }

}
