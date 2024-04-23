import java.sql.*;
public class Con1 {
    public static void main(String[] args) {
        try{

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myblog", "root", "");
            if(con.isClosed())
            {
                System.out.println("Database Not Connected Successfully...");
            }
            else{
                System.out.println("Database Connected Successfully..."); 
            }
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}