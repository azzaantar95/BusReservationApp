package org.example;


public class TicketBookingThread implements Runnable {

    private TicketCounter ticketCounter;
    private String passengerName;
    private int numberOfSeats;

    public TicketBookingThread(TicketCounter ticketCounter, String passengerName, int numberOfSeats) {
        this.ticketCounter = ticketCounter;
        this.passengerName = passengerName;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void run() {
        ticketCounter.bookTicket(passengerName,numberOfSeats);
    }
}
