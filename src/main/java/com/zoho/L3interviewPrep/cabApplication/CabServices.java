package com.zoho.L3interviewPrep.cabApplication;

import java.util.Scanner;

public class CabServices {
    private static Scanner sc;
    private static Cab driver;

    public CabServices() {
        System.out.println("Are you can existing cab driver?\n 1. Yes \n 2. No");
        Scanner sc = new Scanner(System.in);
        if(sc.nextInt() == 2) register();
        login();
        service();
    }
    void init() {
        sc = new Scanner(System.in);
    }
    public void login() {
        System.out.println("Enter your email: ");
        String email = sc.next();
        System.out.println("Enter your password");
        String password = sc.next();
        for(Cab cus : AdminPanel.cabRegistry) {
            if (cus.getUserName().equals(email) && cus.getPassword().equals(password))
                driver = cus;
        }
        if (driver != null) System.out.println("Successfully logged in");
    }

    public void register() {
        driver = new Cab();
        System.out.println("Enter your email: ");
        driver.setUserName(sc.next());
        System.out.println("Enter a password: ");
        String password = sc.next();
        System.out.println("Confirm password: ");
        String confirm = sc.next();
        System.out.println("Enter your base location: ");
        driver.setLocation(sc.next());
        System.out.println("Enter your contact no: ");
        driver.setPhoneNumber(sc.next());
        if (password == null) System.out.println("Invalid password");
        else {
            driver.setPassword(confirm);
            AdminPanel.cabRegistry.add(driver);
        }
    }

    public static void intimateDriver(String message) {
        System.out.println("Dear driver, \n You have one new notification" + message);
    }

    public void service() {
        String menu = "Hello driver! Please choose an option from the below menu\n" +
                "1. Update your location" +
                "2. Exit";
        System.out.println(menu);
        if (sc.nextInt() == 1) {
            System.out.println("Enter your current location");
            updateLocation(sc.next());
        }
    }

    private void updateLocation(String currentLocation) {
        String previousLocation = driver.getLocation();
        driver.setLocation(currentLocation);
        AdminPanel.updateLocation(previousLocation, currentLocation, driver);
    }
}
