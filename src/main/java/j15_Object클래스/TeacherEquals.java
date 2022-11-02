package j15_Object클래스;

public class TeacherEquals {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("김준일", "코리아아이티");
        j15_Object클래스.equals.Teacher teacher2
                = new j15_Object클래스.equals.Teacher("김준일", "코리아아이티");

//        System.out.println(teacher1 == teacher2);
        System.out.println(teacher1.equals(teacher2));
        // 두개의 값이 같더라도 다른 패키지에 있기때문에 false이다.

        System.out.println(teacher1.hashCode() == teacher2.hashCode());
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());


    }
}
