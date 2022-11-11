package j22_람다;

@FunctionalInterface
// @FunctionalInterface = 추상메소드를 하나더 만들지 못하게 해주는 어노테이션이다
// Lamda를 쓰려고 만든 인터페이스에 적어두면 다른 사람들이 람다를 사용하기때문에 적어둿구나
// 라는것을 알수있다.
// 무시하고 메소드를 하나더 만든다면 람다를 사용한 것들이 망가진다.
public interface Operation {
    public int calc(int x, int y);

    // 람다는 두개의 메소드는 들어가면 작동이 안되지만
    // default 는 예외이다

    public default String resultToString(int result) {
        return "결과 " + result;

    }
}
