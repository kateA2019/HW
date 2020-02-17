import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
            //**Queue**
        System.out.println("**LinkedList**");
        Queue<String> queue = new LinkedList<>();
            //adding elements: offer() <Queue> and add() <Collection> -[throws Exception if collection size is limited]
        queue.offer("Харьков");
        queue.offer("Киев");
        queue.offer("Кременчуг");
        queue.add("Львов");
        System.out.println("Очередь: "+ queue);
            // peek() и element()>>[throws Exception] - возвращает элемент из головы очереди
        System.out.println("Элемент из головы очереди peek(): " + queue.peek());
        System.out.println("Элемент из головы очереди element(): " + queue.element());
            // removing elements: роll() and remove()>>[throws Exception] - возвращает элемент из головы очереди и удаляет его.
        while ( !queue.isEmpty() ) {
            System.out.print("remove() " + queue.remove() + " | ");
        }
        String town;
        while ((town = queue.poll()) != null) {
            System.out.print("poll() " + town + " | ");
        }
        System.out.println("\nЭлемент из головы очереди peek(): " + queue.peek());
        try {
            System.out.println("Элемент из головы очереди element(): " + queue.element());
        } catch (NoSuchElementException e)  {
            System.out.println("Элемент из головы очереди element(): Очередь пустая");
        }

            //**ArrayDeque**
        System.out.println("\n**ArrayDeque**");
        Deque <String> stack = new ArrayDeque<> ();
        Deque <String> queue2 = new ArrayDeque<> (2);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        System.out.print("stack " + stack + "\n");
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " pop, ");
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

            //**PriorityQueue**
        System.out.println("\n**PriorityQueue**");
        Queue<String> queue1 = new PriorityQueue<>();
        System.out.println("PriorityQueue size: " + queue1.size());
        queue1.offer("Киев");
        queue1.offer("Харьков");
        queue1.offer("Львов");
        queue1.add("Кременчуг");
        queue1.add("Кременчуг");
        System.out.println("1.Priority queue с *Comparable*: " + queue1);
        System.out.println("PriorityQueue size: " + queue1.size());
        System.out.print("Removing elements: ");
        while (queue1.size() > 0) {
            System.out.print(queue1.remove() + " ");
        }
        System.out.println();
        PriorityQueue<String> queue3
                = new PriorityQueue<>(5, Collections.reverseOrder());
        queue3.offer("Киев");
        queue3.offer("Харьков");
        queue3.offer("Львов");
        queue3.offer("Кременчуг");
        queue3.offer("Кременчуг");
        System.out.println("2.Priority queue с *Comparator*: " + queue3);
        System.out.print("Removing elements: ");
        while (queue3.size() > 0) {
            System.out.print(queue3.remove() + " ");
        }

    }
}
