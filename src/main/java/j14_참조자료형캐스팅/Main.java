package j14_참조자료형캐스팅;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer();
        LED led = new LED();
        Speaker speaker = new Speaker();

        // 업캐스팅은 묵시적 형변환이 된다.
        CentralControl centralControl = new CentralControl(computer, led, speaker);
        // 멀티탭으로 비유하면 이해하기 좋다.


        centralControl.powerOn();
        System.out.println("-----------------------");
        centralControl.powerOff();

    }
}
