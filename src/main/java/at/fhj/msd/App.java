package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String a = "aab";
        String b = "aba";

        int jeden = 1;
        int dwa = 2;
        int three = 0;

        List<Integer> intest = new ArrayList<>();
        intest.add(three);
        intest.add(dwa);
        intest.add(jeden);
        intest.add(40);
        intest.add(2);
        System.out.println(intest);
        System.out.println(max(intest));
        List<String> Test = new ArrayList<>();
        Test.add(b);
        Test.add(a);
        Test.add("zebra");
        Test.add("test");
        System.out.println(Test);
        System.out.println(max(Test));
        


        // System.out.println(max(a,b));
        // System.out.println(max(dwa, jeden));
    }

    public static <T extends Comparable<T>> T max(T a, T b){
        if ((a.compareTo(b)) >= 1){
            return a;
        }
        else if ((a.compareTo(b)) <= -1)
        {
            return b;
        }
        return null;
    }

    public static <T extends Comparable<T>> T max(List<T> a){
        
        MaxList<T> ml = new MaxList<>();
        a.sort(ml);
        return a.get(a.size() - 1);
        }


    }
