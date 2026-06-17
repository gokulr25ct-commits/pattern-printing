import java.util.LinkedList;
class Student{
    String name;
    int regno;
    int marks;
    Student(String name ,int regno,int marks){
        this.name=name;
        this.regno=regno;
        this.marks=marks;
    }
    @Override
    public String toString(){
        return "Name:"+name+
                ",regno:"+regno+
                ", Marks:"+marks;
    }}
public class day10 {
    static void main() {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Padithar", 101, 85));
        students.add(new Student("Gokul", 102, 90));
        students.add(new Student("Dhoni", 103, 87));
        students.add(new Student("virat", 104, 78));
        students.add(new Student("Rohith", 105, 89));
        System.out.println();
        for (Student s : students) {
            System.out.println(s);
        }
        students.removeFirst();
        System.out.println("\nAfter removing first student");
        for (Student s : students) {
            System.out.println(s);
        }
        String searchvalue = "Dhoni";
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(searchvalue)) {
                s.marks = 95;
                break;
            }
        }
        System.out.println("\nAfter updating Dhoni's marks:");
        for (Student s : students) {
            System.out.println(s);

        }
    }
}
