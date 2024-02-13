import java.util.*;
class Sub
{
	Scanner sc=new Scanner(System.in);
	String s_nm[]=new String[5];
	Sub()
	{
		int k=1;
		for(int i=0;i<s_nm.length;i++)
		{
			System.out.print("Enter Subject Name"+k+":");
			s_nm[i]=sc.nextLine();
			k++;
		}
	}
}
class Sub_Marks extends Sub
{
	int marks[]=new int[5];
	Sub_Marks()
	{
		int k=1;
		for(int i=0;i<marks.length;i++)
		{
			System.out.print("Enter"+s_nm[i]+"Marks ->"+k+":");
			marks[i]=sc.nextInt();
			k++;
		}
	}
}
class Result extends Sub_Marks
{
	int total=0,per;
	Result()
	{
		System.out.println("\t MCA SEM-2 RESULT \n");
		System.out.println("\t================================= \n");
		System.out.println("\tNo\t Subject Name \tMArks \n");
		System.out.println("\t================================= \n");
	}
	void display()
	{
		int k=1;
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("\t"+k+"\t"+s_nm[i]+"\t\t"+marks[i]+"\n");
			total=total+marks[i];
			k++;
		}
		System.out.println("\t--------------------------------------\n");
		System.out.println("\t\t Total ->"+total+"\n");
		System.out.println("\t-------------------------------------- \n");
		System.out.println("\t\t Percentage ->"+(total/marks.length)+"\n");
		System.out.println("\t--------------------------------------- \n");
	}
}
class Mul1
{
	public static void main(String[] args) 
	{
		Result r=new Result();
		r.display();
	}
}
															