import java.sql.*;

public class Inst_data {
    
    public static void main(String[] args) {
        try {
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myblog", "root","");
            String ins = "insert into student (name, city ,phone) values ('rahul', 'jamanagr', '926561429')";

            PreparedStatement ps = conn.prepareStatement(ins);
            ps.executeUpdate();
            System.out.println("data inserted");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
