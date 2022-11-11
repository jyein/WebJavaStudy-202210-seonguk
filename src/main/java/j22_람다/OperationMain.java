package j22_람다;

public class OperationMain {

    public static void main(String[] args) {

        int a = 10, b = 20;

        Operation add = new Operation() {
            @Override
            public int calc(int x, int y) {
                return x + y;
            }
        };

        Operation add2 = (x, y) -> x + y; // 익명클래스를 정의하고 생성한것이다.
//         람다식은 메소드를 딱 하나밖에 가질수 있다. (추상메소드)
//         즉 구현할 메소드가 하나만 있어야 된다.
//         Operation add2 = (int x, int y) -> {
//         return x + y;
//        };
        // 바로 return값이 구현되는경우 {}를 생략할수있다.
        // {}를 쓰면 여러줄을 쓸수있다라는 개념때문에
        // return값만 구현되면 {}와 return을 쓰면 안된다
        Operation sub = (x, y) -> x - y;

        System.out.println(sub.resultToString(sub.calc(b, a)));


        int addResult = add.calc(a, b);
        System.out.println(a + " + " + b + " = " + addResult);

        int addResult2 = add.calc(a, b);
        System.out.println(a + " + " + b + " = " + addResult2);

        Operation multi = (x, y) -> x * y;

        Operation div = (x, y) -> x / y;

        System.out.println(multi.resultToString(multi.calc(b, a)));
        System.out.println(div.resultToString(div.calc(b, a)));



    }

}
