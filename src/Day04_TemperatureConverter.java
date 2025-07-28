public class Day04_TemperatureConverter {

    public static double fahrenheitToCelsius(double c) {

        c = (c - 32) * 5 / 9;
        return c;

    }

    public static double celsiusToFahrenheit(double c) {

        c = (c * 9 / 5) + 32;
        return c;

    }

    public static double celsiusToKelvin(double c) {
        c += 273.15;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(fahrenheitToCelsius(90));
        System.out.println(celsiusToFahrenheit(90));
        System.out.println(celsiusToKelvin(90));
    }
}
