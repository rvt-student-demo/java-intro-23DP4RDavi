package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        for (double num = Double.valueOf(scanner.nextLine());num < 100;){
            num = num + 1;
            System.out.println(num);;
        }

    }
}

