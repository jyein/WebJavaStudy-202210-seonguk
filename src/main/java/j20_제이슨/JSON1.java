package j20_제이슨;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("username", "seojin");
        jsonObject.addProperty("password", "1234");
        jsonObject.addProperty("email", "sakdiwk@gmail.com");
        jsonObject.addProperty("name", "김서진");
        jsonObject.addProperty("age", "25");

        System.out.println(jsonObject);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(jsonObject);
        System.out.println(json);
    }
}
