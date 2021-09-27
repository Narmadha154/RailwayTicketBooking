package com.company.ticketbooking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Passenger> list=new ArrayList<>();
	   Scanner sc=new Scanner(System.in);
       while(true){
           System.out.println("--------Railway Ticket Booking System----------");
           System.out.println("1) Book");
           System.out.println("2) Cancel");
           System.out.println("3) Print booked tickets");
           System.out.println("4) Print available tickets");
           System.out.println("5) Exit");
           System.out.println("Enter your choice");
           int choice=sc.nextInt();
           switch(choice){
               case 1:
                   System.out.println("Enter the no.of tickets you want to book:");
                   int number=sc.nextInt();
                   for(int i=1;i<=number;i++) {
                       System.out.println("Enter your name:");
                       String name = sc.nextLine();
                       System.out.println("Enter your age:");
                       int age = sc.nextInt();
                       System.out.println("Enter your gender:");
                       String gender = sc.next();
                       System.out.println("Enter your berth preference:");
                       String berthPreference = sc.nextLine();
                       Passenger acc = new Passenger();
                       acc.setName(name);
                       acc.setAge(age);
                       acc.setGender(gender);
                       acc.setBerthPreference(berthPreference);
                       BookTickets.bookTickets(acc);
                   }
                  // BookTickets.bookTickets(acc);
                   break;
               case 2:
                   break;
               case 5:
                   return;
           }
       }
    }
}
