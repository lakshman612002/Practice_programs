package Dsa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Basics {

    static void conditionalStatements() {
        System.out.print("enter your marsk:\t");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks < 35) {
            System.out.println("fail");
        } else if (marks < 50) {
            System.out.println("3rd class");
        } else if (marks < 80) {
            System.out.println("2nd class");
        } else if (marks < 100) {
            System.out.println("1st class");
        } else {
            System.out.println("given input appropriate");
        }
    }

    static void dataTypes() throws Exception {
        System.out.print("enter any value you want:\t");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();

        if (isInteger(st)) {
            System.out.println("data type is:Integer");
        } else if (isFloat(st)) {
            System.out.println("data type is:Float");
        } else if (st.equalsIgnoreCase("true") || st.equalsIgnoreCase("false")) {
            System.out.println("date type is:Boolean");
        } else if (st.length() == 1) {
            System.out.println("data type is:Character");
        } else {
            System.out.println("data type is:String");
        }

    }

    static boolean isInteger(String st) {
        try {
            Integer.parseInt(st);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static boolean isFloat(String st) {
        try {
            Float.parseFloat(st);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static void basicInputs() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter your name:\t");
        String name = br.readLine();
        System.out.println("your name is :" + name);
    }

    public static void main(String[] args) throws Exception {
        // basicInputs();
        // dataTypes();
        conditionalStatements();

    }
}
