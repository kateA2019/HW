import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
public class HashSetDemo {
    public static void main(String[] args) {
            //HashSet
        Set <String> hashSet = new HashSet<>();
        hashSet.add("Харьков");
        hashSet.add("Киев");
        hashSet.add("Львов");
        hashSet.add("Кременчуг");
        hashSet.add("Харьков");
        System.out.println("hashSet "+hashSet);
        boolean contains1 = hashSet.contains("Киев");
        boolean contains2 = hashSet.contains("Кировск");
        System.out.println("contains1 " + contains1);
        System.out.println("contains2 " + contains2);
        hashSet.add("Кировск");
        System.out.println("hashSet "+hashSet);
        System.out.println(hashSet.contains("Кировск"));
        hashSet.remove("Кировск");
        System.out.println("hashSet "+hashSet);
        System.out.println(hashSet.contains("Кировск"));
            //TreeSet
        SortedSet<String> treeSet = new TreeSet<>();
        treeSet.add("Харьков");
        treeSet.add("Киев");
        treeSet.add("Львов");
        treeSet.add("Кременчуг");
        treeSet.add("Харьков");
        treeSet.add("Кировск");
        System.out.println("TreeSet " + treeSet);
            //LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Бета");
        linkedHashSet.add("Альфa");
        linkedHashSet.add("Этa");
        linkedHashSet.add("Гaммa");
        linkedHashSet.add("Эпсилон");
        linkedHashSet.add("Омeгa");
        System.out.println("linkedHashSet " + linkedHashSet);


        System.out.println("hashCode " + linkedHashSet.hashCode());
    }
}
