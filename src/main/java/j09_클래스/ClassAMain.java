package j09_클래스;

public class ClassAMain {
    public static void main(String[] args) {

        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        // new ClassA(); 의 주소를 불러온다
        // 실행할때마다 바뀐다.

        // 자료형  변수명   주소
        // ex) int a = 0;
        ClassA a1 = new ClassA();

        ClassA a2 = new ClassA();

        a1.name = "홍성욱";
        System.out.println(a1.name);

        a2.name = "성욱";
        System.out.println(a1.name);
        System.out.println(a2.name);

        a1.callName();
        a2.callName();


    }
}
