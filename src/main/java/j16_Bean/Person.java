package j16_Bean;


public class Person {

    private final String name;            // 멤버변수에 final을 선언하면 필수값이 된다.
    private int age;

    // public Person() {}                 // NoArgsConstructor

    // 상수는 생성자를 만들어야 사용가능하다.
    // 필수(리콰이어) 아규먼트 생성자
    public Person(String name) {          // REquiredArgsConstructor
        this.name = name;
    }

    public Person(String name, int age) {  // AllArgsConstructor
        this.name = name;
        this.age = age;
    }

}
