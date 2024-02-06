 import java.util.*;

class Mca{
	Mca(int no)
	{
		System.out.print("Student RollNo is : " +no);
	}
	Mca(String nm, int no)
	{
		System.out.print("Student Name is : " +nm);
		System.out.print("Student RollNo is : " +no);
	}
}

class Cons_o{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		String nm = sc.nextLine();

		System.out.println("Enter Student RollNo : ");
		int no = sc.nextInt();

		Mca val = new Mca(no);
		Mca val1= new Mca(nm,no);
		
	}
}