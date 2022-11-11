package j21_익명클래스;

public class AdditionMain1 {

    public static void main(String[] args) {

        Addition<String> stringAddition = new AdditionImpl<String>();

        String str = stringAddition.add("문자열");
        System.out.println(str);

        Addition<Integer> intergerAddition = new Addition<Integer>() {
            // 임시로 설계도면을 만들어 1회용으로 사용할수있다.
            // 재사용 불가능
            @Override
            public Integer add(Integer values) {

                return null;
            }

        };
        // implements 를 하는이유는 동일한 인터페이스를 가지고 재정의(오버라이드)
        // 를 하기위해 사용하는것이다.


    }
}
