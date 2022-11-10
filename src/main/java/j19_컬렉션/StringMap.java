package j19_컬렉션;

import java.util.*;

public class StringMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        List<String> list = new ArrayList<String>();

        list.add("김준일");
        list.add("이동빈");
        list.add("도정민");
        list.add("최해혁");
        list.add("김준일");

        System.out.println(list);
        System.out.println(list.get(3));

        // map 에는 키랑 벨류값을 같이 넣어줘야 된다 첫번째는 키값 뒤에는 벨류값
        // put을 이용한 값 추가
        map.put("kor2022000-j", "김준일");
        map.put("kor2022000-l", "이동빈");
        map.put("kor2022000-d", "도정민");
        map.put("kor2022000-c", "최해혁");
        map.put("kor2022000-j2", "김준일");

        // set처럼 순서가없이 저장되기때문에 set이랑 동일하다
        System.out.println(map);
        System.out.println(map.get("kor2022000-d"));
        // 대신 get을 사용할수있다

        /*
            kor2022000-c 학번의 학생의 이름을 김완준으로 바꿔라.
        */

        String searchId = "kor2022000-c";

        // key값은 중복을 허용하지 않는다
        // put을 사용하여 값 변경
        map.put(searchId, "김완준");
        System.out.println(map);
        // replace를 사용하여 값 수정
        map.replace(searchId, "이성욱");
        System.out.println(map);
        // replace == list set()과 동일하다.

        // remove를 사용하여 값 삭제
        map.remove(searchId);
        System.out.println(map);

//        map.getOrDefault() -> 찾을 키값 , 그 키값이 없다면 벨류
//        map.keySet()  ->  키값들만 셋으로 만들어놓은것
//        map.putAll();   -> map 을 map에다가 넣을떄 (단 키값이 같을때 가능)
//        map.values()   -> 벨류들만을 컬렉션으로 리턴해준다.

        boolean searchSuccessflag = map.containsKey("kor2022000-j2"); // 찾는 키값이 있니?
        System.out.println(searchSuccessflag);

        searchSuccessflag = map.containsValue("김준이"); // 찾는 벨류가 있니?
        System.out.println(searchSuccessflag);

        Set<Map.Entry<String, String>> entry = map.entrySet(); // 제네릭 안에 제네릭이 포함되어있다.
        List<Map.Entry<String, String>> entries = new ArrayList<Map.Entry<String, String>>();
        // Entry 는 키와 벨류가 묶여있는 형태

        entries.addAll(entry);

        System.out.println("entry 리스트 : " + entries);


        Iterator<Map.Entry<String, String>> iterator = entry.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> e = iterator.next();
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        entry.iterator().forEachRemaining(e -> {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        });

        Set<String> keySet = map.keySet();

        System.out.println("keySet >>>> " + keySet);

        Collection<String> values = map.values();

        System.out.println("values >>> " + values);

    }
}
