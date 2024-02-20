// singal level inheritance in  arr user input 10 number input and display is even or odd

import java.util.*;

class First
{

    Scanner sc = new Scanner(System.in);
    int no[] = new int[10];
    First()
    {
        for(int i=1; i< no.length; i++)
        {
                 System.out.print("Enter number : ");
                 no[i] = sc.nextInt();
        }   
        
    }
}

class dis extends First{

    dis()
    {   
        System.out.println("\ndisplay even and odd number ");
        for( int i=1; i<no.length; i++)
        {
            if(no[i]%2==0)
            {
                System.out.println("Entered Number is Even : "+no[i]);
            }
            else
            {
                System.out.println("Entered Number is odd : "+no[i]);
            }
        }
    }
}

class inh1{

    public static void main(String[] args)
	{
		dis s = new dis();
	}
}