package class5;

public class WeatherApi {
    static final String BASE = "https://api.com.open-meteo.com/v1/forecast";

    static Weather getWeather(String city, double lat, double lon) throws Exception{
        String url = BASE + "?latitude=" + lat + "&longitude=" + lon
                + "&current=temperature_2m,wind_speed_10m";
        String json = Api.get(url);

        int from = json.indexOf("\"current\":{");
        double temp = Double.parseDouble(JsonUtil.getValue(json,"temperature_2m", from));
        double wind = Double.parseDouble(JsonUtil.getValue(json,"wind_speed_10m", from));
        return new Weather(city, temp, wind);
    }
}
