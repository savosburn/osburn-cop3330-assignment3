/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Savannah Osburn
 */

package oop.assignment3.ex44;

import java.io.IOException;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        App myApp = new App();
        JSONParser jParser = new JSONParser();

        // Prompt user for input until the program finds a match
        String outcome;
        do {
            String productName = myApp.productName();
            outcome = jParser.jsonReader(productName);
            System.out.print(outcome);
        } while(outcome.equals(jParser.notEqual()));
    }

    // Ask user for input
    public String productName() {
        System.out.print("What is the product name? ");
        return in.nextLine();
    }
}