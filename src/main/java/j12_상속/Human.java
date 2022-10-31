package j12_상속;

public class Human extends Animal{

    public Human(String name){
        super(name);  // human이 생성될때 이 생성자가 먼저 실행이 된다
        System.out.println("Human 생성");
    }

    /*
       메소드 오버 라이딩(오버라이드)
       [ 재정의 ]
       상위(Animal) 객체의 메소드를 하위(Human) 객체에서 다시 정의하는 행위
    */
    @Override // 해당 메소드가 상위 객체로부터 재정의 된 메소드 입니다 를 표기
        public void move(){
        super.move();
        // move(); // 재기함수 (함수안에서 자기자신을 호출하는), (this가 생략되어있다)
        System.out.println("두 발로 걷습니다.");

    }


}
