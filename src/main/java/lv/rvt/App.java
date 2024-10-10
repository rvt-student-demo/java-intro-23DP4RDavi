package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double amt = 0;

        while (true) {
            System.out.println("Give a number: ");
            double numb = Double.valueOf(scanner.nextLine());
            if (numb == 0) {
                System.out.println("Number of numbers: " + amt);
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
            else{
                sum = sum + numb;
                amt = amt + 1;
            }
            

        }

    }
}

