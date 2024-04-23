import java.sql.*;

public class Display {
    public static void main(String[] args) {
      
        try {
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myblog", "root","");
            

            PreparedStatement ps = conn.prepareStatement(ins);
            ps.executeUpdate();
            System.out.println("data inserted");
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
