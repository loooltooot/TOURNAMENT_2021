/*
Author: Zakrewski
Date: 27.10.2021
*/

public class Main {
    public static void main(String[] args) {
        double showDegree = 36.6; // 32 градуса в любой системе измерения

        System.out.printf("%.1f° in Celsius to Fahrenheit: %.1f °F\n",
                showDegree, DegreesConverter.convertCelsiusToFahrenheit(showDegree));
        System.out.printf("%.1f° in Celsius to Kelvin: %.1f K\n",
                showDegree, DegreesConverter.convertCelsiusToKelvin(showDegree));
        System.out.printf("%.1f° in Fahrenheit to Celsius: %.1f °C\n",
                showDegree, DegreesConverter.convertFahrenheitToCelsius(showDegree));
        System.out.printf("%.1f° in Fahrenheit to Kelvin: %.1f K\n",
                showDegree, DegreesConverter.convertFahrenheitToKelvin(showDegree));
        System.out.printf("%.1f° in Kelvin to Celsius: %.1f °C\n",
                showDegree, DegreesConverter.convertKelvinToCelsius(showDegree));
        System.out.printf("%.1f° in Kelvin to Fahrenheit: %.1f °F\n",
                showDegree, DegreesConverter.convertKelvinToFahrenheit(showDegree));
    }
}
