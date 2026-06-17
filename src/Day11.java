import java.util.HashSet;
import java.util.Set;
public class day11 {
    public static void main(String[]args){
        Set<String> set = new HashSet<>();
        set.add("Student1");
        set.add("Student2");
        set.add("Student1");
        set.add("Student1");
        set.add("Student2");
        System.out.println("set");
        for (String s:set){
            System.out.println(s);

        }

    }
}
