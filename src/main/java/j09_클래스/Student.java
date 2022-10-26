package j09_클래스;

public class Student {

    String schoolName;
    int studentCode;
    int studentYear;
    String name;

    // increaseStudentYear() - 호출시에 현재 학년을 1학년 증가 (최대 5학년)
    // showStudentInfo() - 학생 정보 출력

    Student(String sn , int sc, int sy, String n) {
        schoolName = sn;
        studentCode = sc;
        studentYear = sy;
        name = n;
    }
    Student() {

    }

    void increaseStudentYear() {
            studentYear++;
        if (studentYear > 5) {
            System.out.println("studentYear이 5가 넘어 더이상 출력할수 없다.");
            System.out.println();
            studentYear --;
        }
    }

    void increaseStudentYear(int year) {
        studentYear += year;
        if (studentYear > 5) {
            System.out.println(year + "학년을 더하면 " + studentYear + "학년이 되어서 5학년을 넘어섭니다");
            System.out.println();
            studentYear -= year;
            return;
        }
        showStudentInfo();
    }

     void showStudentInfo() {
        System.out.println("학교 : " + schoolName);
        System.out.println("학번 : " + studentCode);
        System.out.println("학년 : " + studentYear);
        System.out.println("이름 : " + name);
         System.out.println("=====================================");
    }

}