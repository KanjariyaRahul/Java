// Write a Program a number is said to be Buzz Number if it ends with 7 or is divisible by 7.

import java.util.Scanner;

class script_2 {   
    
  
  
    public static void main(String args[])   
    {     
        int n1;
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter first number : ");  
        n1 = sc.nextInt();  
        
         if(n1 % 10 == 7 || n1 % 7 == 0)  
        
            System.out.println(n1 + " is a Buzz number");   
        else  
            System.out.println(n1 + " is not a Buzz number");   
       
    }   
}   