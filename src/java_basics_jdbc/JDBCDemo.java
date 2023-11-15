package java_basics_jdbc;

import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) throws SQLException {

        String URL = "jdbc:mysql://127.0.0.1:3306/employees_database";
        String USER = "admin";
        String PASSWORD = "system123";

        // establish connection object
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        // create a statement object to send to the database
        Statement statement = connection.createStatement();
        //execute the statement object
        ResultSet resultSet = statement.executeQuery("select * from employee_tbl");

        //process the result
        int salaryTotal = 0;
        while (resultSet.next()) {
            salaryTotal = salaryTotal + resultSet.getInt("salary");
            //System.out.println(resultSet.getString("name"));
            //System.out.println(resultSet.getInt("salary"));
        }

        System.out.println(salaryTotal);


    }
}
