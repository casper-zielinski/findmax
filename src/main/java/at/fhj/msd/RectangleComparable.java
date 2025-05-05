package at.fhj.msd;

import java.util.Comparator;

public class RectangleComparable implements Comparator<Object> {

      @Override
      public int compare(Object o1, Object o2) {
            Rectangle r1 = (Rectangle) o1;
            Rectangle r2 = (Rectangle) o2;
            if (r1.calcArea() > r2.calcArea()) {
                  return 1;
            } else if (r1.calcArea() < r2.calcArea()) {
                  return -1;
            }
            else return 0;
      }

}
