import java.util.*;
class Duck
{

	int no,rem ,c=0;
	Scanner sc = new Scanner(System.in);
	Duck()
	{
		System.out.print("Enter Any Number : ");
		int no = sc.nextInt();
		while(no != 0)
		{
			rem = no%10;
			if(no% 10 == 0)
			
			c++;
			no = no /10;
		}
		if(c > no)
			System.out.println("duck number");

		else
			System.out.println("not duck number ");
	}

}


class Duck_c{

	public static void main(String[] args) {
			
		
		
		Duck dc = new Duck(no)

		
	}
}