package LogicalProgramming;

import java.util.Scanner;

public class temperatureConversion {
    public static void main(String[] args) {
        /*
        Celsius to Fahrenheit: F = (C * 9/5) + 32
Fahrenheit to Celsius: C = (F - 32) * 5/9
Celsius to Kelvin: K = C + 273.15
Kelvin to Celsius: C = K - 273.15 */

        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter the Temperature in Celsius =  ");
        double celsius = sc.nextDouble();

        double fahrenheit = ((celsius * 9) / 5) + 32;
        //double fahrenheit = (1.8 * celsius) + 32;

        System.out.println("Temperature in Celsius    = " + celsius);
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }


}
