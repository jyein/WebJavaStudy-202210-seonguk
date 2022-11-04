package j18_제네릭;

import java.util.Date;

public class DataController {

    public static void main(String[] args) {

        Date now = new Date();

        ResponseDate<String> responseDate = new ResponseDate<String>("날짜 저장 성공!", now.toString());
        System.out.println(responseDate);
        ResponseDate<Integer> responseDate2 = new ResponseDate<Integer>("날짜 저장 성공!", 10);
        System.out.println(responseDate2);

        ResponseDate<Date> responseDate3 = new ResponseDate<Date>("날짜 객체 저장 성공", now);
        System.out.println(responseDate3);
    }
}
