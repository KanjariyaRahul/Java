import java.io.*;
import java.util.*;
class File_Name
{
	File_Name()
	{
		File f=new File("Class-A.txt");
		System.out.println("-------------------------------------");
		System.out.println("File Name is:"+f.getName());
		System.out.println("-------------------------------------");
	}
}
class Menu
{
	Menu()
	{
		System.out.println("-----------File-Menu------------------");
		System.out.println("1.File Name");
		System.out.println("2.File Path");
		System.out.println("3.File Can-Read");
		System.out.println("4.File Can-Write");
		System.out.println("5.Delete");
		System.out.println("6.Exit");
		System.out.println("-------------------------------------");
	}
}
class Case_perform
{
	Scanner sc=new Scanner(System.in);
	int choice;
	Case_perform()
	{
		System.out.print("Enter Above Choice.....:->");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				new File_Name();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Please Enter above Menu.....");

		}
	}
}
class File_menu
{
	public static void main(String[] args) 
	{
		while(true)
		{
			Menu m=new Menu();
			Case_perform cp=new Case_perform();
		}
	}
}