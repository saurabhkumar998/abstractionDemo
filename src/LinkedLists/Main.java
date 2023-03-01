package LinkedLists;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
       // LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");

        addMoreElements(placesToVisit);

        System.out.println(placesToVisit);

        removeElements(placesToVisit);

        System.out.println(placesToVisit);
    }

    public static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");

        // queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        // stack methods
        list.push("Alice Spring");
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);

        String s1 = list.remove();   // will remove the first element
        System.out.println(s1 + " was removed.");

        String s2 = list.removeFirst();   // will remove the first element
        System.out.println(s2 + " was removed.");

        String s3 = list.removeLast();     // will remove the last element
        System.out.println(s3 + " was removed.");

        // queue/deque poll methods
        String p1 = list.poll();       // will remove the first element
        System.out.println(p1 + " was removed.");

        String p2 = list.pollFirst();   // will remove the first element
        System.out.println(p2+ " was removed.");

        String p3 = list.pollLast();  // will remove the last element
        System.out.println(p3 + " was removed.");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");

        System.out.println(list);

        String p4 = list.pop();
        System.out.println(p4 + " was removed.");
    }
}
