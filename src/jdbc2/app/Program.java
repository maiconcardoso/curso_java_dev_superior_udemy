package jdbc2.app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc2.db.DB;

public class Program {
    public static void main(String[] args){
        
        Connection conn = null;
        Statement st = null;
        ResultSet rs  = null;

        try {
            conn = DB.connection();
            st = conn.createStatement();
            rs = st.executeQuery("select * from department");
            while(rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("Name"));
            }            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatemet(st);
            DB.closeConnection();
        }
    }
}
