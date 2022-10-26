package j09_클래스;

public class StudentMain {
    public static void main(String[] args) {

        Student s1 = new Student("부산대학교", 20220001, 1, "철수");
        Student s2 = new Student("부산대학교", 20220002, 2, "영희");

        Student s3 = new Student();
        Student s4 = new Student();

        s3.name = "홍성욱";
        s3.studentCode = 20220003;
        s3.studentYear = 3;
        s3.schoolName = "부산대학교";
        s4.name = "홍성우기";
        s4.studentCode = 20220004;
        s4.studentYear = 5;
        s4.schoolName = "부산대학교";

        s1.increaseStudentYear();
        s2.increaseStudentYear();
        s3.increaseStudentYear();
        s4.increaseStudentYear();

        s1.showStudentInfo();
        s2.showStudentInfo();
        s3.showStudentInfo();
        s4.showStudentInfo();

        s1.increaseStudentYear(2);
        s1.increaseStudentYear(2);
    }
}
