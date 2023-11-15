package java_basics_jdbc;

import java.sql.*;

public class JDBCDemo2 {

    public static void main(String[] args) {

        String URL = "jdbc:mysql://127.0.0.1:3306/employees_database";
        String USER = "admin";
        String PASSWORD = "system123";
        int rowsAffected;

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);) {

            Statement statement = connection.createStatement();
            rowsAffected =  statement.executeUpdate("DELETE FROM employee_tbl WHERE id=900");
            //rowsAffected = statement.executeUpdate("insert into employee_tbl (id,name,dept,salary) " +
           // "values (1000,'Robert','Technology', 8500);");
            System.out.println("Executed a DELETE statement. Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
