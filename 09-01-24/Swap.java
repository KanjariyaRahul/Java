import java.util.Scanner;

public class Swap{
	
	public static void main(String[] args)
	{
		int x , y;

        Scanner scanner = new Scanner(System.in);

    System.out.print("Enter First Numbers : ");
    x = scanner.nextInt();
    
    System.out.print("Enter Second Numbers : ");
    y = scanner.nextInt();


		System.out.println("Before Swap");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	
		x = x + y;  
        y = x - y;
        x = x - y;  

		System.out.println("After swap");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
