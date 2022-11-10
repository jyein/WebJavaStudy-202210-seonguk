package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSet {
    public static void main(String[] args) {

        // 리스트안에서 중복을 제거할때 set을 쓴다

        Set<String> strSet = new HashSet<String>();
        List<String> strList = new ArrayList<String>();
        strList.add("이동빈");
        strList.add("이승아");
        strList.add("우예희");
        strList.add("이종준");
        strList.add("김준일");


        // 값 추가
        strSet.add("김준일");
        strSet.add("장혜민");
        strSet.add("정순동");
        strSet.add("김완준");
        strSet.add("송아셀");

        System.out.println(strSet);
        strSet.addAll(strList);
        System.out.println(strSet);

        // 값 조회
        String searchName = "김준일";

        /*
            strSet에 김준일이 있으면 true, 없으면 false
        */

        for (String name : strSet) {
            if (name.equals(searchName)) {
                System.out.println(true);
                break;
            }
        }

//      내가쓴 정답
//        boolean isTrue = strSet.contains("김준일");

//        while (isTrue == strSet.contains("김준일")) {
//            System.out.println(isTrue);
//            break;
//        }

        // 다른사람이 쓴 정답
//        boolean isTrue = false;
//
//        for (String name : strSet) {
//            if (name.equals(searchName)){
//                isTrue = true;
//                break;
//            }
//        }

        // 수정
        /*
            '송아셀'이라는 이름이 있으면 남강석으로 바꿔라
            송아셀 -> 남강석
         */

        for (String name : strSet) {
            if (name.equals("송아셀")) {
                strSet.remove("송아셀");
                strSet.add("남강석");
                break;
            }
        }

//        strSet.remove("송아셀");
//        strSet.add("남강석");

        System.out.println(strSet);

        searchName = "김준일";

        System.out.println(strSet.contains(searchName));

        if (strSet.contains(searchName)) {
            strSet.remove(searchName);
            strSet.add("김준이");
        }

        System.out.println(strSet);


    }
}
