package week4.randomness;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        WeatherForecaster forecaster = new WeatherForecaster();

        //use a list for better organization
        ArrayList<String>  days = new ArrayList<>();
        Collections.addAll(days, "Mon", "Tue", "Wed","Thu", "Fri", "Sat", "Sun");
        System.out.println("Weather forecast for the next week");

        for (String day: days){
            String weatherForecast = forecaster.forecastWeather();
            int temperatureForecast = forecaster.forecastTemperature();

            System.out.println(day + ": " + weatherForecast + " " + temperatureForecast + " degrees.");
        }
    }
}
