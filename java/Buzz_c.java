 import java.util.*;

class Buzz{

	Buzz(int no)
	{
		if(no % 10 == 7 || no % 7 == 0)
		{
			System.out.print("number is buzz");
		}
		else
		{
			System.out.println("number is not buzz number");
		}
	}
	
}

class Buzz_c{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student RollNo : ");
		int no = sc.nextInt();

		Buzz val = new Buzz(no);
		
	}
}