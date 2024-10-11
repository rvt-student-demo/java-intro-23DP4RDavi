package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers: ");
        int sum = 0;
        int count = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            int num = scanner.nextInt();
        
            if (num == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                avg = (double)sum / (double)count;
                System.out.println("Average: " + avg);
                break;
            }
            else{
                sum = num + sum;
                count = count + 1;
                if (num % 2 == 0) {
                    even = even + 1;
                } else {
                    odd = odd + 1;
                }
                continue;
            }

        }
        
    }
}
