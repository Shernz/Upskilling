package com.zoho.L3interviewPrep.cabApplication;

import java.util.Scanner;

public class CustomerServices {
    private static Scanner sc;
    private static Customer customer;
    public CustomerServices() {
        System.out.println("Are you can existing customer?\n 1. Yes \n 2. No");
        sc = new Scanner(System.in);
        if(sc.nextInt() == 2) register();
        login();
        service();
    }

    public static void login() {
        System.out.println("Enter your email: ");
        String email = sc.next();
        System.out.println("Enter your password");
        String password = sc.next();
        for(Customer cus : AdminPanel.customerRegistry) {
            if (cus.getUserName().equals(email) && cus.getPassword().equals(password))
                customer = cus;
        }
        if (customer != null) System.out.println("Successfully logged in");
    }

    public static void register() {
        customer = new Customer();
        System.out.println("Enter your email: ");
        customer.setUserName(sc.next());
        System.out.println("Enter a password: ");
        String password = sc.next();
        System.out.println("Confirm password: ");
        String confirm = sc.next();
        System.out.println("Enter your contact No: ");
        customer.setContactNo(sc.next());
        if (password == null) System.out.println("Invalid password");
        else {
            customer.setPassword(confirm);
            AdminPanel.customerRegistry.add(customer);
        }
    }

    private void service() {
        String mainMenu = "Dear customer,\n"+ "Please enter an option from the menu:\n" + "1. Book a cab\n2. Cancel a cab\n";
        System.out.println(mainMenu);
        int option = sc.nextInt();
        switch (option) {
            case 1: AdminPanel.book(customer);
                    break;

            case 2: AdminPanel.cancel(customer);
                    break;

        }
    }
}
