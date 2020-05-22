package com.company;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public static void main(String args[])throws Exception{
        Class.forName("com.mysql.cj.jdbc.JdbcConnection");
        String url = "jdbc:mysql://localhost:3306/studentDatabase?serverTimezone=CST";
        String username = "root";
        String password = "sweta1234";
        Connection con = DriverManager.getConnection(url, username, password);

        if(con != null)
            System.out.println("Connection Successful");

        Statement st = con.createStatement();
        System.out.println("Values");

//        int x= st.executeUpdate("insert into student values(1003, 'Harry')");
//        int y= st.executeUpdate("insert into student values(1004, 'Jolly')");
//        System.out.println("Values inserted");

//        ResultSet result = st.executeQuery("Select * from student");
//        System.out.println("Student Database");
//        while(result.next()){
//            String table = result.getString("studentID");
//            String name =  result.getString("name");
//            System.out.println(table);
//            System.out.println(name);
//
//        int update = st.executeUpdate("update student set name='Jane' where studentID = 1002");
//
//        if (update != 0){
//            System.out.println("Table Updated");
//        }


//        int x= st.executeUpdate("delete from student where studentID=1003");
//        if(x != 0)
//            System.out.println("Deleted");



    }

}
