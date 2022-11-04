package j17_스택틱.빌더;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private String username;
    private String password;
    private String email;
    private String name;

    // ---------------------------------------------------------------------------------------
    public static class UserBuilder { // 이 클래스는 User클래스 안에서만 쓸수있다.
        private String username;
        private String password;
        private String email;
        private String name;

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public User build() {
            return new User(username, password, email, name);
        }

    }

    // ---------------------------------------------------------------------------------------
    // 위의 메소드를 호출하는것이 밑에 메소드이다
    public static UserBuilder builder() {
        return new UserBuilder();
    }
}
