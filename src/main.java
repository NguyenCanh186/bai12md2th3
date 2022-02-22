import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student("z.anh", 20, "PT");
        Student student2 = new Student("n.anh", 16, "PT");
        Student student3 = new Student("q.anh", 28, "PT");
        Student student4 = new Student("k.anh", 28, "PT");

        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list);
        for (Student st: list
             ) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list, ageComparator);
        System.out.println(" so sanh theo tuoi ");
        for (Student st: list
             ) {
            System.out.println(st.toString());
        }
    }
}
