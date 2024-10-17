package lv.rvt;

import java.util.*;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number = scanner.nextInt();
        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();
        divisibleByThreeInRange(number, number2);
    }
    
    public static void divisibleByThreeInRange(int from, int till) {
        for (int i = from; i <= till; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}