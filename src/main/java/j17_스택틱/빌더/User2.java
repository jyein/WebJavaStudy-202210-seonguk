package j17_스택틱.빌더;


import lombok.Builder;
import lombok.ToString;

@Builder // 자동으로 null을 추가해준다 (값이 없을때)
@ToString
public class User2 {
    private String username;
    private String password;
    private String email;
    private String name;

    public User to() {
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .name(name)
                .build();
    }

}
