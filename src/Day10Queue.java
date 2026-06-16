public class Day10Queue {
    static void main() {
        Linkedlist<string> list = new LinkedList();
        Linkedlist.add("Arun");
        Linkedlist.add("Guna");
        Linkedlist.add("Sanjay");
        Linkedlist.add("saran prasath");
        Linkedlist.add("Dharanish");
        System.out.println();
        list.remove("Arun");
        {
            while (list.size() > 1) {
                process(list);
            }
        }
    }
}