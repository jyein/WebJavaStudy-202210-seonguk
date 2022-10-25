package j05_Scanner;

import java.util.Scanner;

public class Input3 {
    /*
        이름 : 김준일               name
        나이 : 29                   age
        주소 : 부산 동래구 사직동   address
        연락처 : 010 9988 1916      phone

        사용자의 이름은 김준일이고 나이는 29살 입니다.
        주소는 부산 동래구 사직동이며 연락처는 010 9988 1916입니다.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = scanner.next();

        System.out.print("나이 : ");
        int age = scanner.nextInt();

        System.out.print("주소 : ");
        scanner.nextLine();
        String address = scanner.nextLine();

        System.out.print("연락처 : ");
        String phone = scanner.nextLine();

        // next(); 에선 공백문자 and 엔터값이 남아있는다
        // next(); 에서 값을 입력하지 않고 엔터와 스페이스바만 누르면 다음으로
        // 넘어가지 않기때문에 값을 입력하더라도 엔터를 누른 값이 남는다.

        // nextLine(); 에선 값을 입력한뒤에 스페이스바랑 엔터값이 남아있지
        // 않기때문에 다음 nextLine();으로 값을 넘긴다.
        // 예로들면 nextLine();이 x 와 y가 있을때
        // x 값을 입력할때 1 2 이렇게 누르면 y값이 2로 넘어간다

//      scanner.next(); 에서는 공백과 엔터가 둘다 남아있는데
//      엔터를 치게되면 다음으로 넘어가져 엔터나 next();버퍼에 남아있다.
//      그래서 그뒤에 scanner.nextLine();에서 위에 남아있던 엔터가 소비되어
//      바로 다음으로 넘어가기대문에 scanner.nextLine();을 깡으로 써 남아있던
//      엔터를 소비해주어야 다음 내가 쓸것인 nextLine();을 출력할수있다.

        System.out.print("사용자의 이름은 " + name + "이며 나이는 " + age + "입니다.");
        System.out.println("주소는 " + address + "이며 연락처는 " + phone + "입니다.");
    }
}
