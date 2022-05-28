package com.zoho.L3interviewPrep.cabApplication;

import java.util.List;

public class Cab {
    private String location;
    private String owner;
    private String phoneNumber;
    private Integer noOfTrips;
    private String userName;
    private String password;
    private List<CustomerTrip> trips;

    public List<CustomerTrip> getTrips() {
        return trips;
    }

    public void setTrips(CustomerTrip trip) {
        this.trips.add(trip);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getNoOfTrips() {
        return noOfTrips;
    }

    public void setNoOfTrips(Integer noOfTrips) {
        this.noOfTrips = noOfTrips;
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
