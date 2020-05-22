package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception {
        DatabaseProject db = new DatabaseProject();
        String option;
        do{
            db.choices();
            System.out.println("Do you wnat to continue(y/n)");
            Scanner sc = new Scanner(System.in);
            option = sc.next();
        }while(option.equals("y"));



    }
}
