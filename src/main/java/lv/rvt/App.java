package lv.rvt;

import java.util.*;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many times? ");
        int times = scanner.nextInt();
        for (int repeat = 0; repeat != times;){
            printText();
            repeat++;
        }
    }
    
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}