package com.zoho.L3interviewPrep.cabApplication;

import java.util.List;

public class Customer {
    private String userName;
    private String password;
    private String name;
    private String contactNo;
    private List<CustomerTrip> trips;

    public List<CustomerTrip> getTrips() {
        return trips;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setTrips(CustomerTrip trip) {
        this.trips.add(trip);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
