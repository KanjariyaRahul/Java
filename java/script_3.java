// Write a program that takes three numbers and checks and then prints the greatest number 

import java.util.Scanner;

public class script_3 {

  public static void main(String[] args) 
  {
    
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input the 1st number: ");
  int num1 = in.nextInt();
   
  System.out.print("Input the 2nd number: ");
  int num2 = in.nextInt();
   
  System.out.print("Input the 3rd number: ");
  int num3 = in.nextInt();

  if( num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " is the largest number.");

        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + " is the largest number.");

        else
            System.out.println(num3 + " is the largest number.");

    }
}
