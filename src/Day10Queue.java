import java.util.LinkedList;
public class Day10Queue {
    static void process(LinkedList<String> list) {
     String remove = list.removeFirst();
     System.out.println("Remove"+remove);

    }
    static void main() {
        LinkedList <String> list = new LinkedList<String>();
        list.add("Arun");
        list.add("Guna");
        list.add("Sanjay");
        list.add("saran prasath");
        list.add("Dharanish");
        System.out.println();


            while (list.size() > 1) {
                process(list);
            }

    }
}