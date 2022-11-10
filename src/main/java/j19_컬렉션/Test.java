package j19_컬렉션;

import j19_컬렉션.Student;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Set<Student> students = new HashSet<Student>();
        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경효"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));

        System.out.println(students);

        String searchName;
        int searchId;


        // 2. 20220004 학번을 가진 학생의 이름을 설민수로 변경하세요.
        searchId = 20220004;

        for (Student student : students) {
            if (student.getId() == searchId) {
                student.setName("설민수");
            }
        }


        // 3. 20220001 학번이 존재하면 해당 학생을 삭제하세요.
        searchId = 20220001;

        for (Student student : students) {
            if (student.getId() == searchId) {
                students.remove(student);
                break;
            }
        }

        /*
            set -> list로 변환 (뒤죽박죽된 상태로 전환이 된다)
            해당 list를 학번 순서에 맞게 정렬하시오.
         */

        ArrayList<Student> addAllList = new ArrayList<Student>();

        for (Student student : students) {
            addAllList.add(0, new Student(student.getId(), student.getName()));
        }

        System.out.println(addAllList);
        System.out.println(students);

        System.out.println("----------------------------------");

        List<Student> reverseList = new ArrayList<Student>();

        System.out.println("llllllllllllllllllllllllllllllllllllllllllllllllll");

//        for (int i = 0; i < reverseList.size(); i++) {
//            studentList1.add(0, reverseList.get(i));
//            for (int j = 0; j < reverseList.size(); j++) {
//
//                if (reverseList.get(i).getId() > studentList1.get(j).getId()) {
//                    reverseList.add(0,reverseList.get(i));
//                }
//            }
//        }

//        List<Student> addAllList = new ArrayList<Student>();

//        Collections.sort(addAllList, Collections.reverseOrder());
//        System.out.println(addAllList);

//        for (int i = 0; i < addAllList.size(); i++) {
//            addAllList.sort(Collections.reverseOrder());
//        }
//        System.out.println(addAllList);
//
//        Collections.sort(addAllList, Collections.reverseOrder());
//        System.out.println(addAllList);
//

    }


}
