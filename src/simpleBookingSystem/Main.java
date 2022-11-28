package simpleBookingSystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws Exception {
        getConnection();
    }

    public static Connection getConnection() throws Exception{
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/store";
            String username = "root";
            String password = "root";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connected");
            return conn;
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

}