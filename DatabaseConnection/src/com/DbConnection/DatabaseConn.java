package com.DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class DatabaseConn {
    public Connection con;
    public DatabaseConn() throws Exception {
        Class.forName("com.mysql.cj.jdbc.JdbcConnection");
        String url = "jdbc:mysql://localhost:3306/studentDatabase?serverTimezone=CST";
        String username = "root";
        String password = "sweta1234";
        con = DriverManager.getConnection(url, username, password);

        if (con != null)
            System.out.println("Connection Successful");

    }

}
