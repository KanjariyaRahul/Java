import java.util.*;

public class Triangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for Floyd Triangle: ");  
        int rows = sc.nextInt();  
        int number = 1;  
        System.out.println("Floyd Triangle:");  
        
        for(int i=1; i <= rows; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();  
        }
    }
}

 