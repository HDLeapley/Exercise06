package com.leapley.Week6;

import java.util.Scanner;

/*
Hudson Leapley 2/19/2019
Each of these methods should prompt the user for input using the specified message
and return the a String, int, or double, depending on the method. The methods should
catch any exceptions due to bad input and continue to prompt the user for input until
valid input is supplied.
 */
public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static String promptString(){ //Prompt for string
        boolean validInput = false;
        String input = "";
        do {
            try {
                System.out.println("Enter a string:");
                input = scan.nextLine();
                Double.parseDouble(input);
                validInput = false;
            } catch(Exception e){ //IF ERROR THAT MEANS IT IS A STRING NOT A NUMBER
                validInput = true;
            }
        }while(!validInput);
        return input;
    }

    public static int promptInt(){ //Prompt for int
        boolean validInput = false;
        int input = 0;
        do {
            try {
                System.out.println("Enter an integer:");
                input = scan.nextInt();
                scan.nextLine();
                validInput = true;
            } catch(Exception e){ //IF IT ERRORS ITS NOT AN INTEGER
                scan.nextLine();
                System.out.println("Input invalid.");
            }
        }while(!validInput);
        return input;
    }

    public static double promptDouble(){ //Prompt for double
        boolean validInput = false;
        double input = 0.0;
        do {
            try {
                System.out.println("Enter a double:");
                input = scan.nextDouble();
                scan.nextLine();
                validInput = true;
            } catch(Exception e){ //IF IT ERRORS IT IS NOT A DOUBLE
                scan.nextLine();
                System.out.println("Input invalid.");
            }
        }while(!validInput);
        return input;
    }

    public static void main(String[] args) {
	    String str = promptString();
	    int i = promptInt();
	    double d = promptDouble();
    }
}
