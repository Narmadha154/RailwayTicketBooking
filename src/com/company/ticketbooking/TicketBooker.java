package com.company.ticketbooking;

import java.util.*;

public class TicketBooker{
     static Queue<Integer> waitingList=new LinkedList<>();
     static Queue<Integer> racList=new LinkedList<>();
     static List<Integer> bookedTicketList=new ArrayList<>();
     static List<Integer> lowerBerthPosition=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21));
     static List<Integer> middleBerthPosition=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21));
     static List<Integer> upperBerthPosition=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21));
     static List<Integer> racListPosition=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18));
     static List<Integer> waitingListPosition=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
     static Map<Integer,Passenger> passengers=new HashMap<>();
     public static void bookTickets(Passenger p, int berthInfo, String allottedBerth){
         p.setNumber(berthInfo);
         p.setAllotted(allottedBerth);
         passengers.put(p.passengerId,p);
         bookedTicketList.add(p.passengerId);
         System.out.println("-----------------Booked successfully");
     }
     public static void addToRac(Passenger p,int racInfo,String allottedBerth){
         p.setNumber(racInfo);
         p.setAllotted(allottedBerth);
         passengers.put(p.passengerId,p);
         racList.add(p.passengerId);
         System.out.println("---------------added to rac successfully");
     }
    public static void addToWaitingList(Passenger p,int waitingListInfo,String allottedBerth){
        p.setNumber(waitingListInfo);
        p.setAllotted(allottedBerth);
        passengers.put(p.passengerId,p);
        waitingList.add(p.passengerId);
        System.out.println("------------added to waiting list successfully");
    }
}
