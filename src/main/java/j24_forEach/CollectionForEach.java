package j24_forEach;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class CollectionForEach {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("김준일");
        list.add("김경민");
        list.add("김완준");
        list.add("이동빈");
        list.add("이종준");

        for (String name : list) {
            System.out.println(name);
        }

        System.out.println();

        list.forEach(name -> {
            System.out.println(name);
        });

        System.out.println("------------------------------");

        // 이 로직을 한번에 적은것이
        // list.forEach(name -> {
        //            System.out.println(name);
        //        });
        // 이것이다
        Consumer<String> consumer = name -> {
            System.out.println(name);
        };

        // 아래에서 consumer.accept는 위에 식을 불러 오는 것이다.

        for (String name : Objects.requireNonNull(list)) {
            consumer.accept(name);
        }

        System.out.println();
        list.forEach(name -> {
            System.out.println(name);
        });

        Set<Integer> numbers = new HashSet<Integer>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i + 1);
        }

        AtomicInteger result = new AtomicInteger();
        // 일반 변수에다가 람다식을 써야할때 Atomic 을 사용한다.

        numbers.forEach(num -> {
            result.addAndGet(num); // addAndGet == +=
        });

        System.out.println(result.get());

        Map<Integer, String> students = new TreeMap<Integer, String>();

        for (int i = 0; i < 10; i++) {
            students.put(20220001 + i, "김준" + (i + 1));
        }

        students.forEach((key, value) -> {
            System.out.println("학번 : " + key + ", 이름 : " + value);
        });

    }
}
