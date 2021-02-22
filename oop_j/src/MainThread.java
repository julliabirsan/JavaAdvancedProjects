public class MainThread {

    public static void main(String[] args) {


        Person p1 = new Person("test");

        Person p2 = new Person("test2");
        p1 = p2;

    }
}
