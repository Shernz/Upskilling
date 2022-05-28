package com.zoho.L3interviewPrep.cabApplication;

import java.util.*;

public class AdminPanel {
    public static List<Customer> customerRegistry = new ArrayList<>();
    public static List<Cab> cabRegistry = new ArrayList<>();
    public static List<String> location = new ArrayList<>();
    public static Map<String, List<Cab>> cabCountInLocation = new HashMap<>();
    public static Scanner sc = new Scanner(System.in);;
    private static String userName = "Admin";
    private static String password = "Password";

    public AdminPanel() {
        location.addAll(List.of("KODAMBAKKAM", "WESTMAMBALAM", "TAMBARAM", "MEENABAKKAM", "NUNGAMBAKKAM", "MYLAPORE"));
        generateCabCountInLocation();
        login();
        service();
    }

    public void service() {
        String menu = "Please enter an option\n1. Customer's trip summary\n2. Add or remove location";
        System.out.println(menu);
        if (sc.nextInt() == 1) customersTripSummary();
    }

    public static void book(Customer customer) {
        CustomerTrip trip = new CustomerTrip();
        System.out.println("Enter your current location: ");
        trip.setSource(sc.next());
        System.out.println("Enter your destination location: ");
        trip.setDestination(sc.next());
        assignCab(trip);
        Cab cab = trip.getCab();
        String bookingConfirmation = "Your cab is booked successfully! Please find the details below:\n" +
                "Cab owner: " + cab.getOwner() + "\nContact No: " + cab.getPhoneNumber();
        System.out.println(bookingConfirmation);
        String driverIntimation = "Your cab has been booked by " + customer.getName() + " please find the additional details below:\n" +
                "Customer contact no: " + customer.getContactNo() +
                "Current location of the customer: " + trip.getSource();
        CabServices.intimateDriver(driverIntimation);
    }

    private static void assignCab(CustomerTrip trip) {
        for(Cab cab : cabCountInLocation.get(trip.getSource())) {
            if (cab.getNoOfTrips() < 2) {
                trip.setCab(cab);
                trip.setStatus("BOOKED");
            }
        }
    }

    public static void cancel(Customer customer) {
        CustomerTrip lastTrip = customer.getTrips().get(customer.getTrips().size() - 1);
        if (lastTrip.getStatus().equals("BOOKED")) {
            System.out.println("Dear customer your trip is cancelled");
            lastTrip.setStatus("CANCELLED");
        } else {
            System.out.println("Dear customer your trip is either cancelled or completed");
        }
    }

    private void login() {
        System.out.println("Please enter your username: ");
        String userName = sc.next();
        System.out.println("Please enter your password");
        String password = sc.next();
        if (userName.equals(this.userName) && password.equals(this.password)) System.out.println("Welcome aboard Admin!");
        else System.out.println("Either user name or password is incorrect please check!");
    }

    public void generateCabCountInLocation() {
        for(String place : location) {
            for(Cab cab : cabRegistry) {
                if (cab.getLocation().equals(place)) {
                    if (cabCountInLocation.containsKey(place)) cabCountInLocation.put(place, new ArrayList<>());
                    cabCountInLocation.get(place).add(cab);
                }
            }
        }
    }

    public static void updateLocation(String previousLocation, String currentLocation, Cab driver) {
        driver.getTrips().get(driver.getTrips().size() - 1).setStatus("COMPLETED");
        driver.setNoOfTrips(driver.getNoOfTrips() + 1);
        cabCountInLocation.get(currentLocation).add(driver);
        cabCountInLocation.get(previousLocation).remove(driver);
    }

    public static String customersTripSummary() {
        System.out.println("Who's trip summary would you like to view? \n1. Customer\n2. Driver");
        int option = sc.nextInt();
        StringBuilder summary = new StringBuilder();
        if (option == 1) {
            System.out.println("Enter customer email: ");
            String customerEmail = sc.next();
            Customer customer = new Customer();
            for(Customer cust : customerRegistry) {
                if (customerEmail.equals(customer.getUserName())) {
                    customer = cust;
                }
            }
            summary.append("Customer ride summary: ");
            for(CustomerTrip trip : customer.getTrips()) {
                summary.append("Source: " + trip.getSource() + " Destination: " + trip.getDestination() + " Cab Details: \n"
                        + "Owner: " + trip.getCab().getOwner() + " Contact no: " + trip.getCab().getPhoneNumber());
            }
        } else {
            summary.append("Cab ride summary: ");
            System.out.println("Enter driver email: ");
            String driverEmail = sc.next();
            Cab driver = new Cab();
            for(Cab cab : cabRegistry) {
                if (driverEmail.equals(cab.getUserName())) {
                    driver = cab;
                }
            }
            for(CustomerTrip trip : driver.getTrips()) {
                summary.append("Source: " + trip.getSource() + " Destination: " + trip.getDestination());
            }
        }
        return summary.toString();
    }
}
