import java.util.*;

class get{

	Scanner sc = new Scanner(System.in);
	int no; 

	get()
	{
		System.out.print("Enter your Table print :");
		no = sc.nextInt();
	}
}

class table extends get
{
	table()
	{
		System.out.println("table is -> " + no);
		
		for(int i=1; i<=no; i++)
		{
			System.out.println(no+ "*" + i + "=" + (no*i));
		}
	}
	
} 
class square extends get
{
	square()
	{
		System.out.println("square is :");
		for(int i=1; i<=no; i++)
		{
		System.out.println(i+ "*" + i + "=" + (i*i));
		}	
	}
}


class tab{

	public static void main(String[] args) {
		
		table t = new table();
		square s = new square();
	}
}