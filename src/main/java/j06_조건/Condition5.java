package j06_조건;

import java.util.Scanner;

public class Condition5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int selected = 0;

        System.out.println("[ 선택 프로그램 ]");
        System.out.println("1. 메뉴1");
        System.out.println("2. 메뉴2");
        System.out.println("3. 메뉴3");
        System.out.println("4. 메뉴4");
        System.out.println("5. 메뉴5");
        System.out.println("실행 할 명령을 선택하세요 : ");
        selected = scanner.nextInt();

        switch (selected) {
            case 1:
                System.out.println("메뉴1을 선택하셧습니다.");
                break;
            case 2:
                System.out.println("메뉴2을 선택하셧습니다.");
                break;
            case 3:
                System.out.println("메뉴3을 선택하셧습니다.");
                break;
            case 4:
                System.out.println("메뉴4을 선택하셧습니다.");
                break;
            case 5:
                System.out.println("메뉴5을 선택하셧습니다.");
                break;
            default:
                System.out.println("해당번호는 선택할 수 없습니다");
        }

    }
}
