package class5;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception {
        String json = Api.get("https://pokeapi.co/api/v2/pokemon/pikachu");
        int id = Integer.parseInt(JsonUtil.getValue(json, "id"));
        int height = Integer.parseInt(JsonUtil.getValue(json, "height"));
        int weight = Integer.parseInt(JsonUtil.getValue(json, "weight"));
        System.out.println("도감 번호: " + id);
        System.out.println("키: " + (height / 10.0) + "m");
        System.out.println("몸무게: " + (weight / 10.0) + "kg");
    }
}
