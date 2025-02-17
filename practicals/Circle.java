//write a program to calculate area of circle and perimeter of circle

import java.util.*;
public class Circle
{
  public static void main(String args[])
{
     
   Scanner obj = new Scanner(System.in);
   System.out.println("Enter the Radius of circle:");
   
   double r = obj.nextDouble();
   double pi=3.14;
   System.out.println("Area is="+(pi*r*r));
   System.out.println("Perimeter is="+(2*pi*r));
}
} 
