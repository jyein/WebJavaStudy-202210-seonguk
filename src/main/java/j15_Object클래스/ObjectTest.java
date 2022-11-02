package j15_Object클래스;

/*
 * 모든 클래스는 Object 클래스를 상속받는다.
 * 자바에서 import를 하지않는 경우가 한가지가 있는데
 * External Libraries 안에 있는 것들은 (자바 기본문법) 상속,임포트를 하지 않는다.
 * ex) String이나 Override 등등
 */

public class ObjectTest extends Object {

    private String name;
    private String address;

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public ObjectTest() {}

    public String showInfo() {
        return "name: " + name + " address: " + address;
    }

    @Override
    public String toString() {
        return "name: " + name + " address: " + address;
    }
}
