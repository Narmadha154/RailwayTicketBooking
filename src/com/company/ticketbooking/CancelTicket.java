package com.company.ticketbooking;

public class CancelTicket {
    public static void cancelTicket(int passengerId){
        Passenger p=TicketBooker.passengers.get(passengerId);
        TicketBooker.passengers.remove(passengerId);
        TicketBooker.bookedTicketList.remove(passengerId);
        int bookedPosition=p.getNumber();
        System.out.println("--------cancelled successfully");
        if(p.getAllotted().equals("L")){
            Tickets.availableLowerBerth++;
            TicketBooker.lowerBerthPosition.add(bookedPosition);
        }
        else if(p.getAllotted().equals("M")){
            Tickets.availableMiddleBerth++;
            TicketBooker.middleBerthPosition.add(bookedPosition);
        }
        else if(p.getAllotted().equals("U")){
            Tickets.availableUpperBerth++;
            TicketBooker.upperBerthPosition.add(bookedPosition);
        }
        if(TicketBooker.racList.size()>0){
            Passenger racPass=TicketBooker.passengers.get(TicketBooker.racList.poll());
            int racPosition=racPass.getNumber();
            TicketBooker.racListPosition.add(racPosition);
            TicketBooker.racList.remove(racPass.passengerId);
            Tickets.availableRacTickets++;
            if(TicketBooker.waitingList.size()>0){
                Passenger waitPass=TicketBooker.passengers.get(TicketBooker.waitingList.poll());
                int wlPosition=waitPass.getNumber();
                TicketBooker.waitingListPosition.add(wlPosition);
                TicketBooker.waitingList.remove(waitPass.passengerId);
                waitPass.setNumber(wlPosition);
                waitPass.setAllotted("RAC");
                TicketBooker.racListPosition.remove(0);
                TicketBooker.racList.add(waitPass.passengerId);
                Tickets.availableWaitingList++;
                Tickets.availableRacTickets--;
            }
            BookTickets.bookTickets(racPass);
        }
    }
}
