package at.fhj.msd;



import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //Previous Tests
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

    public static Person maxP(List<Person> persons)
    {
        PersonMax pm = new PersonMax();
        persons.sort(pm);
        return persons.get(persons.size() - 1);
    }

    public static Person maxPName(List<Person> persons)
    {
        PersonNameComparator pm = new PersonNameComparator();
        persons.sort(pm);
        return persons.get(persons.size() - 1);
    }
}