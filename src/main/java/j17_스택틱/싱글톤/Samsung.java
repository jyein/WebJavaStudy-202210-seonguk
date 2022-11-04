package j17_스택틱.싱글톤;

import lombok.Getter;

// 삼성이라는 회사는 여러개가 아니기떄문에 싱글톤

public class Samsung {
    @Getter
    private String company;
    private int serialNumber;
    private static Samsung instance = null;

    private Samsung() {
        company = getClass().getSimpleName(); // 회사명이 클래스명으로 바뀌는 과정
        serialNumber = 20220000;
    }

    public static Samsung getInstance() {
        if (instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber;
    }

}
