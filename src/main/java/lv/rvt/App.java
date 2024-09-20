package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        double num1 = Double.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double num2 = Double.valueOf(scanner.nextLine());

        double result1 = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result1);
        double result2 = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result2);
        double result3 = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result3);
        double result4 = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result4);

    }
}
