package class5;

public class Weather {
    String city;
    double temperature;
    double windSpeed;

    Weather(String city, double temperature, double windSpeed) {
        this.city = city;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
    }

    void print() {
        System.out.println(city + "| 기온 " + temperature + "ᴼC | 바람 " + windSpeed + "km/h");
    }
}
