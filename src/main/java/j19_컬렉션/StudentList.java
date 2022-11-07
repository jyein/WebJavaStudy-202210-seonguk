package j19_컬렉션;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(20220001, "김철수"));
        students.add(new Student(20220002, "김영희"));
        students.add(new Student(20220003, "이동길"));
        students.add(new Student(20220004, "이혜진"));
        students.add(new Student(20220005, "박경민"));
        students.add(new Student(20220006, "이주호"));

        String searchName = "이동길";


        // for each
        for (Student student : students) {
            if (student.getName().equals(searchName)) {
                System.out.println(searchName + " 학생의 학번 : " + student.getId());
                break;
            }
        }

        // 일반 포문
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getName().equals(searchName)) {
                System.out.println(searchName + " 학생의 학번 : " + student.getId());
                break;
            }
        }

        int searchId = 20220002; // 이 학생을 찾아서 지우고 학생리스트를 출력

        // for each 문
        for (Student student : students) {
            if (student.getId() == searchId) {
                students.remove(students.indexOf(student));
                break;
            }
        }

        // 일반 포문
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId() == searchId) {
                students.remove(i);
                break;
            }
        }


        System.out.println(students);

    }
}
