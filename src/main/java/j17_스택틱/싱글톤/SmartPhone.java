package j17_스택틱.싱글톤;


import lombok.AllArgsConstructor;
import lombok.ToString;

// 스마트폰은 여러개를 찍어내기때문에 싱글톤이 아니다

@AllArgsConstructor
@ToString
public class SmartPhone {

    private String company;
    private String model;
    private String serial;

}
