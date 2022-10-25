package j06_조건.j07_반복;

public class BreakAndContinue {
    public static void main(String[] args) {

            int i = 0;

        while(true) {
            if (i > 9) {
                break;
            }
            System.out.println(i);
            i++;
        }

        for (int j = 0; j < 10; j++) {
            if (j == 7){
                System.out.println("7을 만났습니다.");
                break;
            }
            System.out.println(j);
        }

        System.out.println("<<<<<<<<Continue>>>>>>>>>");

        for(int j = 0; j < 100; j++) {

            if(j % 5 != 0 || j == 0){
                continue; // 비유로 기억하려면 수문장 같은 느낌이다.
            }
            System.out.println(j);
        }



    }
}
