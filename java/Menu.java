// Accept the user input ; allow user to choose from the following options and perform
// the task as per user’s choice. i). Create file  , ii). file name, iii).
// file path , iv).file length , v). file delete , 6) exit  in java using switch statement

import java.io.*;
import java.util.Scanner;

class First {

    Scanner sc  = new Scanner(System.in);
    First()
    {
        boolean exit = false;
        
        while (!exit) {
            System.out.println("Choose an option:");
            System.out.println("1. Create file");
            System.out.println("2. File name");
            System.out.println("3. File path");
            System.out.println("4. File length");
            System.out.println("5. File delete");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); 
            
            switch (choice) {
                case 1:
                    createFile();
                    break;
                case 2:
                    getFileName();
                    break;
                case 3:
                    getFilePath();
                    break;
                case 4:
                    getFileLength();
                    break;
                case 5:
                    deleteFile();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
        sc.close();
    }
    
    private void createFile() {
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error occurred while creating the file.");

        }
    }
    
    private void getFileName() {
        // System.out.print("Enter file path: ");
        // String filePath = sc.nextLine();
        File file = new File("D:\\rahul\\java\\rahul.txt");
        System.out.println("File name: " + file.getName());
    }
    
    private void getFilePath() {
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        System.out.println("File path: " + file.getAbsolutePath());
    }
    
    private void getFileLength() {
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        System.out.println("File length: " + file.length() + " bytes");
    }
    
    private void deleteFile() {
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file. Check if the file exists.");
        }
    }
}
public class Menu {
    public static void main(String[] args) {
       First f = new First();
    }
}



