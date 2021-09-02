package lesson8.Homework.entity;

public class WeatherForecast {
    private final String city;
    private final String localDate;
    private final String weatherText;
    private final String temperature;

    public WeatherForecast(String city, String localDate, String weatherText, String temperature) {
        this.city = city;
        this.localDate = localDate;
        this.weatherText = weatherText;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "WeatherForecast{" +
                "city='" + city + '\'' +
                ", localDate='" + localDate + '\'' +
                ", weatherText='" + weatherText + '\'' +
                ", temperature='" + temperature +
                '}';
    }
}
