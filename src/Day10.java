import java.util.ArrayList;

public class day10 {
        static void main() {
                ArrayList<String> list = new ArrayList();
                list.add("Arun");
                list.add("Guna");
                list.add("Ram");
                list.add("Chandru");
                list.add("Srikanth");
                System.out.println();
                list.remove("Ram");
                list.add("Gokul");

                for (String s : list) {
                        System.out.println(s);
                }
                System.out.println();



        }

}
