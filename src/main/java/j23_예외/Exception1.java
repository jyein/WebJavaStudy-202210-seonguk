package j23_예외;

public class Exception1 {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7};

        // 예외가 일어날수 있는 곳을 try에 넣는다
        try {
            for (int i = 0; i < 8; i++) {
                System.out.println(numbers[i]);
            }// catch부분에는 try부분에 맞는 오류를 적어 예외처리를 해준다
        } catch (ArrayIndexOutOfBoundsException e) { // 여기서 catch에선 (ArrayIndexOutOfBoundsException을 상속받는다)
            System.out.println("예외를 처리하였습니다.");
        }

//        try {
//            for (int i = 0; i < 8; i++) {
//                System.out.println(numbers[i]);
//            }
//        }catch (NullPointerException e){ // NullPointerException의 예시 null.get()
//            System.out.println("예외를 처리하였습니다.");
//        }

        // if문이랑 비슷하다.
        try {
            String a = null;
            a.toLowerCase(); // 여기에서 오류가 났기때문에 밑에 for문은 실행되지 않는다

            for (int i = 0; i < 8; i++) {
                System.out.println(numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외를 처리하였습니다.");
        } catch (NullPointerException e) {
            System.out.println("null pointer to ecxeption");
        } finally {
            System.out.println("항상 실행되어야 하는 서비스 ");
        }

        System.out.println("프로그램 정상 종료.");

    }
}
