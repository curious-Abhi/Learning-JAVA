// Challenge 2: Temperature Converter
// Task: Write a Java program to convert temperatures from Celsius to Fahrenheit.
// Formula: Fahrenheit = (Celsius * 9/5) + 32
// Input: Hardcode a Celsius value into the program.
// Output: Display the equivalent Fahrenheit value.


public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 56.7;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
