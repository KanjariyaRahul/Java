import java.util.*;

class Get
{
    Scanner sc = new Scanner(System.in);
    int i,j,no;
    int num[] = new int[5];
}

class Sort extends Get{

    Sort()
    {
        for( int i = 0; i<num.length; i++)
        {
            System.out.print("Enter Number : ");
            num[i] = sc.nextInt();
        }
    }
    void Process()
    {
        System.out.println("\n Sorting is : ");
        int temp = 0;
        for( int i = 0; i<num.length; i++)
        {
            for( int j=i+i; j<num.length; j++)
            {
                if(num[i] >num[j])
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
            System.out.println("Number is :  "+num[i]); 
        }
    }
}

class pattern extends Get{

    pattern()
    {
        System.out.print("Enter Number : ");
        no = sc.nextInt();
    }
    void Floyd()
    {
        int k=1;
        for( int i=1; i<=no; i++)
        {
            for( int j=1; j<=i; j++)
            {
                System.out.print(" "+k);
                k++;
            }
            System.out.println(" ");
        }
    }
}

 class Hir2_Inh {
    public static void main(String[] args) {

        Sort s = new Sort();
        s.Process();

        pattern p = new pattern();
        p.Floyd();

    }
    
}
