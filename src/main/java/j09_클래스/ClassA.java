package j09_클래스;

// 자료형
public class ClassA {

    int num;
    String name;
    double score;

    // 생성자
    // 생성자는 무조건 클래스 이름이랑 같아야 한다
    // 생성자는 항상 주소값을 반환한다.
    // 주소값을 반환 해주기 때문에 리턴값이 생략된다.
    // 생성자 호출이 항상 먼저이다.

    // 생성자의 특징
    // 다른 생성자를 오버로딩하면 기본 생성자는 사라진다

    // 매개변수 == 아규먼트
    // 매개변수가 없는 생성자를 노 아규먼트 컨스트럭터 라고한다.
    // No constructor with 0 arguments defined in class
    ClassA() {

    }
    ClassA(int a) {
        System.out.println("a : " + a);
        // 반환자료형
        System.out.println("ClassA를 생성합니다.");
    }

    void callName() {
        System.out.println(name + "을(를) 부릅니다.");
    }



}
