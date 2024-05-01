import java.sql.*;
import java.util.Scanner;

class Menu {
    String DB_URL = "jdbc:mysql://localhost:3306/my";
    String USERNAME = "root";
    String PASSWORD = "";
    Connection con;

    Menu() {
        try {
            con = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            if (con.isClosed()) {
                System.err.println("******************************************");
                System.err.println("Database Not Connected...");
                System.err.println("******************************************");
            } else {
                System.err.println("******************************************");
                System.err.println("Database Connected Successfully...");
                System.err.println("******************************************");
            }
        } catch (SQLException e) {
            System.err.println("******************************************");
            System.err.println("Invalid Path or Database Name...");
            System.err.println("******************************************");
            e.printStackTrace();
        }
    }

    void selectOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t---------------------MENU---------------------");
        System.out.println("\t1. Check Connection with Database");
        System.out.println("\t2. Create a Table");
        System.out.println("\t3. Insert Data into the Table");
        System.out.println("\t4. Show Data from the Table");
        System.out.println("\t5. Update Data");
        System.out.println("\t6. Delete Data");
        System.out.println("\t7. Exit");
        System.out.println("\t-----------------------------------------------");
        System.out.print("Enter Your Choice From Above Menu: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                checkConnection();
                break;
            case 2:
                createTable();
                break;
            case 3:
                insertData();
                break;
            case 4:
                showData();
                break;
            case 5:
                updateData();
                break;
            case 6:
                deleteData();
                break;
            case 7:
                System.out.println("******************************************");
                System.out.println("Good Bye!...");
                System.out.println("******************************************");
                try {
                    if (con != null) {
                        con.close();
                    }
                    sc.close(); // Close scanner
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                System.exit(0);
                break;
            default:
                System.out.println("******************************************");
                System.out.println("Please Enter Valid Choice...");
                System.out.println("******************************************");
                break;
        }
    }

    void checkConnection() {
        try {
            if (con.isClosed()) {
                System.err.println("******************************************");
                System.err.println("Database Not Connected...");
                System.err.println("******************************************");
            } else {
                System.err.println("******************************************");
                System.err.println("Database Connected Successfully...");
                System.err.println("******************************************");
            }
        } catch (SQLException e) {
            System.err.println("******************************************");
            System.err.println("Invalid Path or Database Name...");
            System.err.println("******************************************");
            e.printStackTrace();
        }
    }

    void createTable() {
        try (Statement stmt = con.createStatement()) {
            String query = "CREATE TABLE IF NOT EXISTS student (id INT(3) PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), city VARCHAR(255))";
            stmt.executeUpdate(query);
            System.out.println("******************************************");
            System.out.println("Table Created Successfully...");
            System.out.println("******************************************");
        } catch (SQLException e) {
            System.err.println("******************************************");
            System.err.println("Table Not Created...");
            System.err.println("******************************************");
            e.printStackTrace();
        }
    }

    void insertData() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Student City: ");
            String city = sc.nextLine();
            String query = "INSERT INTO student (name, city) VALUES ('"+name+"' , '"+city+"')";
            try (PreparedStatement pst = con.prepareStatement(query)) {
                pst.executeUpdate();
                System.out.println("******************************************");
                System.out.println("Data Inserted Successfully...");
                System.out.println("******************************************");
            }
        } catch (SQLException e) {
            System.err.println("******************************************");
            System.err.println("Data Not Inserted...");
            System.err.println("******************************************");
            e.printStackTrace();
        }
    }

    void showData() {
        try (Statement st = con.createStatement()) {
            String query = "SELECT * FROM student";
            ResultSet rs = st.executeQuery(query);
            System.err.println("\tId\t\tName\t\t\t\tCity");
            System.err.println("\t-----------------------------------------------------------");
            while (rs.next()) {
                System.err.println("\t" + rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t\t\t" + rs.getString(3));
            }
            System.err.println("\n\n");
        } catch (SQLException e) {
            System.err.println("******************************************");
            System.err.println("Data Not Found...");
            System.err.println("******************************************");
            e.printStackTrace();
        }
    }

    void updateData() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the ID of the student to update: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter the updated Student Name: ");
            String name = sc.nextLine();
            System.out.print("Enter the updated Student City: ");
            String city = sc.nextLine();

            String updateQuery = "UPDATE student SET name = '"+name+"', city = '"+city+"' WHERE id = '"+id+"'";
            try (PreparedStatement pst = con.prepareStatement(updateQuery)) {
                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("******************************************");
                    System.out.println("Record Updated Successfully...");
                    System.out.println("******************************************");
                } else {
                    System.out.println("******************************************");
                    System.out.println("Record Not Updated: No record found with ID " + id);
                    System.out.println("******************************************");
                }
            }
        } catch (SQLException e) {
            System.err.println("******************************************");
            System.err.println("Record Not Updated...");
            System.err.println("******************************************");
            e.printStackTrace();
        }
    }

    void deleteData() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the ID of the student to delete: ");
            int id = sc.nextInt();

            String deleteQuery = "DELETE FROM student WHERE id = '"+id+"'";
            try (PreparedStatement pst = con.prepareStatement(deleteQuery)) {
                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("******************************************");
                    System.out.println("Record with ID " + id + " deleted successfully.");
                    System.out.println("******************************************");
                } else {
                    System.out.println("******************************************");
                    System.out.println("No record found with ID " + id + ". No deletion performed.");
                    System.out.println("******************************************");
                }
            }
        } catch (SQLException e) {
            System.err.println("******************************************");
            System.err.println("Error occurred while deleting record.");
            System.err.println("******************************************");
            e.printStackTrace();
        }
    }
}

class db {
    public static void main(String[] args) {
        Menu menu = new Menu();
        while (true) {
            menu.selectOperation();
        }
    }
}
