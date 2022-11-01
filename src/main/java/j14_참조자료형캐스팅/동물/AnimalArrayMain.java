package j14_참조자료형캐스팅.동물;


public class AnimalArrayMain {

    public static void main(String[] args) {

        Animal[] animals = new Animal[4];
        // 업캐스팅을 하는목적 = 반복을 하기 위해서

        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();

        for(int i = 0; i < animals.length; i++) {
            animals[i].move();
        }

        // instance = 생성된 녀석
        for(int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Human) { // instance로 꺼낸 아이가 Human이라면
//                Human h = (Human)animals[i];
//                h.readBooks();
                ((Human) animals[i]).readBooks(); // '.'이 다운캐스팅보다 우선도가 높다
            }else if (animals[i] instanceof Tiger){
                ((Tiger) animals[i]).hunting();
            }
        }


    }
}
