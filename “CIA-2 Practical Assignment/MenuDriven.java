import java.io.*;
import java.util.*;

class First {

    Scanner sc  = new Scanner(System.in);
    First()
    {
        // boolean exit = false;
        int choice = 0;
        while (choice !=5) {
            System.out.println("------------------ File Handling Menu ------------------ ");
            System.out.println("1. Create New File");
            System.out.println("2. Write to a File");
            System.out.println("3. Read From a File");
            System.out.println("4. Delete a File");
            System.out.println("5. Exit");
            System.out.println("----------------------------------------------- ");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            sc.nextLine(); 
            
            switch (choice) {
                case 1:
                    createNewFile();
                    break;
                case 2:
                    writeToFile();
                    break;
                case 3:
                    readFromFile();
                    break;
                case 4:
                    deleteFile();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                // case 5:
                //     exit = true;
                //     System.out.println("Exiting...");
                //     break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
        sc.close();
    }
    
    void createNewFile() {
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("-------------------------------------");
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error occurred while creating the file.");

        }
    }
    
    void writeToFile() {
           Scanner sc=new Scanner(System.in);
         System.out.print("Enter File Name :-");
 		String name =sc.nextLine();

 		 try{
            FileWriter fw = new FileWriter(name);
            System.err.print("Enter Content Which you enter in file :");
            String data = sc.nextLine();
            fw.write(data);
            fw.close();
            System.err.println("====================================================");
            System.err.println("Write Content in file Successfully..");
            System.err.println("====================================================");    
        }
        catch(IOException e){
            System.err.println(e);
        }
	}

    void readFromFile() {
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter File Name :-");
 		String name =sc.nextLine();

 		 try{
            FileReader fw = new FileReader(name);

            System.out.println("-------------------------------------");
            System.out.println("Contents of the file:");

           int i;
                while((i=fw.read())!=-1)
                {
                    System.out.print((char)i);
                }
                System.out.println("\n");

            fw.close();
            System.out.println("-------------------------------------");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        
    }
    void deleteFile() {
        File f=new File("Myfile.txt");
		System.out.println("-------------------------------------");
		 if (f.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file. Check if the file exists.");
        }
		System.out.println("-------------------------------------");
	}
}

public class MenuDriven {
    public static void main(String[] args) {
       First f = new First();
    }
}


