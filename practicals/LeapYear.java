package practicals;

//Write a JAVA program that takes a year from the user an print whether it is a leap year or not.

import java.util.*;

public class LeapYear 
{
    public static void main(String args[] )
    {
    int year;
    System.out.println("Enter year:");
    Scanner obj = new Scanner(System.in);
    year = obj.nextInt();

    if( year % 4 == 0)
        System.out.println(year + "Leap year");
    else
        System.out.println("Not leap year");
   }
}
