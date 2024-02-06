import java.util.*;

class First
{
	void Std(int no)
	{
		System.out.println("Roll No is :" + no);
	}
	void Std(String nm)
	{
		System.out.println("Student name : "+ nm);
	}
}

class Mthod_o{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		String nm = sc.nextLine();

		System.out.println("Enter Student RollNo : ");
		int no = sc.nextInt();

		First f = new First()
		f.Std(no);
		f.Std(nm);
		
	}
}