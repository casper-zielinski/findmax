package at.fhj.msd;

import java.util.Comparator;

public class PersonMax implements Comparator<Object>{

      @Override
      public int compare(Object o1, Object o2) {
            Person p1 = (Person)(o1);
            Person p2 = (Person)(o2);

            if (p1.getAge() > p2.getAge()) return 1;
            if (p1.getAge() < p2.getAge()) return -1;
            else return 0;
      }

     
}
 

