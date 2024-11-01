package lv.rvt;

import java.util.*;

class PersonalDetails
{
  public static void main ( String[] args )
  {
    int bdayavg = 0;
    String longest = "";
    Scanner scanner = new Scanner(System.in);
    String[] names = {"","","","",""};
    int[] bdays = {0,0,0,0,0};
    for (int i = 0; i < 5; i++){
      names[i] = String.valueOf(scanner.nextLine());
      bdays[i] = Integer.valueOf(scanner.nextLine());
      if (names[i].length() > longest.length()){
        longest = names[i];
      }
      bdayavg += bdays[i];
    }
    System.out.println("Longest name:" + longest);
    System.out.println("Average birth year:" + bdayavg / 5);
   }
}