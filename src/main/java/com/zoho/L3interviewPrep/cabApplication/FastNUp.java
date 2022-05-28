package com.zoho.L3interviewPrep.cabApplication;

import java.util.Scanner;

/**
 * Cab app. Given cabs customers (location, distance from origin) initial cab location. Customer should have login and register. Cab should have login. Admin login.
 * Customer booking cab. Choose source destination. Find closest cab and confirm.
 * Cab selection. Cab driver one trip rest mandatory. Same source multiple cabs = cab with least trips completed.
 * Maintain trip history for customers and cab. Source destinations cab/cust fare
 * Admin panel. Register cab. Add/remove location. All customers Trip summary. All cab trip summary.
 */

public class FastNUp {
    public static void main(String args[]) {
        String welcomeMessage = "---------------------------------WELCOME TO FASTnUP--------------------------------------------\n";
        String mainMenu = "Please enter an option from the menu that suits your need: \n" +
                "1. If you're a customer\n2. If you're a cab driver\n3. If you're the admin\n4.To exit\nEnter an option: ";
        Scanner sc = new Scanner(System.in);
        System.out.println(welcomeMessage + mainMenu);
        int option = sc.nextInt();
        while (option != 4) {
            switch (option) {
                case 1 : CustomerServices service = new CustomerServices();
                    break;
                case 2 : CabServices cabServices = new CabServices();
                    break;
                case 3 : AdminPanel admin = new AdminPanel();
                    break;
                default: System.out.println("Invalid option" + mainMenu);
            }
            System.out.println("Anything else we can assist you with?");
            String answer = sc.next();
            System.out.println(answer.equalsIgnoreCase("Yes") ? mainMenu : "Thank you for your patience");
        }
    }
}
