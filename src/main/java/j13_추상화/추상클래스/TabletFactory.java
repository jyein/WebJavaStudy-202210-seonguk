package j13_추상화.추상클래스;

public class TabletFactory extends Factory{


    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ] 모델  태블릿을 생산합니다.");
    }

    public TabletFactory(String name) {
        super(name);
    }

    @Override
    public void management() {
        System.out.println("태블릿 공장을 관리합니다.");
    }
}
