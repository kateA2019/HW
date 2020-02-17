import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Person {
        public int age;
        // give the larger value - the higher priority (by default: the less value - the higher priority)
        // negative value for compare > the first element gets higher priority:
        Comparator <Person> comp = new Comparator<Person>() {
            @Override
            public int compare (Person p1, Person p2) {
                //if p1 > p2 , the return value should be negative
                //if p2 > p1 , the return value should be positive
                return p2.age - p1.age;
            }
        };
    public static void main (String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        p1.age = 21;
        p2.age = 74;
        p3.age = 19;
        p4.age = 82;
        Queue<Person> priorityqueue = new PriorityQueue<Person> (comp);



    }
}
