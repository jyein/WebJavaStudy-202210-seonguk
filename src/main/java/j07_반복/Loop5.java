package j06_조건.j07_반복;

public class Loop5 {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            int dan = i + 2;
            for (int a = 0; a < 9; a++) {
                int num = a + 1;
                if(num == 1){
                    System.out.println("======================");
                    System.out.println(dan + "단");
                }
                System.out.println(dan + "X" + num + "=" + (dan * num));
            }
        }

    }
}
