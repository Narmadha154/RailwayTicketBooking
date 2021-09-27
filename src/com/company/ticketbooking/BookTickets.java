package com.company.ticketbooking;

import java.util.List;

public class BookTickets {
    public static void bookTickets(Passenger acc){
      //  Tickets ticket=new Tickets();
          if(Tickets.availableWaitingList==0){
              System.out.println("No tickets available");
              return;
          }
          if(acc.getBerthPreference().equals("L")&&Tickets.availableLowerBerth>0||acc.getBerthPreference().equals("M")&&Tickets.availableMiddleBerth>0||
                  acc.getBerthPreference().equals("U")&&Tickets.availableUpperBerth>0){
              System.out.println("preferred berth available");
              if(acc.getBerthPreference().equals("L")){
                  System.out.println("lower berth given");
                  TicketBooker.bookTickets(acc,TicketBooker.lowerBerthPosition.get(0),"L");
              }
          }
    }
}
