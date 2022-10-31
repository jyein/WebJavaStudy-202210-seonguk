package j12_상속;

public class Animal {

    private String name;
    public void move(){
        System.out.println("움직입니다.");

    }

    public Animal(String name){
        System.out.println("Animal 생성");
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
