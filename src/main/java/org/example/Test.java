package org.example;

// thread in java
public class Test {
    public static void main(String[] args) {

        TicketCounter ticketCounter=new TicketCounter();
        TicketBookingThread ticketBookingThread1=new TicketBookingThread(ticketCounter,"Azza",2);
        TicketBookingThread ticketBookingThread2=new TicketBookingThread(ticketCounter,"Fayrouz",2);

        Thread thread1=new Thread(ticketBookingThread1);
        Thread thread2=new Thread(ticketBookingThread2);

        thread1.start();
        thread2.start();


    }
}