package j13_추상화.추상클래스;

//abstract가 클래스에 하나라도 있으면 이 클래스는 추상클래스가 되어야 한다

public abstract class Factory {

     /*
        abstract >> 추상적인

        추상클래스
        1. 추상 메소드가 하나라도 포함되면 해당 클래스는 추상클래스로
           정의 되어야 한다.
        2. 추상 클래스는 생성할 수 없다.
        3. 그외의 다른 특징은 일반 클래스와 동일하다.

        구현부가 없어서 실행할수가 없는 메소드이다.
        이것을 설계도다 라고하기도 한다.
        클래스가 대충 찍어내는 집이라고 하면 추상클래스는 도면이라 한다.

        구현을 안하면 실행을 할수 없어서 강제성을 띄운다.
        오버라이드를 하지않으면 실행되지 않는다
    */

    private String name;

    // 생성자는 정의 할수 있지만 자체적으로 호출은 안된다.
    public Factory(String name) {
        this.name = name;
    }


    public abstract void produce(String model); // 선언부
    public abstract void management();

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    // 일반 메소드도 사용 가능하다
    public void printInfo(){
        System.out.println("공장의 정보를 출력합니다.");
        System.out.println("공장이름 " + name);
    }

}
