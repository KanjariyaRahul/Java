import java.util.*;

class First
{

    Scanner sc = new Scanner(System.in);
    First()
    {
        for(int i=1; i<=25; i++)
        {
            if(i%2==0)
            {
                System.out.println("Entered Number is Even : "+i);
            }
            else
            {
                System.out.println("Entered Number is odd : "+i);
            }
        }
        
    }
}

class Second extends First{

    Second()
    {   
        int no=15;
        for(int i=1; i<=10; i++)
        {
            System.out.print(no + " * " + i + " = " + no*i + "\n");
        }
    }
}

class inh{

    public static void main(String[] args)
	{

		Second s = new Second();
	}
}