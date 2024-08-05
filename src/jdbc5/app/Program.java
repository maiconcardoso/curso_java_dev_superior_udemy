package jdbc5.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc5.db.DB;
import jdbc5.db.DbIntegrityException;

public class Program {
    public static void main(String[] args){

      Connection conn = null;
      PreparedStatement pst = null;

      try {
        String sql = "DELETE FROM department WHERE id = ?";

        conn = DB.connection();
        pst = conn.prepareStatement(sql);

        pst.setInt(1, 2);

        int rowsAffected = pst.executeUpdate();

        System.out.println("Done! Rows affected: " + rowsAffected);

      } catch (SQLException e) {
        throw new DbIntegrityException(e.getMessage());
      } finally {
        DB.closeStatemet(pst);
        DB.closeConnection();
      }
    }
}
