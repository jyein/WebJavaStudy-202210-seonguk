package j02_변수상수;

/*변수*/
public class Veriable {
    public static void main(String[] args) {


        // 논리자료형 변수
        boolean checkFlag = false;
        System.out.println(checkFlag);
        checkFlag = true;
        System.out.println(checkFlag);

        // 문자자료형 변수
        char name1 = '홍';
        char name2 = '성';
        char name3 = '욱';

        System.out.println("" + name1 + name2 + name3);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println('가' + 0);

        // 문자형자료형 변수
        String name = "홍성욱";
        String name4 = "윤도영";
        String name5 = name + name4;
        System.out.println(name5);

        // 정수자료형 변수
        int width = 100;
        int width1 = 200;

        String width3 = "300";
        String width4 = "400";

        int widthResult = width + width1;
        String widthResult1 = width3 + width4;

        System.out.println(widthResult);
        System.out.println(widthResult1);

        long time = System.currentTimeMillis();
        System.out.println(time);

        long time2 = 1666179071530L;
        System.out.println(time2);

        // 실수자료형 변수
        double pi = 30000000.141592365359999999;
        System.out.println(pi);

        final String File_PATH = "C:/Users/juil";
//        File_PATH = "D:/Users/aaa";
        System.out.println(File_PATH);
    }
}
