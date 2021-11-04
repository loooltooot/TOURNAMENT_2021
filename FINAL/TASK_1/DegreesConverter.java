/*
Author: Zakrewski
Date: 27.10.2021
*/

public class DegreesConverter {
    private static double roundToTenths(double num) {
        return Math.floor(num * 10) / 10;
    }

    public static double convertFahrenheitToCelsius(double degreesInFahrenheit) {
        return roundToTenths((degreesInFahrenheit - 32) / 1.8);
    }

    public static double convertFahrenheitToKelvin(double degreesInFahrenheit) {
        return roundToTenths(convertFahrenheitToCelsius(degreesInFahrenheit) + 273.15);
    }

    public static double convertCelsiusToFahrenheit(double degreesInCelsius) {
        return roundToTenths(degreesInCelsius * 1.8) + 32;
    }

    public static double convertCelsiusToKelvin(double degreesInCelsius) {
        return roundToTenths(degreesInCelsius + 273.15);
    }

    public static double convertKelvinToCelsius(double degreesInKelvin) {
        return roundToTenths(degreesInKelvin - 273.15);
    }

    public static double convertKelvinToFahrenheit(double degreesInKelvin) {
        return convertCelsiusToFahrenheit(convertKelvinToCelsius(degreesInKelvin));
    }

}
