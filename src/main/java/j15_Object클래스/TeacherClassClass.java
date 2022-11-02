package j15_Object클래스;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherClassClass {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("김준일", "코리아아이티");
        Teacher teacher2 = new Teacher("김준일", "코리아아이티");

        // getClass 는 클래스자체를 가지고오는데 이것을 Class클래스 이다
        // Class클래스는 클래스의 정보를 가지고있다.
        Class t_class= teacher1.getClass();

        System.out.println(t_class.getSimpleName());
        System.out.println(t_class.getName());

        Field[] fields = t_class.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
            System.out.println(fields[i].getType().getSimpleName());
        }

        // .getDeclaredClasses() 안에 들어있는 클래스들도 가지고올수있다.
        // .getDeclaredMethods() 안에 들어있는 메소드들을 가지고올수있다.
        Method[] methods = t_class.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getReturnType()); // .getReturnType()은 리턴타입을 가지고온다
        }

        System.out.println(teacher1.getClass() == teacher2.getClass());
        System.out.println(teacher1 instanceof Teacher); // teacher1 이 Teacher로 만들어 졋니?
        System.out.println(teacher1.getClass() == Teacher.class); // teacher1.getClass()가 Teacher.class로 생성이 됫는지?
        System.out.println(teacher2.getClass() == Teacher.class);
    }
}