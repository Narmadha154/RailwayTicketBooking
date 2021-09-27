package com.company.ticketbooking;

public class Tickets {
    private String berth;
    static int availableLowerBerth=1;
    static int availableUpperBerth=1;
    static int availableMiddleBerth=1;
    static int availableRacTickets=1;
    static int availableWaitingList=1;

    public String getBerth() {
        return berth;
    }

    public void setBerth(String berth) {
        this.berth = berth;
    }

    public static int getAvailableLowerBerth() {
        return availableLowerBerth;
    }

    public static void setAvailableLowerBerth(int availableLowerBerth) {
        Tickets.availableLowerBerth = availableLowerBerth;
    }

    public static int getAvailableUpperBerth() {
        return availableUpperBerth;
    }

    public static void setAvailableUpperBerth(int availableUpperBerth) {
        Tickets.availableUpperBerth = availableUpperBerth;
    }

    public static int getAvailableMiddleBerth() {
        return availableMiddleBerth;
    }

    public static void setAvailableMiddleBerth(int availableMiddleBerth) {
        Tickets.availableMiddleBerth = availableMiddleBerth;
    }

    public static int getAvailableRacTickets() {
        return availableRacTickets;
    }

    public static void setAvailableRacTickets(int availableRacTickets) {
        Tickets.availableRacTickets = availableRacTickets;
    }

    public static int getAvailableWaitingList() {
        return availableWaitingList;
    }

    public static void setAvailableWaitingList(int availableWaitingList) {
        Tickets.availableWaitingList = availableWaitingList;
    }
}
