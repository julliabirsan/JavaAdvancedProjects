package colectii;

import java.util.Comparator;
import java.util.Objects;

public class Person {
    String name;
    int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static Comparator<Person> compareByName = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.name.compareTo(o2.name);
        }
    };
    public static Comparator<Person> compareByAge = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.age - o2.age;
        }
    };
}
