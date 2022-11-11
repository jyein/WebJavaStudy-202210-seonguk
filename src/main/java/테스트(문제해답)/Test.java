package 테스트;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<Student>();
        students.add(new Student(202200052, "김준일"));
        students.add(new Student(202200076, "정빈"));
        students.add(new Student(202200032, "김규민"));
        students.add(new Student(202200050, "박경효"));
        students.add(new Student(202200024, "김혜진"));
        students.add(new Student(202200010, "김지향"));

        ArrayList<Student> addAllList = new ArrayList<Student>();

        for (Student student : students) {
            addAllList.add(0, new Student(student.getId(), student.getName()));
        }

        System.out.println(addAllList);
        System.out.println("--------------------------");
        Collections.sort(addAllList);
        System.out.println(addAllList);


    }
}
