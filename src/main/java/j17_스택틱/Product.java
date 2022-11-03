package j17_스택틱;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
public class Product {
    public static int autoIncrement = 20220000;
    private int serialNumber = 20220001;
    private String productName;

    public Product(String productName) {
        serialNumber = ++autoIncrement;
        this.productName = productName;
    }

    public static int getAutoIncrement() {
        return autoIncrement;
    }

    public static void printInfo() {// 생성이 안된녀석이 생성이 되야만 호출하는 메소드에가서 호출불가.
        // System.out.println(productName); // static 메소드안에서는 static 변수만 사용가능하다
        // 멤버변수는 스택틱 메소드에서 사용할 수 없다.

        Product product = new Product("product");
        System.out.println(product.productName); // 자기자신을 생성했기때문에 호출이 가능하다.
        System.out.println(autoIncrement);
    }

}