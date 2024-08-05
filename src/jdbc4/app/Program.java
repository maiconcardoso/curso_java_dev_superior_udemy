package jdbc4.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc2.db.DB;

public class Program {
    public static void main(String[] args){

        Connection conn = null;
        PreparedStatement pst = null;

        try {

            String sql = "UPDATE seller SET BaseSalary = BaseSalary + ? WHERE (DepartmentId = ?)";

            conn = DB.connection();
            pst = conn.prepareStatement(sql);

            pst.setDouble(1, 200.0);
            pst.setInt(2, 2);

            int rowsAffected = pst.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
            
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
