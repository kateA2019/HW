import java.util.*;

public class QueueDemo {

    public static void removeFirst(Deque<String> q){
        q.removeFirst();
    }

    public static void main(String[] args) {
        //Queue
        Queue<String> queue = new LinkedList<>();
        queue.offer("Харьков");
        queue.offer("Киев");
        queue.offer("Кременчуг");
        queue.offer("Львов");
        System.out.println("Очередь: "+ queue);
            // peek() - возвращает элемент из головы очереди
        System.out.println("Элемент из головы очереди: " + queue.peek());
            //роll() - возвращает элемент из головы очереди и удаляет его.
        String town;
        while ((town = queue.poll()) != null) {
            System.out.println(town);
        }

        //ArrayDeque
        Deque <String> stack = new ArrayDeque<> ();
        Deque <String> queue2 = new ArrayDeque<> (2);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        queue2.add("A");
        queue2.add("B");
        queue2.add("C");
        queue2.add("D");
        System.out.println("queue2" + queue2);
        System.out.println("queue2 isEmpty? - "+ queue2.isEmpty());
        while (!queue2.isEmpty()){
            System.out.print(queue2.remove() + " remove, ");
        }
        System.out.println("\nqueue2 isEmpty after remove()? - "+ queue2.isEmpty());


        //exceptions handling
        try {
            for (int i = 0; i < 4; i++) {
                queue2.removeFirst();
                System.out.println("from remove " + i);
            }
        } catch (NoSuchElementException e){
            System.out.println("NoSuchElementException");
        } finally {
            System.out.println("from finally");
        }

        //PriorityQueue
        Queue<String> queue1 = new PriorityQueue<>();


        Map <Integer, Integer > map1 = new LinkedHashMap();
        map1.put(111,999);
        map1.put(222,888);
        System.out.println(map1.hashCode());
        System.out.println(map1);

    }
}
