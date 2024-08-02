package jdbc.app;

import java.sql.Connection;

import jdbc.db.DB;

public class Program {
    public static void main(String[] args){
        
        Connection conn = DB.connection();
        DB.closeConnection();
    }
}
