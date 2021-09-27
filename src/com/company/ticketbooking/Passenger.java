package com.company.ticketbooking;

public class Passenger {
    static int passengerId=0;
    private String name;
    private int age;
    private String gender;
    private String berthPreference;
    private String allotted;
    private int number;



    public Passenger(){
         passengerId +=1;
         allotted="";
         number=-1;
    }

    public String getAllotted() {
        return allotted;
    }

    public void setAllotted(String allotted) {
        this.allotted = allotted;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static int getPassengerId() {
        return passengerId;
    }

    public static void setPassengerId(int passengerId) {
        Passenger.passengerId = passengerId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getBerthPreference() {
        return berthPreference;
    }
    public void setBerthPreference(String berthPreference) {
        this.berthPreference = berthPreference;
    }
}
