import java.sql.*;
import java.util.*;


public class ins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myblog", "root","");

            System.out.print("Enter Student Name : ");
            String sname = sc.nextLine();

            System.out.print("Enter Student city : ");
            String scity = sc.nextLine();

            System.out.print("Enter Student Phone Number : ");
            int  sphone = sc.nextInt();

            String ins = "insert into student (name, city ,phone) values ('"+sname+"', '"+scity+"' , '"+sphone+"')";

            PreparedStatement ps = conn.prepareStatement(ins);
            ps.executeUpdate();
            System.out.println("data inserted");
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
