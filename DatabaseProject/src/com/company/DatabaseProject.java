package com.company;

import java.sql.*;
import java.util.Scanner;


public class DatabaseProject {
    public Connection con;
    public int employeeId;
    public String name;
    public String dept;
    Scanner sc = new Scanner(System.in);
    public DatabaseProject()throws Exception{
        Class.forName("com.mysql.cj.jdbc.JdbcConnection");
        String url = "jdbc:mysql://localhost:3306/Project?serverTimezone=CST";
        String username = "root";
        String password = "sweta1234";
        con = DriverManager.getConnection(url, username, password);

        if(con != null)
            System.out.println("Connection Successful");

    }


    public void choices()throws Exception{

        System.out.println("Please select one of the option");
        System.out.println("1.Insert 2.Display 3.Delete 4.Update");
        int choice = sc.nextInt();
        Statement st = con.createStatement();

        switch (choice){
            case 1:
                System.out.println("Please select one of the option");
                System.out.println("1. All columns 2.Particular Column");
                int values = sc.nextInt();
                PreparedStatement p = null;
                switch (values){
                    case 1:
                        String query = "INSERT INTO msstate(employeeId, name, dept)" + "VALUES(?, ?, ?)";
                        insert(sc);
                        p = con.prepareStatement(query);
                        p.setInt(1, employeeId);
                        p.setString(2, name);
                        p.setString(3, dept);
                        int x = p.executeUpdate();
                        if (x > 0)
                            System.out.println("Record Inserted");
                        break;

                    default:
                        System.out.println("Please select a Valid option");
                        break;
                }
                break;
            case 2:
                System.out.println("Please select one of the option");
                System.out.println("1. Display All columns  2.Particular Column");
                int values2 = sc.nextInt();
                switch (values2){
                    case 1:
                        String query = "Select * from msstate";
                        ResultSet result = st.executeQuery(query);
                        while (result.next()){
                            String empid = result.getString("employeeId");
                            String name = result.getString("name");
                            String dept = result.getString("dept");
                            System.out.println(empid + " " + name + " " + dept);
                        }
                        break;

                    case 2:
                        System.out.println("Please enter the employeeId");
                        int empID = sc.nextInt();
                        String query2 = "Select * from msstate where employeeId ='"+empID+"'";
                        ResultSet result2 = st.executeQuery(query2);
                        //System.out.println("Run");
                        if(result2.next()){
                            String eId= result2.getString("employeeId");
                            String name1 = result2.getString("name");
                            String dept1 = result2.getString("dept");
                            System.out.println(eId + " " + name1 + " " + dept1);
                        }
                        else{
                            System.out.println("Not found");
                        }
                        break;

                    default:
                        System.out.println("Please select a valid option");
                        break;
                }
                break;
            case 3:
                System.out.println("Please select one of the option");
                System.out.println("1.Delete All rows  2.Delete Particular Column");
                int values3 = sc.nextInt();
                switch (values3){
                    case 1:
                        String query3 = "DELETE FROM msstate";
                        st.executeUpdate(query3);
                        System.out.println("Table empty");
                        break;
                    case 2:
                        System.out.println("Please enter the employeeId");
                        int empID = sc.nextInt();
                        String query2 = "DELETE from msstate where employeeId ='"+empID+"'";
                        int x = st.executeUpdate(query2);

                        if(x > 0){
                            System.out.println("Successfully Deleted");
                        }
                        else{
                            System.out.println("Not found");
                        }
                        break;

                    default:
                        System.out.println("Please select a valid option");
                        break;
                }
                break;
            case 4:
                System.out.println("Please select one of the option");
                System.out.println("1.Update Name  2.Update Department");
                int values4 = sc.nextInt();
                switch (values4){
                    case 1:
                        System.out.println("Please enter the employeeId to update name");
                        int eID = sc.nextInt();
                        System.out.println("Please enter the name");
                        String name= sc.next();
                        String query2 = "UPDATE msstate set name='"+name+"' where employeeId='"+eID+"'";
                        int x = st.executeUpdate(query2);

                        if(x > 0 ){
                            System.out.println("Successfully Updated");
                        }
                        else{
                            System.out.println("Not found");
                        }
                        break;

                    case 2:
                        System.out.println("Please enter the employeeId to update Department");
                        int ID = sc.nextInt();
                        System.out.println("Please enter the Dept");
                        String dept= sc.next();
                        String query4 = "UPDATE msstate set dept='"+dept+"' where employeeId='"+ID+"'";
                        int y = st.executeUpdate(query4);

                        if(y > 0 ){
                            System.out.println("Successfully Updated");
                        }
                        else{
                            System.out.println("Not found");
                        }
                        break;
                    default:
                        System.out.println("Please select a valid option");
                }
                break;
            default:
                System.out.println("Please select a valid option");
                break;

        }

    }

    public void insert(Scanner sc){
        System.out.println("Enter employeeID");
        employeeId = sc.nextInt();
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter Dept");
        dept = sc.next();

    }
}
