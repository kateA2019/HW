import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayListDemo {
    public static void main(String[] args){
        List<String> arrayList = new ArrayList<>();
        System.out.println("Начальный размер arrayList: " + arrayList.size());

        // adding elements
        System.out.println("\n 1) adding elements");
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add("F");
        arrayList.add(1, "A2");
        arrayList.set(0, "C2");
        System.out.println("Размер arrayList после добавления: " + arrayList.size());
        System.out.println("Содержимое arrayList: " + arrayList);
        System.out.println(arrayList.get(0));

        // removing elements
        System.out.println("\n 2)removing elements");
        arrayList.remove("F");
        arrayList.remove(2);
        System.out.println("Размер arrayList после удаления: "  + arrayList.size());
        System.out.println("Содержимое of arrayList: " + arrayList);

        // example of removeAll()
        System.out.println("\n 3) removeAll()");
        arrayList.add("E");
        arrayList.add("F");
        List<String> removeElements = List.of("C2", "A2", "AA", "F"); // collection of elements that will be removed
        System.out.println("Содержимое arrayList до removeAll: " + arrayList);
        arrayList.removeAll(removeElements);
        System.out.println("Содержимое arrayList после removeAll: " + arrayList);

        // example of addAll(), clear()
        System.out.println("\n 4) addAll(), clear()");
        List<String> arrayList2 = List.of("1", "2");
        arrayList.add(1, "A2");
        arrayList.set(0, "C2");
        arrayList.add("E");
        arrayList.add("F");
        System.out.println("arrayList до добавления " + arrayList);
        arrayList.addAll(3, arrayList2);
        System.out.println("arrayList после добавления " + arrayList);
        arrayList.clear();
        System.out.println("arrayList после очистки " + arrayList);

        // example of retainAll()
        System.out.println("\n 5) retainAll()");
        List<String> arrayList1 = new ArrayList<>();
        List<String> arrayList3 = List.of("F", "FF", "E", "B");

        arrayList1.add("A");
        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        arrayList1.add("D");
        arrayList1.add("E");
        arrayList1.add("F");
        arrayList1.add("F");

        System.out.println("arrayList1 before retainAll " + arrayList1);
        System.out.println("arrayList3 " + arrayList3);
        arrayList1.retainAll(arrayList3);
        System.out.println("arrayList1 after retainAll " + arrayList1);

        // convert to an Array
        System.out.println("\n 6) convert to an Array");
        arrayList1.add("A2");
        arrayList1.add("A3");
        arrayList1.add("C2");
        arrayList1.add("D2");
        //1 вариант
        Object[] objectArray = arrayList1.toArray();
        System.out.println(Arrays.toString(objectArray));
        //2 вариант
        String[] stringArray1 = new String[arrayList1.size()];
        arrayList1.toArray(stringArray1);
        System.out.println(Arrays.toString(stringArray1));
        //3 вариант
        String[] stringArray2 = arrayList1.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArray2));

    }
}
