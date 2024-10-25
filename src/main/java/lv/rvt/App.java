package lv.rvt;

import java.util.*;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to print? ");
        System.out.println("1) triangle");
        System.out.println("2) cristmass tree");
        int selection = scanner.nextInt(); 
        if (selection == 1) {
            System.out.print("Enter the size of the triangle: ");
            int size = scanner.nextInt();
            printTriangle(size);
        }
        else if (selection == 2) {
            System.out.print("Enter the size of the Christmas tree: ");
            int size = scanner.nextInt();
            christmasTree(size);
        }
    }
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = size - i; j > 0; j--) {
                System.out.print("");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void christmasTree(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        size = size / 3;
    }
}