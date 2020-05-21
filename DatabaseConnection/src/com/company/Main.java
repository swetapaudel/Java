package com.company;

import com.DbConnection.DatabaseConn;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws Exception{
	 DatabaseConn db = new DatabaseConn();

	 Statement st = db.con.createStatement();

        ResultSet result = st.executeQuery("Select * from student");
        System.out.println("Student Database");
        while(result.next()) {
            String table = result.getString("studentID");
            String name = result.getString("name");
            System.out.println(table);
            System.out.println(name);
        }

    }
}
