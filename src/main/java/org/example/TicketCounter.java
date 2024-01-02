package org.example;

public class TicketCounter {


    public int availableSets = 3;

    public synchronized void bookTicket(String name, int numberOfSeats) {

        if ((availableSets >= numberOfSeats) && (numberOfSeats > 0)) {

            System.out.println("Hello  " + name + numberOfSeats + " are booked successfully");
            availableSets = availableSets - numberOfSeats;
        } else {
            System.out.println("hi " + name + " Sorry seats are available ");
        }
    }
}
