package j14_참조자료형캐스팅.동물;

public class AnimalMain {
    public static void main(String[] args) {

        Human human = new Human();
        Tiger tiger = new Tiger();
        Animal animal1 = null;
        Animal animal2 = null;


        System.out.println("[캐스팅 전]");
        human.move();
        human.readBooks();
        tiger.move();
        tiger.hunting();

        System.out.println();

        System.out.println("[캐스팅]");

        // 상위 자료형으로 형 변환했다 <업캐스팅>
        // 묵시적 형변환
        System.out.println("<업캐스팅>");

        animal1 = human;
        animal2 = tiger;
        animal1.move();
        animal2.move();

        System.out.println();
        // 상위 객체에서 하위객체로 형변환
        // 명시적 형변환
        System.out.println("<다운캐스팅>");
        Human d_human = (Human) animal1;
        Tiger d_tiger = (Tiger) animal2;
        d_human.readBooks();
        d_tiger.hunting();

        System.out.println("----------------------------");
        System.out.println();

        // Animal이 한번이라도 Human이랑 업캐스팅이 되었다면 가능하지만
        // 한번도 업캐스팅이 되지않았으면 불가능하다
        // ex) Human이랑 Animal이 업캐스팅이 된뒤
        //     Animal이 다운캐스팅이 되더라도 Human은 비활성화 되어있는 상태라
        //     Animal이 다시 업캐스팅 되면 Human이 활성화되 가능하다
        //     (ps.) Animal이 다운캐스팅이 되었다가 다시 업캐스팅할때에는
        //     그전에 업캐스팅이 된것 이랑만 가능하다
//        Animal a = new Animal();
//        Human h = (Human) a;
//        h.readBooks();

    }
}
