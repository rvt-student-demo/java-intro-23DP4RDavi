package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        String group = scanner.nextLine();

        System.out.println("Students: " + name + " " + surname + ", grupa " + group);
    }
}
