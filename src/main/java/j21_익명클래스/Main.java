package j21_익명클래스;

public class Main {

    public static void main(String[] args) {

        Interface1 interface1 = new Class1();
        Interface1 interface2 = new Class1();
        Interface1 interface3 = new Class1();
        Interface1 interface4 = new Class1();
        Interface1 interface5 = new Class1();

        interface1.methodName();
        interface2.methodName();
        interface3.methodName();
        interface4.methodName();
        interface5.methodName();

        Interface1 interface6 = new Interface1() {
            @Override
            public void methodName() {
                System.out.println("익명클래스로 정의한 메소드");
            }
        };
        System.out.println("-------------------");
        interface6.methodName();

        // 익명클래스는 한번쓰고 안쓸것같은 것들을 일부러 클래스를 더 만들지
        // 않고 익명클래스를 만든다.
        // 익명클래스 == 여기에서 즉시 정의해서 쓰느냐?

        Interface1 interface7 = new Interface1() {
            @Override
            public void methodName() {
                System.out.println("익명클래스로 정의한 메소드");
            }
        };


    }

}
