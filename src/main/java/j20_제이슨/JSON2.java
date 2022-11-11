package j20_제이슨;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Data
class User {
    private String username;
    private String password;
    private String email;
    private String name;
}

public class JSON2 {

    public static void main(String[] args) {

        // Gson으로 변환 할 수 있는 객체의 종류
        // JsonObject, Object, Map

        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        Gson gson2 = new Gson();
        // gson 이랑 gson2가 같은방식이다 대신 gson은 prettyprinting 으로 출력되기때문에 보기가 쉽다.


        String userJson = null;
        String studentJson = null;
        String productJson = null;


        // Objcet(객체) -> JSON
        User user = new User("junil", "1234", "asdasd@gmail.com", "김준일");
        System.out.println(gsonBuilder.toJson(user));
        System.out.println(gson2.toJson(user));
        userJson = gsonBuilder.toJson(user);

        // JsonObject -> JSON
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("studentCode", "20220001");
        jsonObject.addProperty("studentName", "김준이");
        jsonObject.addProperty("studentYear", "2");
        System.out.println(gsonBuilder.toJson(jsonObject));
        studentJson = gsonBuilder.toJson(jsonObject);


        // Map -> JSON
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("productCode", "P-20220001");
        map.put("productName", "삼성 노트북");
        System.out.println(gsonBuilder.toJson(map));
        productJson = gsonBuilder.toJson(map);


        // JSON -> Map
        System.out.println("----------------------------------");
        Map<String, Object> jsonData = convertJsonToMap(userJson);
        System.out.println(jsonData.get("name"));

        jsonData = convertJsonToMap(studentJson);
        System.out.println(jsonData);

        jsonData = convertJsonToMap(productJson);
        System.out.println(jsonData);

        // JSON -> JsonObject
        System.out.println("----------------------------------");
        JsonObject jsonObj = convertJsonToJsonObject(userJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToJsonObject(studentJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToJsonObject(productJson);
        System.out.println(jsonObj);

        // JSON -> User
        System.out.println("----------------------------------");
        User userObj = convertJonToUser(userJson);
        System.out.println(userObj);

        userObj = convertJonToUser(studentJson);
        System.out.println(userObj);

        userObj = convertJonToUser(productJson);
        System.out.println(userObj);


    }

    public static Map convertJsonToMap(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Map.class);
    }

    public static JsonObject convertJsonToJsonObject(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, JsonObject.class);
    }

    public static User convertJonToUser(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, User.class);
    }

}
