package j19_컬렉션;

import java.util.*;

import static j19_컬렉션.StringList.printCollection;

public class StudentSet {

    public static void main(String[] args) {

        Set<Student> students = new HashSet<Student>();
        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경효"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));

        System.out.println(students);

        /*
                ==== 숙제 ====
            1. 김혜진 학생의 학번을 출력하세요
            2. 20220004 학번을 가진 학생의 이름을 설민수로 변경하세요.
            3. 20220001 학번이 존재하면 해당 학생을 삭제하세요.
                ==============

            set -> list로 변환 (뒤죽박죽된 상태로 전환이 된다)
            해당 list를 학번 순서에 맞게 정렬하시오.
         */

        String searchName;
        int searchId;

        System.out.println("==========================================");

        // 1. 김혜진 학생의 학번을 출력하세요

        searchName = "김혜진";

        for (Student student : students) {
            if (student.getName().equals(searchName)) {
                System.out.println(searchName + "학생의이름" + student.getId());
                break;
            }
        }

        System.out.println("====================1번====================");
        // 2. 20220004 학번을 가진 학생의 이름을 설민수로 변경하세요.
        searchId = 20220004;

        for (Student student : students) {
            if (student.getId() == searchId) {
                student.setName("설민수");
                break;
            }
        }

        System.out.println(students);

        System.out.println("====================2번====================");
        // 3. 20220001 학번이 존재하면 해당 학생을 삭제하세요.
        searchId = 20220001;

        for (Student student : students) {
            if (student.getId() == searchId) {
                students.remove(student);
                break;
            }
        }

        System.out.println(students);

        System.out.println("======================3번==================");
        /*
            set -> list로 변환 (뒤죽박죽된 상태로 전환이 된다)
            해당 list를 학번 순서에 맞게 정렬하시오.
         */
        System.out.println("<<<<<<set 을 List로 바꾸기 >>>>>>>>");

//        Set<Student> students = new HashSet<Student>();
        List<Student> addAllList = new ArrayList<Student>();

        addAllList.addAll(students);
//
//        for (Student student : students){
//            list.add(student);
//        }
        System.out.println(addAllList);
        System.out.println(students);

        System.out.println("----------------------------------");

//        for (int i = 0; i < addAllList.size(); i++){
//            Student student = addAllList.get(i);
//            if (student.getId() > addAllList.get(i + 1).getId()) {
//                addAllList.add(addAllList.get(0));
//                break;
//            }
//        }
//
//        System.out.println(addAllList.get(0));


//        for (Student addList : addAllList) {
//            if (addList.getId() > addList.getId()){
//                addAllList.add(0, addList.setId(););
//                break;
//            }
//        }

//        for (int i = 0; i < addAllList.size(); i++) {
//            Student addList = addAllList.get(i);
//            if (addList.getId(0) > addAllList.get(i)){
//                addAllList.add(0, addList.getId(i));
//            }
//        }

//        Collections.reverse(reverseList);

//        System.out.println(reverseList);
//        for (int i = 0; i < addAllList.size(); i++) {
//
//            if (reverseList.get(i).getId() < addAllList.get(0).getId()) {
////                studentList1.add(0, reverseList.get(i));
//
//                for (int j = 0; j < studentList1.size(); j++) {
//                    if (studentList1.get(j).getId() > studentList1.get(i).getId()) {
//                        studentList1.set(i, studentList1.get(j));
//                    }
//                }
//
//            } else if (reverseList.get(i).getId() == addAllList.get(0).getId()) {
//                studentList1.add(reverseList.size() - 1, addAllList.get(0));
//            }
//        }
//        System.out.println(studentList1);


//        for (int j = 1; j < studentList1.size(); j++) {
//            if (studentList1.get(j).getId() > studentList2.get(j).getId()) {
////                    studentList2.add(0, studentList1.get(j));
//                studentList2.set(studentList2.size()-1, studentList1.get(j));
//            }
//        }


//        System.out.println(addAllList.get(0).getId());

//        System.out.println(addAllList);

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
        System.out.println("llllllllllllllllllllllllllllllllllllllllllllllllll");
        List<Student> sortStudents = new ArrayList<Student>();
        int cmpId = 200220000;
        int j = 0;

        for (int i = 0; i < students.size()+1; i++) {
            cmpId++;
            for (Student student : students) {
                if (student.getId() == cmpId){
                    sortStudents.add(student);
                }
            }
        }

        // 위에껀 편법이면서 중간에 빈번호가 있으면 안된다.





    }
}
