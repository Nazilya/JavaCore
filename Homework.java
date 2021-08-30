package lesson8.Homework;
// GET /forecasts/v1/daily/5day/292177?apikey=cXJitC2Z998D8AetUAG0ws6hF37I8UR2&language=ru-ru&metric=true HTTP/1.1
// http://dataservice.accuweather.com/forecasts/v1/daily/5day/{292177}
// https://developer.accuweather.com/accuweather-forecast-api/apis/get/forecasts/v1/daily/5day/%7BlocationKey%7D

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.databind.ObjectMapper;
import lesson8.Homework.dto.WeatherResponse;
import lesson8.Homework.dto.DailyForecast;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Objects;

public class Homework {
    public static final String HOST = "dataservice.accuweather.com";
    public static final String FORECAST_URL = "forecasts";
    public static final String DAILY_URL = "daily";
    public static final String FIVE_DAYS_URL = "5day";
    public static final String API_VERSION = "v1";
    public static final String CITY_ID = "292177"; //295212 - Питер
    public static final String API_KEY = "cXJitC2Z998D8AetUAG0ws6hF37I8UR2";
    public static final String LANGUAGE = "ru-ru";
    public static final String METRIC = "true";

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(HOST)
                .addPathSegment(FORECAST_URL)
                .addPathSegment(API_VERSION)
                .addPathSegment(DAILY_URL)
                .addPathSegment(FIVE_DAYS_URL)
                .addPathSegment(CITY_ID)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("language", LANGUAGE)
                .addQueryParameter("metric", METRIC)
                .build();

        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        ObjectMapper objectMapper = new ObjectMapper();
        WeatherResponse weatherResponse = objectMapper.readValue(response.body().byteStream(), WeatherResponse.class);

        for (DailyForecast forecast : weatherResponse.getDailyForecasts()) {
            System.out.printf(
                    "Погода в Уфе на %s\n" +
                    "%s, температура от %.1f до %.1f %s\n\n",
                    forecast.getDate(),
                    forecast.getDay().getIconPhrase(),
                    forecast.getTemperature().getMinimum().getValue(),
                    forecast.getTemperature().getMaximum().getValue(),
                    forecast.getTemperature().getMinimum().getUnit());
        }

    }
}
