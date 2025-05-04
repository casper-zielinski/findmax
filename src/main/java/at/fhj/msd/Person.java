package at.fhj.msd;

public class Person {
      private final int age;
      private final String name;

      public Person(int age, String name)
      {
            this.age = age;
            this.name = name;
      }

      public int getAge()
      {
            return this.age;
      }

      public String getName()
      {
            return this.name;
      }

      @Override
      public String toString()
      {
            return String.format("%s is %s years old", this.name, this.age);
      }

}
