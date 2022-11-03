package j17_스택틱;

import j08_메소드.Method1;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductMain {

    private String name;

    // JBM이 main에서는 static을 호출할수있도록 해준다
    // static이 없다면 생성을 해줘야 호출가능
    public static void main(String[] args) {

        int autoIncrement = Product.getAutoIncrement();
        System.out.println(autoIncrement);
        System.out.println(Product.getAutoIncrement());
        Product.autoIncrement++;
        System.out.println(Product.getAutoIncrement());

        Product p1 = new Product("p1");
        System.out.println(p1.getAutoIncrement());

        System.out.println(PathRepository.PRODEUCT_IMG_PATH);
        System.out.println(PathRepository.PROFILE_IMG_PATH);
        System.out.println(PathRepository.MAIN_IMG_PATH);

        Product.printInfo();

//        ProductMain.main(new String[] {});
        // 이건 main 에서 main을 계속 호출해서 무한루프가 돈다.
        // 어느정도 나오다가 스택메모리 오버플로우가 나서 오류가 난다.
        // 스택메모리도 제한이 있기 때문

       ProductMain productMain = new ProductMain();

       productMain.setName("테스트");
        System.out.println(productMain.getName());

        Method1.main(new String[]{});
        Method1.call1();

    }
}
