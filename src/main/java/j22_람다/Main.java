package j22_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        // Runnable
        // return이 없기때문에 무조건 {}를 써야한다
        Runnable runnable = () -> {
            System.out.println("첫번째 프로그램을 실행합니다");
        };

        Runnable runnable2 = () -> {
            System.out.println("두번째 프로그램을 실행합니다");
        };

        runnable.run();
        runnable2.run();

        // 예외처리 공부해보기

        // Thread안에 runnable이 들어가있다.
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드1 : " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드2 : " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

//        thread1.start();
//        thread2.start();

        // 위에 Thread 두개가 동시에 돌고있는 이유는
        // Thread는 동시에 돌기 때문이다.

        Supplier<String> supplier = () -> "공급";
        System.out.println(supplier.get());

        // 매개변수가 없거나 두개가 있는경우에는 생략 불가능
        // 매개변수가 하나일땐 괄호({}) 생략 가능

        Consumer<String> consumer = (name) -> {
            System.out.println("이름 : " + name);
        };

        consumer.accept("김철수");

        Function<Integer, String> function = age -> "나이 : " + age;
        System.out.println(function.apply(25));

        Predicate<Integer> leapMonth = year ->
                year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(leapMonth.test(2000));

    }

}
