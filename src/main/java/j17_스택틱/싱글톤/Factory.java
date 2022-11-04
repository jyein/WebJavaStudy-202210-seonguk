package j17_스택틱.싱글톤;

import lombok.AllArgsConstructor;

// 공장은 여러개 생길수 있기때문에 싱글톤이 아니다
@AllArgsConstructor
public class Factory {

    private String factoryName;

    public SmartPhone produceSmartPhone() {
        System.out.println(factoryName + "에서 스마트폰을 생산합니다.");
        String model = "갤럭시S";
        String serial = null;
        Samsung samsung = Samsung.getInstance();
        serial = samsung.createSerialNumber(model);

        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model, serial);
        return smartPhone;
    }

}
