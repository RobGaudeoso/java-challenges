public class Main {
    public static void main(String[] args) {

        float tempCelsius = 40;
        int tempFahrenheit = (int) ((tempCelsius * 1.8) + 32);
        System.out.println(String.format("%.1f° Celsius equivale a %d° Fahrenheit", tempCelsius, tempFahrenheit));
    }
}