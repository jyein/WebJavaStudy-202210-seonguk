package j11_배열;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        /*
         1. 10명의 학생 이름을 담을 수 있는 studentNames 배을을 만든다.
         ---- 출력결과 ----
         1. 정빈
         2. 김규민
         3. 박경효
         4. 김혜진
         5. 김지향
         6. 전병욱
         7. 윤도영
         8. 이성욱
         9. 홍성욱
         10. 박민화
        */
        Scanner scanner = new Scanner(System.in);

        String[] studentName = new String[10];

//        studentName[0] = "정빈";
//        studentName[1] = "김규민";
//        studentName[2] = "박경효";
//        studentName[3] = "김혜진";
//        studentName[4] = "김지향";
//        studentName[5] = "전병욱";
//        studentName[6] = "윤도영";
//        studentName[7] = "이성욱";
//        studentName[8] = "홍성욱";
//        studentName[9] = "박민화";


        int count = 0;
        String[] studentName2 = null;
        System.out.print("몇명의 학생을 등록하시겠습니까? ");
        count = scanner.nextInt();
        scanner.nextLine();

        studentName2 = new String[count];

        for (int i = 0; i < studentName2.length; i++) {
            System.out.println((i + 1) + "번 학생 이름 : ");
            studentName[i] = scanner.nextLine();
        }

        System.out.println("[출력결과]");
        for (int i = 0; i < studentName2.length; i++) {
            System.out.println((i + 1) + ". " + studentName[i]);
        }



        for (int i = 0; i < studentName.length; i++) {
            System.out.println((i + 1) + "번 학생 이름 : ");
            studentName[i] = scanner.nextLine();
        }

        System.out.println("[출력결과]");
        for (int i = 0; i < studentName.length; i++) {
            System.out.println((i + 1) + ". " + studentName[i]);
        }

    }
}
