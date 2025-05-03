package at.fhj.msd;

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

        System.out.println(max(a,b));
        System.out.println(max(dwa, jeden));
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
        

                
            
        }


    }
