package j17_스택틱.빌더;

public class UserMain {

    public static void main(String[] args) {

        User user = User.builder()
                .email("cjftn11212@gmail.com")
                .username("철수")
                .build();
        // 위에가 빌더 패턴이다

        System.out.println(user);

        User2 user2 = User2.builder()
                .name("영희")
                .build();

        System.out.println(user2);

        User u = user2.to();
        System.out.println(u);

    }
}
