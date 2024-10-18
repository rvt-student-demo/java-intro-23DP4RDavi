package lv.rvt;

import java.util.*;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter what a number of u want to print out:");
        System.out.println("1: line");
        System.out.println("2: square");
        System.out.println("3: rectangle");
        System.out.println("4: triangle");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("How long should it be?");
            int x = scanner.nextInt();
            printStars(x);
        }
        else if (choice == 2) {
            System.out.println("How wide/tall should it be?");
            int x = scanner.nextInt();
            printSquare(x);
        }
        else if (choice == 3) {
            System.out.println("How wide should it be?");
            int x = scanner.nextInt();
            System.out.println("How high should it be?");
            int y = scanner.nextInt();
        }
        else if (choice == 4) {
            System.out.println("How tall should it be?");
            int x = scanner.nextInt();
            printTriangle(x);
        }
    }
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = size - i - 1; j > 0; j--) {
                System.out.println();
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}