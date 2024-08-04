package jdbc3.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import jdbc3.db.DB;

public class Program {
    public static void main(String[] args){

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = DB.connection();
            pst = conn.prepareStatement(
                "INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId)" 
              + " VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS
            );
        pst.setString(1, "Carl Purple");
        pst.setString(2, "carl@gmail.com");
        pst.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
        pst.setDouble(4, 3000.00);
        pst.setInt(5, 4);

        int rowsAffected = pst.executeUpdate();

        if (rowsAffected > 0) {
            ResultSet rs = pst.getGeneratedKeys();
            while (rs.next()) {
                int id = rs.getInt(1);
                System.out.println("Done! Id = " + id);
            }
        } else {
            System.out.println("No rows affected!");
        }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch(ParseException e) {
            System.out.println(e.getMessage());
        } finally {
            DB.closeStatemet(pst);
            DB.closeConnection();
        }
    }
}
