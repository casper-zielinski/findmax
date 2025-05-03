package at.fhj.msd;

import static at.fhj.msd.App.max;

import java.util.Comparator;


public class MaxList<T extends Comparable <T>> implements Comparator<T> {

      @Override
      public int compare(T a, T b)
      {
            return a.compareTo(b);
      }


}
