import java.util.SortedSet;
import java.util.TreeSet;
import java.util.NavigableSet;
public class SetDemo {
    public static void main(String[] args) {
        //TreeSet
        SortedSet<String> treeSet = new TreeSet<>();
        treeSet.add("Харьков");
        treeSet.add("Киев");
        treeSet.add("Львов");
        treeSet.add("Кременчуг");
        treeSet.add("Харьков");
        treeSet.add("Винница");
        treeSet.add("Одесса");

        System.out.println(treeSet);
        System.out.println("Первый элемент: " + treeSet.first());
        System.out.println("Последний элемент: " + treeSet.last());

        // add() has boolean return type
        System.out.println(treeSet.add("Харьков"));

        //subSet(E fromElement, E toElement) > ! toElement is not included
        SortedSet<String> subTree = treeSet.subSet("Киев", "Одесса");
        System.out.println("SubTree: " + subTree);

        System.out.println("HeadSet: " + treeSet.headSet("Львов")); //элементы которые предшествуют указанному не включая его
        System.out.println("TailSet: " + treeSet.tailSet("Львов")); //элементы которые следуют за указанным !включительно

        // NavigableSet
        

    }
}
