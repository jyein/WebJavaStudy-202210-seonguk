package j19_컬렉션;

import java.util.*;


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

        /*
            id = 20220003학생을 찾아서 그 학생의 이름이 이동길이면 김경민으로 바꿔라
        */

        searchId = 20220003;

        for (Student student : students) {
            if (student.getId() == searchId && student.getName().equals("이동길")) {
                student.setName("김경민");
                break;
            }
        }

        System.out.println("--------------------------------------------");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("--------------------------------------------");

//        for (Student student : students) {
//            if (student.getId() == searchId) {
//                students.setName("김경민");
//                break;
//            }
//        }

        System.out.println(students);
        System.out.println();

        searchId = 20220004;
        /*
            이혜진을 박창우로 변경
         */

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == searchId) { // 찾았을때 아이디가 찾으려는 아이디이면
                student.setName("박창우");
                break;
            }
        }

        System.out.println(students);

        System.out.println("-------------------------------");
        List<Student> reverseStudents = new ArrayList<Student>();

//        for (int i = 0; i < students.size(); i++) {
//            reverseStudents.add(students.get(students.size() -1 -i));
//        }
//
        for (Student student : students) {
            reverseStudents.add(0, student);
        }

        System.out.println("=============================");
        System.out.println(reverseStudents);

        System.out.println("-----------------------------------------");
        // Collections.reverse를 해서 뒤집을수 있다.
        Collections.reverse(reverseStudents);
        System.out.println(reverseStudents);

        /*
            idList
            nameList
            각각의 리스트를 만든다
            각각의 id 값만 리스트로 출력
            각각의 name 값만 리스트로 출력
        */

        List<Integer> idList = new ArrayList<Integer>();
        List<String> nameList = new ArrayList<String>();

        for (Student student : students) {
            idList.add(student.getId());
            nameList.add(student.getName());
        }
        System.out.println(idList);
        System.out.println(nameList);

        students.clear();
        System.out.println(students);

        for (int i = 0; i < idList.size(); i++) {
            Student student  = new Student(idList.get(i), nameList.get(i));
            students.add(student);
        }

        System.out.println(students);


    }
}
