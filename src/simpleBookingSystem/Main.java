package simpleBookingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) throws Exception {
        createTable();
    }

    public static void createTable() throws Exception{
        try {
            Connection con = getConnection();
//            PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXIST tablename (id int NOT NULL AUTO_INCREMENT, first VARCHAR(255), last VARCHAR(255), PRIMARY KEY(id))");
            PreparedStatement create = con.prepareStatement("CREATE DATABASE IF NOT exists tempdb");
            create.execute();
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Statement Executed");
        }
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