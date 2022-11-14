package j23_예외;

public class Exception2 {

    public static void printArray(int[] numbers) throws Exception {


        for (int i = 0; i < numbers.length + 1; i++) {
            System.out.println("/" + numbers[i]);
        }
    }


    public static void main(String[] args) {
        // throw는 예외를 강제로 일어나게 하는것

        if (1 == 1) {
            try {
                throw new RuntimeException("예외 강제 생성");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("런타임 예외 처리");
            } catch (Exception e) {
                // 이거는 맨 마지막에 해줘야 한다. (왜냐하면 많은 오류들은 Exception에 상속되어있기때문에
                // 업캐스팅이 되어서 모든 오류가 걸러지기 때문에 어떤 오류인지를 모른다
                e.printStackTrace();
            } finally {
                System.out.println("예외가 발생 하든 마지 않든 실행");
            }
        }
        System.out.println("프로그램 정상 종료");

//
//        try {
//            printArray(new int[]{1, 2, 3, 4, 5, 6, 7});
//
//        } catch (Exception e) {
//        }

//        System.out.println("프로그램 정상 종료");

    }

}
