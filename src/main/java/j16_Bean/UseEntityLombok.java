package j16_Bean;


import lombok.*;

import java.util.Objects;

// 정보를 담는 객체를 Entity Class 라 한다.
/*
    Entitiy Class 순서

    맴버 변수 선언
    생성자 정의
    Getters and Setters 정의
    Equals and HashCode 정의
    toString 정의

 */

@NoArgsConstructor//       -> 변수가 없는 생성자
@AllArgsConstructor//      -> 변수가 있는 생성자
//@Getter   -> getter
//@Setter   -> setter
//@EqualsAndHashCode       -> equalAndHashCode
//@ToString                -> toString
@Data

public class UseEntityLombok {

    private String username;
    private String password;
    private String email;
    private String name;



}
